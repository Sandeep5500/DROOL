package drool;

import java.util.*;

import drool.AST.formal;

class ClassNode {
    public String name;
    public String parent;
    public int height;
    public HashMap<String, AST.attr> attributes ;
    public HashMap<String, AST.method> methods ;

    ClassNode(String class_name,  String  class_parent, int  class_height, HashMap<String, AST.attr> class_atributes ,  HashMap<String,  AST.method> class_methods) {
        attributes = new HashMap<String, AST.attr>();
        methods = new HashMap<String, AST.method> ();
        name  = class_name;
        parent  = class_parent;
        height  = class_height;

        attributes.putAll(class_atributes);
        methods.putAll(class_methods);
    }
}

public class Semantic {
    private Boolean errorFlag = false;
    public void reportError(String filename, int lineNo, String error) {
        errorFlag = true;
        System.err.println(filename + ":" + lineNo + ": " + error);
    }

    public Boolean getErrorFlag() {
        return errorFlag;
    }

    
    int condiii = 0;
    
    // Scope Table to manage scope of attributes
    private ScopeTable<AST.attr> scope = new ScopeTable<AST.attr>();

    // Hashmap containing all the classes
    public HashMap<String, ClassNode> classList = new HashMap<String, ClassNode>();
    private String filename;

    //SEMANTIC ANALYSIS BEGINS
    //Takes the argument of type AST.program
    public Semantic(AST.program program) {

        // adds basic classes to the class list
        addBuiltInClasses();

        // process the entire program and fills classList with the help of few functions
        GraphHandler(program.classes);
        int i = 0 ;
        while (i < (program.classes).size()) {
	    
            filename = ((program.classes).get(i)).filename; // each class has a file name

            scope.enterScope(); // entering new scope
            
            String name = ((program.classes).get(i)).name;
            AST.no_expr b = new AST.no_expr(((program.classes).get(i)).lineNo); 
            int lNo = ((program.classes).get(i)).lineNo;
            AST.attr a = new AST.attr("self", name , b , lNo );
            scope.insert("self", a );     //in the class self is availaible as an attribuite

            String Name = ((program.classes).get(i)).name;
            scope.insertAll(classList.get(Name).attributes);

            visit_class((program.classes).get(i));

            scope.exitScope(); // exiting scope after class is processed
            i++;
        }

        

	// Check is there a Main class
        if (classList.containsKey("Main") == false) {
            reportError(filename, 1, "Program does not contain class 'Main'");
        } 
	


    //function for incorporating built-in data types
    private void addBuiltInClasses() {
       
        // contains Object, String, Input/output methods, graph and matrices

        List<HashMap<String,AST.method>> basicClassMethods = new ArrayList<HashMap<String,AST.method> >(); 
        basicClassMethods.add(new HashMap<String, AST.method>());
        basicClassMethods.add(new HashMap<String, AST.method>());
        basicClassMethods.add(new HashMap<String, AST.method>());
        basicClassMethods.add(new HashMap<String, AST.method>());
        basicClassMethods.add(new HashMap<String, AST.method>());
        List<AST.formal> substr_formal = new ArrayList<AST.formal>();
        substr_formal.add(new AST.formal("i", "Int", 0));
        substr_formal.add(new AST.formal("l", "Int", 0));
        // fills basicClassMethods with respective classes
        helperAddObjectIOString(basicClassMethods, substr_formal);
        // adds the built in classes to the class list
        helperAddBuiltInClassToClassList(basicClassMethods);
     }
// helper function to fill basicClassMethods with respective classes
private void helperAddObjectIOString(List<HashMap<String,AST.method>> basicClassMethods,  List<AST.formal> substr_formal)
    {
        AST.no_expr[] nox  =  new AST.no_expr[14];
           
        for(int i = 0; i < 14; i++)
        {
            nox[i] = new AST.no_expr(0);
        }
        // adding Object
        basicClassMethods.get(0).put("abort", new AST.method("abort", new ArrayList<AST.formal>(), "Object",nox[0] , 0));
        basicClassMethods.get(0).put("type_name", new AST.method("type_name", new ArrayList<AST.formal>(), "String",nox[1], 0));
        basicClassMethods.get(0).put("copy", new AST.method("copy", new ArrayList<AST.formal>(), "Object", nox[2], 0));

        // adding IO    
        basicClassMethods.get(1).put("output", new AST.method("output", new ArrayList<AST.formal>(), "String", nox[3], 0));
        basicClassMethods.get(1).put("input", new AST.method("input", new ArrayList<AST.formal>(), "String", nox[4], 0));
        basicClassMethods.get(1).putAll(basicClassMethods.get(0));      //inheriting all object methods
        
        // adding String
        //defining methods for string length, concatanation,substr
        basicClassMethods.get(2).put("length", new AST.method("length", new ArrayList<AST.formal>(), "Int", nox[5], 0));
        basicClassMethods.get(2).put("concat", new AST.method("concat", Arrays.asList(new AST.formal("s", "String", 0)), "String", nox[6], 0));
        basicClassMethods.get(2).put("substr", new AST.method("substr", substr_formal, "String",nox[7], 0));
        basicClassMethods.get(2).putAll(basicClassMethods.get(0));      //inheriting all object methods

        //adding Graph
        //defining methods for size,vetex no.size,edge no. size
        basicClassMethods.get(3).put("size", new AST.method("size", new ArrayList<AST.formal>(), "Int", nox[8], 0));
        basicClassMethods.get(3).put("vsize", new AST.method("vsize", new ArrayList<AST.formal>(), "Int", nox[9], 0));
        basicClassMethods.get(3).put("esize", new AST.method("esize", new ArrayList<AST.formal>(), "Int", nox[10], 0));
        basicClassMethods.get(3).putAll(basicClassMethods.get(0)); 

        //Adding Matrix
        //defining methods for no. of rows, no. of coloumns, deteminant.
        basicClassMethods.get(3).put("nrow", new AST.method("nrow", new ArrayList<AST.formal>(), "Int", nox[11], 0));
        basicClassMethods.get(3).put("ncol", new AST.method("ncol", new ArrayList<AST.formal>(), "Int", nox[12], 0));
        basicClassMethods.get(3).put("det", new AST.method("det", new ArrayList<AST.formal>(), "Float", nox[13], 0));
        basicClassMethods.get(2).putAll(basicClassMethods.get(0)); 

        return ;
    }

    // adding all the classes to the class list
    private void helperAddBuiltInClassToClassList(List<HashMap<String,AST.method>> basicClassMethods)
    {
        classList.put("Object", new ClassNode("Object", null, 0, new HashMap <String, AST.attr>(), basicClassMethods.get(0)));
        classList.put("IO", new ClassNode("IO", "Object", 1, new HashMap <String, AST.attr>(), basicClassMethods.get(1)));
        classList.put("String", new ClassNode("String", "Object", 1, new HashMap <String, AST.attr>(), basicClassMethods.get(2)));
        classList.put("Graph", new ClassNode("Graph", "Object", 1, new HashMap <String, AST.attr>(), basicClassMethods.get(3)));
        classList.put("Matrix", new ClassNode("Matrix", "Object", 1, new HashMap <String, AST.attr>(), basicClassMethods.get(4)));
        classList.put("Int", new ClassNode("Int", "Object", 1, new HashMap <String, AST.attr>(), new HashMap <String, AST.method>(basicClassMethods.get(0))));
        classList.put("Bool", new ClassNode("Bool", "Object", 1, new HashMap <String, AST.attr>(), new HashMap <String, AST.method>(basicClassMethods.get(0))));
        classList.put("Float", new ClassNode("Float", "Object", 1, new HashMap <String, AST.attr>(), new HashMap <String, AST.method>(basicClassMethods.get(0))));
        classList.put("Vertex", new ClassNode("Vertex", "Object", 1, new HashMap <String, AST.attr>(), new HashMap <String, AST.method>(basicClassMethods.get(0))));
        classList.put("Edge", new ClassNode("Edge", "Object", 1, new HashMap <String, AST.attr>(), new HashMap <String, AST.method>(basicClassMethods.get(0))));
        return;
    }

        // returns the number equivalent to a class in the adjacenccy graph
        //return -1 if classname which is provided in the class list
    private int ClassNameEquivalentNumber(ArrayList<AST.class_> class_node,String name )
    {
        for (int i = 0 ; i < class_node.size(); i++ )
        {
            if( class_node.get(i) != null &&((class_node.get(i)).name).equals(name))
                return i; 
        }
        return -1;
    }



    // checks if the class is a basic class
    private boolean isBasicClass(String cl)
    {
        return (cl.equals("Object") || cl.equals("IO") || cl.equals("Graph")|| cl.equals("Matrix")|| cl.equals("Int") ||cl.equals("Float") || cl.equals("Vertex")|| cl.equals("Edge")|| cl.equals("String") || cl.equals("Bool"));
    }

    // checks if a class is inheritable if it is a basic inbuilt class
    private boolean isBasicClassNotInheritable(String cl)
    {
        return (cl.equals("Int") || cl.equals("String") || cl.equals("Bool") || cl.equals("Graph")|| cl.equals("Matrix"));
    }


    // makes a graph detects cycles checks for inheritance related stuff
    //we check for cylcles in classes
    // if everything is fine adds class to the class list using some functions
    //Takes the argument of type List<Ast.class_> which is list of all classes in the language
    private void GraphHandler(List<AST.class_> classes) {

        // contains all the classes
        // defines a Array list variable of type <AST.class_> which stroes all the classes
        ArrayList<AST.class_> class_node = new ArrayList<AST.class_>();     

        // contains inheritance graph all the classes
        ArrayList<ArrayList<Integer>> adjacency_list = new ArrayList<ArrayList<Integer>>();
       
        // adds the built in classes to the inheritance graph
        helperUpdateClassNodeAndGraph(class_node, adjacency_list);

        boolean flag = true;

        // checks for proper class redefinition and inheritance from class and then adds to the graph
        int m = 0;
        while ( m < classes.size()) {
            // check if the class is inherited from a non-inheritable class that is object,IO,string,Graph or matrix
            if (isBasicClassNotInheritable(classes.get(m).parent)) {
                reportError(classes.get(m).filename, classes.get(m).lineNo, "Class '" + classes.get(m).name + "' cannot inherit basic inbuilt class '" + classes.get(m).parent + "'.");
                flag = false;
            }
            //Check that the class defined is a preexisiting basic classes : object,IO,string,Graph,matrix,int,float,vertex,edge
            if (isBasicClass(classes.get(m).name)) {
                reportError(classes.get(m).filename, classes.get(m).lineNo, "basic class is redefined  '" + classes.get(m).name + "'.");
                flag = false ;
            }
            //check if not a basic class, and is redefined again
            if (!isBasicClass(classes.get(m).name) &&  (ClassNameEquivalentNumber(class_node, classes.get(m).name)!= -1)) {
                reportError(classes.get(m).filename, classes.get(m).lineNo, "Class '" + classes.get(m).name + "' was previously defined.Redfining not allowed.");
                flag = false;
            } else {
                // the class does not violate any basic errors and we add it in the class list.
                class_node.add(classes.get(m));
                adjacency_list.add(new ArrayList<Integer>()); 
            }
            m++;
        }

        // adds the edges between the nodes in the adjaceny list
        //to link the class added in inheritance graph
       int n = 0;
        while ( n< classes.size()) {
            // paren stores the class name of the parent class
            //checks for if the parent classes is a basic class or doesnot exist in the class list
            String paren = classes.get(n).parent;
            if (!paren.equals("Object") &&!paren.equals("IO") &&!paren.equals("String") &&!paren.equals("Graph") &&!paren.equals("Matrix") &&!paren.equals("Int")  &&!paren.equals("Float") &&!paren.equals("Vertex") &&!paren.equals("Edge")  &&!paren.equals("Bool") && ClassNameEquivalentNumber(class_node, paren) == -1) {
                reportError(classes.get(n).filename, classes.get(n).lineNo, "Class '" + classes.get(n).name + "' inherits from an undefined class or non-existing class '" + paren + "'.");
                flag = false;
            }

            if (flag) {
                if(paren.equals("Object"))
                {
                    (adjacency_list.get(0)).add(ClassNameEquivalentNumber(class_node, classes.get(n).name));
                }
                else if(paren.equals("IO"))
                {
                    (adjacency_list.get(1)).add(ClassNameEquivalentNumber(class_node, classes.get(n).name));
                }                    
                else
                (adjacency_list.get(ClassNameEquivalentNumber(class_node, paren) )).add(ClassNameEquivalentNumber(class_node, classes.get(n).name));     //adding the inheritance edge
            }
            n++;
        }
        // checks if there are any cylces in the graph or any of the above condition is wrong
        //if cycle exits then we exit the prgram reporting error
        if (flag == false || isCyclic(adjacency_list, class_node)) {
            System.exit(0);
        }
        // adds the classes to classlist
        makeClassList(adjacency_list,class_node);
    }

    //adds the built in classes to the inheritance graph
    private void helperUpdateClassNodeAndGraph(ArrayList<AST.class_> class_node, ArrayList<ArrayList<Integer>> adjacency_list)
    {

        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);
        class_node.add(null);

        adjacency_list.add(new ArrayList<Integer>(Arrays.asList(1)));   //adding Object to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding IO to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Graph class in graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Matrix in graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Int to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding String to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Bool to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Float to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Vertex to graph
        adjacency_list.add(new ArrayList<Integer>());   //adding Edge to graph
        return;
    }

     // Nodes are added in a BFS style to classList so that the derived class can easily inherit features from the parent class   
    private void makeClassList(ArrayList<ArrayList<Integer>> adjacency_list,ArrayList<AST.class_> class_node)
    {
        ArrayList<Integer> q = new ArrayList<Integer>();
        boolean[] visited = new boolean[class_node.size()];       
        Arrays.fill(visited, Boolean.FALSE);
        Integer node = 0;
        int size = 0, i =0, nodeInList;
        ArrayList<Integer> nodeList ;
        q.add(0);   //Object class
        visited[0] = true;
        size =  q.size();
        while (size > 0) {
            node = q.get(--size);
            q.remove(size);
            i= 0;
            nodeList = adjacency_list.get(node);
            while ((nodeList!= null) && (i < nodeList.size())) {
                nodeInList = nodeList.get(i);
                if (visited[nodeInList] == false) {
                    visited[nodeInList]= true;
                    q.add(0, nodeInList);
                    size++;
                    // checking for Object & IO class
                    if (nodeInList > 1) {
                        
                        insert_class(class_node.get(nodeInList));
                    }
                }
            i++;
            }
        }
    }
    
    // detecting cycles in adjacency list consisting of edges between related classes using dfs;
    //we traverse through the adjaceny list to make sure that addition of the class_node results in a inheritance cycle or not 
    //return true if cycle

    private boolean isCyclic(ArrayList<ArrayList<Integer>> adjacency_list, ArrayList<AST.class_> class_node) {
    
        boolean[] visited = new boolean[class_node.size()];
        Arrays.fill(visited, Boolean.FALSE);
        ArrayList<Integer> dfsStack = new ArrayList<Integer>();        //recursion stack
        ArrayList<Integer> nodeList ;
        boolean isCyclic = false;

        int i = 0, k = 0, size;
        while (i < class_node.size()) {

            if (visited[i] == false) {

                dfsStack.add(i);
                size = dfsStack.size();
                while (size > 0) {

                    Integer node = dfsStack.get(size-1);
                    dfsStack.remove(--size);

                    visited[node] = true; // node visited marked   
                    k = 0;
                    nodeList = adjacency_list.get(node);
                    while ((nodeList!= null) && (k < nodeList.size())) {

                        int nodeInList = nodeList.get(k);
                        if (visited[nodeInList] == false) 
                            dfsStack.add(nodeInList);
                        else
                        {       
                            printCycle(adjacency_list, class_node, nodeInList);  // prints the detected cycle
                            isCyclic = true;
                            dfsStack.clear();
                            size  = 0;
                            break;
                        }
                        k++;
                    }
                }   
            }
            i++;
        }
        return isCyclic;
    }

    
     //   every class which is reachable from the node part of a cycle is flagged
    //    all the nodes are printed using bfs
    void printHelperFunc(AST.class_ Node)
    {
        reportError(Node.filename, Node.lineNo, " Class " + Node.name + ", or an ancestor of " + Node.name + ", is involved in an inheritance cycle.");
    }

    //prints the cycle present in the adjacency list when the class_node results in a cyclic inheritance graph
    private void printCycle(ArrayList<ArrayList<Integer>> adjacency_list, ArrayList<AST.class_> class_node, Integer node) {

        ArrayList<Integer> q = new ArrayList<Integer>();
        Boolean[] visited = new Boolean[class_node.size()];
        Arrays.fill(visited, Boolean.FALSE);
        ArrayList<Integer> nodeList;
        int size = 0, i = 0;

        q.add(node);
        visited[node] = true;
        printHelperFunc(class_node.get(node));        
        size = q.size();
        while (size > 0) {
            node = q.get(--size);
            q.remove(size);
            nodeList = adjacency_list.get(node);
            i = 0;
            while((nodeList!= null) && (i < nodeList.size())) {
                int tempNode = nodeList.get(i);
                if (visited[tempNode] == false ) {
                    q.add(0,tempNode);
                    size++;
                    visited[tempNode] =  true;
                    printHelperFunc(class_node.get(tempNode));
                }
                i++;
            }
        }
    }

    // intitialising the attribuites
    private void add_default_value(AST.attr atr) {
        switch(atr.typeid){
            case "Int":{
                atr.value = new AST.int_const(0, atr.lineNo);
                break;
            }
            case "String":{
                atr.value = new AST.string_const("", atr.lineNo);
                break;
            }
            case "Bool":{
                atr.value = new AST.bool_const(false, atr.lineNo);
                break;
            }
            case "Float":{
                atr.value = new AST.float_const(0.0, atr.lineNo);
                break;
            }
            case "Vertex":{
                atr.value = new AST.string_const("", atr.lineNo);
                break;
            }
            case "Edge":{
                atr.value = new AST.string_const("", atr.lineNo);
                break;
            }
            
        }
    }

    // inserts classes to the classList in a BFS manner
    private void insert_class(AST.class_ cl) {
        //stores the parent of class cl
        String parent = cl.parent;
        ArrayList<HashMap<String, AST.attr>> attribuitess = new ArrayList<HashMap<String, AST.attr>>();
        ArrayList<HashMap<String, AST.method>> methodss = new ArrayList<HashMap<String, AST.method>>();
        attribuitess.add(new HashMap<String, AST.attr>());
        attribuitess.add(classList.get(parent).attributes);
        methodss.add(new HashMap<String, AST.method>());
        methodss.add(classList.get(parent).methods);
        int i =0;

        // parents attribute & method list are added here
        ClassNode clNode = new ClassNode(cl.name, parent, classList.get(parent).height + 1, attribuitess.get(1), methodss.get(1)); 

        boolean flag = true;
        
        while(i< (cl.features).size()) {

            // Going throug the attributes of class
            if (cl.features.get(i).getClass() == AST.attr.class) {
                AST.attr atr = (AST.attr)cl.features.get(i);
                flag = true;

                // are there duplicate attributes within the class attributes
                if (attribuitess.get(0).containsKey(atr.name)) {
                    reportError(cl.filename, atr.lineNo, "Attribute '" + atr.name + "' in class '" + cl.name + "' is defined multiple times in class '" + cl.name + "'.");
                    flag = false;
                }

                // Are inherited class attributes  duplicate? 
                if (attribuitess.get(1).containsKey(atr.name)) {
                    reportError(cl.filename, atr.lineNo, "Attribute '" + atr.name + "' in class '" + cl.name + "' is an attribute of an inherited class '" + parent + "'.");
                    flag = false;
                }

                if (flag) {
                    // Default values are added
                    if (atr.value.getClass() == AST.no_expr.class)
                       {
                            add_default_value(atr);
                       }
                    attribuitess.get(0).put(atr.name, atr);
                }
            }

            else if (cl.features.get(i).getClass() == AST.method.class) {
                AST.method me = (AST.method)cl.features.get(i);
                flag = true;

                if (methodss.get(0).containsKey(me.name)) {
                    reportError(cl.filename, me.lineNo, "Method '" + me.name + "' is defined multiple times in class '" + cl.name + "'.");
                    flag =  false;
                }
                if (methodss.get(1).containsKey(me.name)) {
                    AST.method pr_met = methodss.get(1).get(me.name);

                    // Checking number of formal parameters
                    if (pr_met.formals.size() != me.formals.size()) {
                        reportError(cl.filename, me.lineNo, "Incompatible number of formal parameters of redefined method '" + me.name + "' in class '" + cl.name + "'.");
                        flag = false;
                    } else {

                        for (int j = 0; j < me.formals.size(); j++) {
                            formal a = pr_met.formals.get(j); 
                            String str = a.typeid; 
                            formal b = me.formals.get(j);
                            String str2 = b.typeid;
                            if (str.equals(str2) == false) {
                                reportError(cl.filename, me.lineNo, "In redefined method '" + me.name + "' in class '" + cl.name + "', parameter type " + me.formals.get(j).typeid + " is different from original type " + pr_met.formals.get(j).typeid + ".");
                                flag = false;
                            }
                        }
                    }

                    
                    if (pr_met.typeid.equals(me.typeid) == false) {
                        reportError(cl.filename, me.lineNo, "In redefined method '" + me.name + "' in class '" + cl.name + "', return type '" + me.typeid + "' is different from original return type '" + pr_met.typeid + "'.");
                        flag = false;
                    }

                }

                if (flag) {
                    methodss.get(0).put(me.name, me);
                }
            }
            i++;
        }

        clNode.methods.putAll(methodss.get(0));
        clNode.attributes.putAll(attribuitess.get(0));

        classList.put(cl.name, clNode);
    }

    // Visit the class
    private void visit_class(AST.class_ cl) {
        Iterator<AST.feature> cl_f_Iter = cl.features.iterator(); //Inits at -1
        while(cl_f_Iter.hasNext()) {
        AST.feature temp = cl_f_Iter.next();
        if (temp.getClass() == AST.method.class) {
            visit_method((AST.method)temp);
            continue;
        }
        if (temp.getClass() == AST.attr.class) 
            visit_attr((AST.attr)temp);
        }
    }

    // Visit methods of a certain class
    private void visit_method(AST.method cl_m) {
        scope.enterScope();                                     //Entering a new scope
        Iterator<AST.formal> cl_m_for_Iter = cl_m.formals.iterator();
        while(cl_m_for_Iter.hasNext()) {
            AST.formal temp = cl_m_for_Iter.next();
            if (scope.lookUpLocal(temp.name) == null){
                scope.insert(temp.name, new AST.attr(temp.name, temp.typeid, new AST.no_expr(temp.lineNo), temp.lineNo));
                continue;
            }
            reportError(filename, temp.lineNo, "Duplicate declarations found for formal parameters");
        }
        visit_expr(cl_m.body);
        if (conform(cl_m.body.type, cl_m.typeid) != true)          
            reportError(filename, cl_m.lineNo, "Types \"" + cl_m.body.type + ", " + cl_m.typeid + "\" do not conform.");
        scope.exitScope();
    }

    // Visit attributes of a certain class
    private void visit_attr(AST.attr attrib) {
        //Visit recursively if possible
        if ((attrib.value.getClass() == AST.no_expr.class) != true) {
            visit_expr(attrib.value);
            if (conform(attrib.value.type, attrib.typeid) != true) {  
                reportError(filename, attrib.lineNo, "Types \"" + attrib.value.type + "\", \"" + attrib.typeid + "\" do not conform. ");
            }
        }
    }

    

    // Big bad function to take care of all the expressions tiny and large alike.
   
    private void visit_expr(AST.expression expr) {
        String type = expr.getClass().getSimpleName();  //get type of AST as string for case
        switch (type){                                  //Select action based on type of expression
            //Constants
            case "bool_const": {
                ((AST.bool_const)expr).type = "Bool";
                break;
            }

            case "string_const":{
                ((AST.string_const)expr).type = "String";
                break;
            }

            case "int_const":{
                ((AST.int_const)expr).type = "Int";
                break;
            }

            case "float_const":{
                ((AST.float_const)expr).type = "Float";
                break;
            }

            case "vertex_const":{
                ((AST.vertex_const)expr).type = "Vertex";
                break;
            }
            
            //~expr
            case "comp":{
                AST.comp the_complement = ((AST.comp)expr);
                visit_expr(((AST.comp)expr).e1);
                if ((((AST.comp)expr).e1).type.equals("Bool") == true) {
                    ((AST.comp)expr).type = "Bool";
                    break;
                }
                // if the expresion expr is not of type bool: report error
                ((AST.comp)expr).type = "Bool";
                reportError(filename, (((AST.comp)expr).e1).lineNo, "Type \"" + (((AST.comp)expr).e1).type + "\" encountered for complement. Expected \"Bool\"");
                break;
            }

            //not expr
            case "neg":{
                visit_expr(((AST.neg)expr).e1);
                if (((((AST.neg)expr).e1).type.equals("Int")) == true || ((((AST.neg)expr).e1).type.equals("Bool")) == true) {
                    ((AST.neg)expr).type = "Int";
                    break;
                }
                ((AST.neg)expr).type = "Int";
                reportError(filename, ((AST.neg)expr).lineNo, "Type \"" + (((AST.neg)expr).e1).type + "\" encountered. Expected \"Int\" for negation");
                break;
            }

            // | expr
            case "unary_or":{
                visit_expr(((AST.unary_or)expr).e1);
                if (((((AST.unary_or)expr).e1).type.equals("Int")) == true || ((((AST.unary_or)expr).e1).type.equals("Bool")) == true) {
                    ((AST.unary_or)expr).type = "Int";
                    break;
                }
                ((AST.unary_or)expr).type = "Int";
                reportError(filename, ((AST.unary_or)expr).lineNo, "Type \"" + (((AST.unary_or)expr).e1).type + "\" encountered. Expected \"Int\" for unary or");
                break;
            }

             // &expr
             case "unary_and":{
                visit_expr(((AST.unary_and)expr).e1);
                if (((((AST.unary_and)expr).e1).type.equals("Int")) == true || ((((AST.unary_and)expr).e1).type.equals("Bool")) == true) {
                    ((AST.unary_and)expr).type = "Int";
                    break;
                }
                ((AST.unary_and)expr).type = "Int";
                reportError(filename, ((AST.unary_and)expr).lineNo, "Type \"" + (((AST.unary_and)expr).e1).type + "\" encountered. Expected \"Int\" for unary and");
                break;
            }

             // *expr
             case "unary_mul":{
                visit_expr(((AST.neg)expr).e1);
                if (((((AST.neg)expr).e1).type.equals("Int")) == true || ((((AST.neg)expr).e1).type.equals("Bool")) == true) {
                    ((AST.neg)expr).type = "Int";
                    break;
                }
                ((AST.neg)expr).type = "Int";
                reportError(filename, ((AST.neg)expr).lineNo, "Type \"" + (((AST.neg)expr).e1).type + "\" encountered. Expected \"Int\" for unary mul");
                break;
            }

             // +expr
             case "unary_plus":{
                visit_expr(((AST.neg)expr).e1);
                if (((((AST.neg)expr).e1).type.equals("Int")) == true || ((((AST.neg)expr).e1).type.equals("Bool")) == true) {
                    ((AST.neg)expr).type = "Int";
                    break;
                }
                ((AST.neg)expr).type = "Int";
                reportError(filename, ((AST.neg)expr).lineNo, "Type \"" + (((AST.neg)expr).e1).type + "\" encountered. Expected \"Int\" for unary plus");
                break;
            }

             // ++expr,expr++
             case "plusplus":{
                visit_expr(((AST.plusplus)expr).e1);
                if (((((AST.plusplus)expr).e1).type.equals("Int")) == true) {
                    ((AST.plusplus)expr).type = "Int";
                    break;
                }
                ((AST.plusplus)expr).type = "Int";
                reportError(filename, ((AST.plusplus)expr).lineNo, "Type \"" + (((AST.plusplus)expr).e1).type + "\" encountered. Expected \"Int\" for increment");
                break;
            }

             // --expr,expr--
             case "minusminus":{
                visit_expr(((AST.minusminus)expr).e1);
                if (((((AST.minusminus)expr).e1).type.equals("Int")) == true) {
                    ((AST.minusminus)expr).type = "Int";
                    break;
                }
                ((AST.minusminus)expr).type = "Int";
                reportError(filename, ((AST.minusminus)expr).lineNo, "Type \"" + (((AST.minusminus)expr).e1).type + "\" encountered. Expected \"Int\" for decrement");
                break;
            }

            // equal
            //expr == expr.
            //type of expressions should be same
            case "eq":{
                AST.eq the_equality = (AST.eq)expr;
                visit_expr(((AST.eq)expr).e1);
                visit_expr(((AST.eq)expr).e2);

                Boolean e1_Ok =  (((AST.eq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.eq)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((AST.eq)expr).e1).type.equals("Bool");
                e1_Ok = e1_Ok || (((AST.eq)expr).e1).type.equals("Vertex");
                e1_Ok = e1_Ok || (((AST.eq)expr).e1).type.equals("Matrix");
                e1_Ok = e1_Ok || (((AST.eq)expr).e1).type.equals("Edge");

                Boolean e2_Ok =  (((AST.eq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.eq)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((AST.eq)expr).e2).type.equals("Bool");
                e2_Ok = e2_Ok || (((AST.eq)expr).e2).type.equals("Vertex");
                e2_Ok = e2_Ok || (((AST.eq)expr).e2).type.equals("Matrix");
                e2_Ok = e2_Ok || (((AST.eq)expr).e2).type.equals("Edge");
                
                ((AST.eq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.eq)expr).e1).type.equals((((AST.eq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.eq)expr).e1).type + "\", \"" + (((AST.eq)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

             // not equal
            //expr != expr.
            //type of expressions should be equal
            case "neq":{
                AST.neq not_equality = (AST.neq)expr;
                visit_expr(((AST.neq)expr).e1);
                visit_expr(((AST.neq)expr).e2);

                Boolean e1_Ok =  (((AST.neq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.neq)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((AST.neq)expr).e1).type.equals("Bool");
                e1_Ok = e1_Ok || (((AST.neq)expr).e1).type.equals("Vertex");
                e1_Ok = e1_Ok || (((AST.neq)expr).e1).type.equals("Edge");
                e1_Ok = e1_Ok || (((AST.neq)expr).e1).type.equals("Matrix");


                Boolean e2_Ok =  (((AST.neq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.neq)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((AST.neq)expr).e2).type.equals("Bool");
                e2_Ok = e2_Ok || (((AST.neq)expr).e2).type.equals("vertex");
                e2_Ok = e2_Ok || (((AST.neq)expr).e2).type.equals("Matrix");
                
                ((AST.neq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.neq)expr).e1).type.equals((((AST.neq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.neq)expr).e1).type + "\", \"" + (((AST.neq)expr).e2).type + "\"encountered for not equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }


            //expr = expr
            case "assign":{
                visit_expr(((AST.assign)expr).e1);
                visit_expr(((AST.assign)expr).e2);


                if (scope.lookUpGlobal(((AST.assign)expr).name) == null) {
                    reportError(filename, ((AST.assign)expr).lineNo, "Variable being used without being declared");
                    ((AST.assign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.assign)expr).e1).type, scope.lookUpGlobal(((AST.assign)expr).name).typeid) == true) {
                    ((AST.assign)expr).type = ((AST.assign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.assign)expr).lineNo, "Types \"" + (((AST.assign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.assign)expr).name).typeid + "\" do not conform.");
                    ((AST.assign)expr).type = "Object";
                    ((AST.assign)expr).type = ((AST.assign)expr).e1.type;
                }
                ((AST.assign)expr).type = ((AST.assign)expr).e1.type;

                Boolean e1_Ok =  (((AST.assign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.assign)expr).e1).type.equals("Float");
                e1_Ok = e1_Ok || (((AST.assign)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((AST.assign)expr).e1).type.equals("Graph");
                e1_Ok = e1_Ok || (((AST.assign)expr).e1).type.equals("Matrix");

                Boolean e2_Ok =  (((AST.assign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.assign)expr).e2).type.equals("Float");
                e2_Ok = e2_Ok || (((AST.assign)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((AST.assign)expr).e2).type.equals("Graph");
                e2_Ok = e2_Ok || (((AST.assign)expr).e2).type.equals("Matrix");


                ((AST.assign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.assign)expr).e1).type.equals((((AST.assign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.assign)expr).e1).type + "\", \"" + (((AST.assign)expr).e2).type + "\"encountered for assign testing. Expected \"Int\"");
                        break;
                    }
                }

                break;
            }

            //expr += expr
            case "plusassign":{
                visit_expr(((AST.plusassign)expr).e1);
                visit_expr(((AST.plusassign)expr).e2);

                if (scope.lookUpGlobal(((AST.plusassign)expr).name) == null) {
                    reportError(filename, ((AST.plusassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.plusassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.plusassign)expr).e1).type, scope.lookUpGlobal(((AST.plusassign)expr).name).typeid) == true) {
                    ((AST.plusassign)expr).type = ((AST.plusassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.plusassign)expr).lineNo, "Types \"" + (((AST.plusassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.plusassign)expr).name).typeid + "\" do not conform.");
                    ((AST.plusassign)expr).type = "Object";
                    ((AST.plusassign)expr).type = ((AST.plusassign)expr).e1.type;
                }
                ((AST.plusassign)expr).type = ((AST.plusassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.plusassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.plusassign)expr).e1).type.equals("Float");
                e1_Ok = e1_Ok || (((AST.plusassign)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((AST.plusassign)expr).e1).type.equals("Graph");
                e1_Ok = e1_Ok || (((AST.plusassign)expr).e1).type.equals("Matrix");

                Boolean e2_Ok =  (((AST.plusassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.plusassign)expr).e2).type.equals("Float");
                e2_Ok = e2_Ok || (((AST.plusassign)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((AST.plusassign)expr).e2).type.equals("Graph");
                e2_Ok = e2_Ok || (((AST.plusassign)expr).e2).type.equals("Matrix");


                ((AST.plusassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.plusassign)expr).e1).type.equals((((AST.plusassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.plusassign)expr).e1).type + "\", \"" + (((AST.plusassign)expr).e2).type + "\"encountered for plusassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr -= expr
            case "minusassign":{
                visit_expr(((AST.minusassign)expr).e1);
                visit_expr(((AST.minusassign)expr).e2);

                if (scope.lookUpGlobal(((AST.minusassign)expr).name) == null) {
                    reportError(filename, ((AST.minusassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.minusassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.minusassign)expr).e1).type, scope.lookUpGlobal(((AST.minusassign)expr).name).typeid) == true) {
                    ((AST.minusassign)expr).type = ((AST.minusassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.minusassign)expr).lineNo, "Types \"" + (((AST.minusassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.minusassign)expr).name).typeid + "\" do not conform.");
                    ((AST.minusassign)expr).type = "Object";
                    ((AST.minusassign)expr).type = ((AST.minusassign)expr).e1.type;
                }
                ((AST.minusassign)expr).type = ((AST.minusassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.minusassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.minusassign)expr).e1).type.equals("Float");
                e1_Ok = e1_Ok || (((AST.minusassign)expr).e1).type.equals("Matrix");
                e1_Ok = e1_Ok || (((AST.minusassign)expr).e1).type.equals("Graph");

                Boolean e2_Ok =  (((AST.minusassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.minusassign)expr).e2).type.equals("Float");
                e2_Ok = e2_Ok || (((AST.minusassign)expr).e2).type.equals("Matrix");
                e2_Ok = e2_Ok || (((AST.minusassign)expr).e2).type.equals("Graph");

                ((AST.minusassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.minusassign)expr).e1).type.equals((((AST.minusassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.minusassign)expr).e1).type + "\", \"" + (((AST.minusassign)expr).e2).type + "\"encountered for minusassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr /= expr
            case "divassign":{
                visit_expr(((AST.divassign)expr).e1);
                visit_expr(((AST.divassign)expr).e1);

                if (scope.lookUpGlobal(((AST.divassign)expr).name) == null) {
                    reportError(filename, ((AST.divassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.divassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.divassign)expr).e1).type, scope.lookUpGlobal(((AST.divassign)expr).name).typeid) == true) {
                    ((AST.divassign)expr).type = ((AST.divassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.divassign)expr).lineNo, "Types \"" + (((AST.divassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.divassign)expr).name).typeid + "\" do not conform.");
                    ((AST.divassign)expr).type = "Object";
                    ((AST.divassign)expr).type = ((AST.divassign)expr).e1.type;
                }
                ((AST.divassign)expr).type = ((AST.divassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.divassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.divassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.divassign)expr).e2).type.equals("Int") && ((AST.eq)expr).e2!=0);
                e2_Ok = e2_Ok || (((AST.divassign)expr).e2).type.equals("Float");
                


                ((AST.divassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.divassign)expr).e1).type.equals((((AST.divassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.divassign)expr).e1).type + "\", \"" + (((AST.divassign)expr).e2).type + "\"encountered for division assign testing. Expected \"Int\"");
                        break;
                    }
                }
                
                break;
            }

            //expr *= expr
            case "mulassign":{
                visit_expr(((AST.mulassign)expr).e1);
                visit_expr(((AST.mulassign)expr).e2);

                if (scope.lookUpGlobal(((AST.mulassign)expr).name) == null) {
                    reportError(filename, ((AST.mulassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.mulassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.mulassign)expr).e1).type, scope.lookUpGlobal(((AST.mulassign)expr).name).typeid) == true) {
                    ((AST.mulassign)expr).type = ((AST.mulassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.mulassign)expr).lineNo, "Types \"" + (((AST.mulassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.mulassign)expr).name).typeid + "\" do not conform.");
                    ((AST.mulassign)expr).type = "Object";
                    ((AST.mulassign)expr).type = ((AST.mulassign)expr).e1.type;
                }
                ((AST.mulassign)expr).type = ((AST.mulassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.mulassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.mulassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.mulassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.mulassign)expr).e2).type.equals("Float");


                ((AST.mulassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.mulassign)expr).e1).type.equals((((AST.mulassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.mulassign)expr).e1).type + "\", \"" + (((AST.mulassign)expr).e2).type + "\"encountered for mulassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr %= expr
            case "modassign":{
                visit_expr(((AST.modassign)expr).e1);
                visit_expr(((AST.modassign)expr).e2)

                if (scope.lookUpGlobal(((AST.modassign)expr).name) == null) {
                    reportError(filename, ((AST.modassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.modassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.modassign)expr).e1).type, scope.lookUpGlobal(((AST.modassign)expr).name).typeid) == true) {
                    ((AST.modassign)expr).type = ((AST.modassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.modassign)expr).lineNo, "Types \"" + (((AST.modassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.modassign)expr).name).typeid + "\" do not conform.");
                    ((AST.modassign)expr).type = "Object";
                    ((AST.modassign)expr).type = ((AST.modassign)expr).e1.type;
                }
                ((AST.modassign)expr).type = ((AST.modassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.modassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.modassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.modassign)expr).e2).type.equals("Int") && ((AST.eq)expr).e2!=0);
                e2_Ok = e2_Ok || (((AST.modassign)expr).e2).type.equals("Float");
                
             ((AST.modassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.modassign)expr).e1).type.equals((((AST.modassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.modassign)expr).e1).type + "\", \"" + (((AST.modassign)expr).e2).type + "\"encountered for modassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr |= expr
            case "orassign":{
                visit_expr(((AST.orassign)expr).e1);
                visit_expr(((AST.orassign)expr).e2);

                if (scope.lookUpGlobal(((AST.orassign)expr).name) == null) {
                    reportError(filename, ((AST.orassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.orassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.orassign)expr).e1).type, scope.lookUpGlobal(((AST.orassign)expr).name).typeid) == true) {
                    ((AST.orassign)expr).type = ((AST.orassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.orassign)expr).lineNo, "Types \"" + (((AST.orassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.orassign)expr).name).typeid + "\" do not conform.");
                    ((AST.orassign)expr).type = "Object";
                    ((AST.orassign)expr).type = ((AST.orassign)expr).e1.type;
                }
                ((AST.orassign)expr).type = ((AST.orassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.orassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.orassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.orassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.orassign)expr).e2).type.equals("Float");


                ((AST.orassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.orassign)expr).e1).type.equals((((AST.orassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.orassign)expr).e1).type + "\", \"" + (((AST.orassign)expr).e2).type + "\"encountered for orassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr &= expr
            case "andassign":{
                visit_expr(((AST.andassign)expr).e1);
                visit_expr(((AST.andassign)expr).e2);

                if (scope.lookUpGlobal(((AST.andassign)expr).name) == null) {
                    reportError(filename, ((AST.andassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.andassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.andassign)expr).e1).type, scope.lookUpGlobal(((AST.andassign)expr).name).typeid) == true) {
                    ((AST.andassign)expr).type = ((AST.andassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.andassign)expr).lineNo, "Types \"" + (((AST.andassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.andassign)expr).name).typeid + "\" do not conform.");
                    ((AST.andassign)expr).type = "Object";
                    ((AST.andassign)expr).type = ((AST.andassign)expr).e1.type;
                }
                ((AST.andassign)expr).type = ((AST.andassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.andassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.andassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.andassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.andassign)expr).e2).type.equals("Float");


                ((AST.andassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.andassign)expr).e1).type.equals((((AST.andassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.andassign)expr).e1).type + "\", \"" + (((AST.andassign)expr).e2).type + "\"encountered for andassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr ^= expr
            case "xorassign":{
                visit_expr(((AST.xorassign)expr).e1);
                visit_expr(((AST.xorassign)expr).e2);

                if (scope.lookUpGlobal(((AST.xorassign)expr).name) == null) {
                    reportError(filename, ((AST.xorassign)expr).lineNo, "Variable being used without being declared");
                    ((AST.xorassign)expr).type = "Object";
                    break;
                } 
                if (conform((((AST.xorassign)expr).e1).type, scope.lookUpGlobal(((AST.xorassign)expr).name).typeid) == true) {
                    ((AST.xorassign)expr).type = ((AST.xorassign)expr).e1.type;
                } else {
                    reportError(filename, ((AST.xorassign)expr).lineNo, "Types \"" + (((AST.xorassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((AST.xorassign)expr).name).typeid + "\" do not conform.");
                    ((AST.xorassign)expr).type = "Object";
                    ((AST.xorassign)expr).type = ((AST.xorassign)expr).e1.type;
                }
                ((AST.xorassign)expr).type = ((AST.xorassign)expr).e1.type;

                Boolean e1_Ok =  (((AST.xorassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((AST.xorassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((AST.xorassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((AST.xorassign)expr).e2).type.equals("Float");


                ((AST.xorassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((AST.xorassign)expr).e1).type.equals((((AST.xorassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((AST.xorassign)expr).e1).type + "\", \"" + (((AST.xorassign)expr).e2).type + "\"encountered for xorassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr <= expr
            case "leq": {
                visit_expr(((AST.leq)expr).e1);
                if ((((AST.leq)expr).e1).type.equals("Int") == false && (((AST.leq)expr).e1).type.equals("Float") == false){
                    ((AST.leq)expr).type = "Bool";
                    reportError(filename, ((AST.leq)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.leq)expr).e1).type + "\" & \"" + (((AST.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                visit_expr(((AST.leq)expr).e2);
                if ((((AST.leq)expr).e1).type.equals("Int") == false && (((AST.leq)expr).e1).type.equals("Float") == false){
                    ((AST.leq)expr).type = "Bool";
                    reportError(filename, ((AST.leq)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.leq)expr).e1).type + "\" & \"" + (((AST.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                ((AST.leq)expr).type = "Bool";
                break;
            }
            //expr < expr
            case "lt":{
                visit_expr(((AST.lt)expr).e1);
                visit_expr(((AST.lt)expr).e2);
                if ((((AST.leq)expr).e1).type.equals("Int") == false && (((AST.leq)expr).e1).type.equals("Float") == false){
                    ((AST.lt)expr).type = "Bool";
                    reportError(filename, ((AST.lt)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.lt)expr).e1).type + "\" & \"" + (((AST.lt)expr).e2).type + "\" for less than operator");
                }
                if ((((AST.leq)expr).e1).type.equals("Int") == false && (((AST.leq)expr).e1).type.equals("Float") == false){
                    ((AST.lt)expr).type = "Bool";
                    reportError(filename, ((AST.lt)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.lt)expr).e1).type + "\" & \"" + (((AST.lt)expr).e2).type + "\" for less than operator");
                }
                ((AST.lt)expr).type = "Bool";
                break;
            }

            //expr >= expr
            case "geq": {
                visit_expr(((AST.geq)expr).e1);
                if ((((AST.geq)expr).e1).type.equals("Int") == false && (((AST.geq)expr).e1).type.equals("Float") == false){
                    ((AST.geq)expr).type = "Bool";
                    reportError(filename, ((AST.geq)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.geq)expr).e1).type + "\" & \"" + (((AST.geq)expr).e2).type + "\" for greater than or equal to operator");
                }
                visit_expr(((AST.geq)expr).e2);
                if ((((AST.geq)expr).e1).type.equals("Int") == false && (((AST.geq)expr).e1).type.equals("Float") == false){
                    ((AST.geq)expr).type = "Bool";
                    reportError(filename, ((AST.geq)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.geq)expr).e1).type + "\" & \"" + (((AST.geq)expr).e2).type + "\" for greater than or equal to operator");
                }
                ((AST.geq)expr).type = "Bool";
                break;
            }
            //expr > expr
            case "gt":{
                visit_expr(((AST.gt)expr).e1);
                visit_expr(((AST.gt)expr).e2);
                if ((((AST.geq)expr).e1).type.equals("Int") == false && (((AST.geq)expr).e1).type.equals("Float") == false){
                    ((AST.gt)expr).type = "Bool";
                    reportError(filename, ((AST.gt)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.gt)expr).e1).type + "\" & \"" + (((AST.gt)expr).e2).type + "\" for greator than operator");
                }
                if ((((AST.geq)expr).e1).type.equals("Int") == false && (((AST.geq)expr).e1).type.equals("Float") == false){
                    ((AST.gt)expr).type = "Bool";
                    reportError(filename, ((AST.gt)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.gt)expr).e1).type + "\" & \"" + (((AST.gt)expr).e2).type + "\" for greator than operator");
                }
                ((AST.gt)expr).type = "Bool";
                break;
            }
            
            //if expr then expr else expr
            case "cond":{
                visit_expr(((AST.cond)expr).predicate);
                visit_expr(((AST.cond)expr).ifbody);
                visit_expr(((AST.cond)expr).elsebody);
                if ((((AST.cond)expr).predicate).type.equals("Bool") == true) {
                    ((AST.cond)expr).type = lca((((AST.cond)expr).ifbody).type, (((AST.cond)expr).elsebody).type);
                    break;
                }
                ((AST.cond)expr).type = lca((((AST.cond)expr).ifbody).type, (((AST.cond)expr).elsebody).type);
                reportError(filename, (((AST.cond)expr).predicate).lineNo, "Conditional encountered has type \"" + (((AST.cond)expr).predicate).type + "\". Expected \"Bool\"");
                break;
            }
            
            //expr/expr
            case "divide":{
                visit_expr(((AST.divide)expr).e1);
                if ((((AST.divide)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((AST.divide)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.divide)expr).e1).type + "\" & \"" + (((AST.divide)expr).e2).type + "\" for performing division");
                    ((AST.divide)expr).type = "Int";
                }
                visit_expr(((AST.divide)expr).e2);
                if ((((AST.divide)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((AST.divide)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.divide)expr).e1).type + "\" & \"" + (((AST.divide)expr).e2).type + "\" for performing division");
                    ((AST.divide)expr).type = "Int";
                }
                ((AST.divide)expr).type = "Int";
                break;
            }
            //expr*expr
            case "mul":{
                visit_expr(((AST.mul)expr).e1);
                if ((((AST.mul)expr).e1).type.equals("Int") == false || (((AST.mul)expr).e1).type.equals("Float") == false || (((AST.mul)expr).e1).type.equals("Graph") == false|| (((AST.mul)expr).e1).type.equals("Matrix") == false){
                    ((AST.mul)expr).type = "Int";
                    reportError(filename, ((AST.mul)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.mul)expr).e1).type + "\" & \"" + (((AST.mul)expr).e2).type + "\" for performing multiplication");    
                }
                if ((((AST.mul)expr).e1).type.equals("Int") == false || (((AST.mul)expr).e1).type.equals("Float") == false || (((AST.mul)expr).e1).type.equals("Graph") == false|| (((AST.mul)expr).e1).type.equals("Matrix") == false){
            
                    ((AST.mul)expr).type = "Int";
                    reportError(filename, ((AST.mul)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.mul)expr).e1).type + "\" & \"" + (((AST.mul)expr).e2).type + "\" for performing multiplication");
                }
                ((AST.mul)expr).type = "Int";
                break;
            }
            //expr+expr
            case "plus":{
                visit_expr(((AST.plus)expr).e1);
                visit_expr(((AST.plus)expr).e2);
                if ((((AST.plus)expr).e1).type.equals("Int") == false || (((AST.plus)expr).e1).type.equals("Float") == false || (((AST.plus)expr).e1).type.equals("Graph") == false|| (((AST.plus)expr).e1).type.equals("Matrix") == false){

                    ((AST.plus)expr).type = "Int";
                    reportError(filename, ((AST.plus)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.plus)expr).e1).type + "\" & \"" + (((AST.plus)expr).e2).type + "\" for performing addition");
                }
                if ((((AST.plus)expr).e1).type.equals("Int") == false || (((AST.plus)expr).e1).type.equals("Float") == false || (((AST.plus)expr).e1).type.equals("Graph") == false|| (((AST.plus)expr).e1).type.equals("Matrix") == false){

                    ((AST.plus)expr).type = "Int";
                    reportError(filename, ((AST.plus)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.plus)expr).e1).type + "\" & \"" + (((AST.plus)expr).e2).type + "\" for performing addition");
                }
                ((AST.plus)expr).type = "Int";
                break;
            }
            //expr-expr
            case "sub":{
                visit_expr(((AST.sub)expr).e1);
                if ((((AST.sub)expr).e1).type.equals("Int") == false || (((AST.sub)expr).e1).type.equals("Float") == false || (((AST.sub)expr).e1).type.equals("Graph") == false|| (((AST.sub)expr).e1).type.equals("Matrix") == false){

                    reportError(filename, ((AST.sub)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.sub)expr).e1).type + "\" & \"" + (((AST.sub)expr).e2).type + "\" for performing subtraction");
                    ((AST.sub)expr).type = "Int";
                } 
                visit_expr(((AST.sub)expr).e2);
                if ((((AST.sub)expr).e1).type.equals("Int") == false || (((AST.sub)expr).e1).type.equals("Float") == false || (((AST.sub)expr).e1).type.equals("Graph") == false|| (((AST.sub)expr).e1).type.equals("Matrix") == false){

                    reportError(filename, ((AST.sub)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.sub)expr).e1).type + "\" & \"" + (((AST.sub)expr).e2).type + "\" for performing subtraction");
                    ((AST.sub)expr).type = "Int";
                }
                ((AST.sub)expr).type = "Int";
                break;
            }
            //expr%expr
            case "mod":{
                visit_expr(((AST.mod)expr).e1);
                if ((((AST.mod)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((AST.mod)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.mod)expr).e1).type + "\" & \"" + (((AST.mod)expr).e2).type + "\" for performing mod");
                    ((AST.mod)expr).type = "Int";
                } 
                visit_expr(((AST.mod)expr).e2);
                if ((((AST.mod)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((AST.mod)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.mod)expr).e1).type + "\" & \"" + (((AST.mod)expr).e2).type + "\" for performing mod");
                    ((AST.mod)expr).type = "Int";
                }
                ((AST.mod)expr).type = "Int";
                break;
            }

            //expr|expr
            case "bin_or":{
                visit_expr(((AST.bin_or)expr).e1);
                if ((((AST.bin_or)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((AST.bin_or)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.bin_or)expr).e1).type + "\" & \"" + (((AST.bin_or)expr).e2).type + "\" for performing bin_or");
                    ((AST.bin_or)expr).type = "Int";
                } 
                visit_expr(((AST.bin_or)expr).e2);
                if ((((AST.bin_or)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((AST.bin_or)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.bin_or)expr).e1).type + "\" & \"" + (((AST.bin_or)expr).e2).type + "\" for performing bin_or");
                    ((AST.bin_or)expr).type = "Int";
                }
                ((AST.bin_or)expr).type = "Int";
                break;
            }

            //expr&expr
            case "bin_and":{
                visit_expr(((AST.bin_and)expr).e1);
                if ((((AST.bin_and)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((AST.bin_and)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.bin_and)expr).e1).type + "\" & \"" + (((AST.bin_and)expr).e2).type + "\" for performing bin_and");
                    ((AST.bin_and)expr).type = "Int";
                } 
                visit_expr(((AST.bin_and)expr).e2);
                if ((((AST.bin_and)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((AST.bin_and)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.bin_and)expr).e1).type + "\" & \"" + (((AST.bin_and)expr).e2).type + "\" for performing bin_and");
                    ((AST.bin_and)expr).type = "Int";
                }
                ((AST.bin_and)expr).type = "Int";
                break;
            }

            //expr^expr
            case "bin_xor":{
                visit_expr(((AST.bin_xor)expr).e1);
                if ((((AST.bin_xor)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((AST.bin_xor)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.bin_xor)expr).e1).type + "\" & \"" + (((AST.bin_xor)expr).e2).type + "\" for performing bin_xor");
                    ((AST.bin_xor)expr).type = "Int";
                } 
                visit_expr(((AST.bin_xor)expr).e2);
                if ((((AST.bin_xor)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((AST.bin_xor)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.bin_xor)expr).e1).type + "\" & \"" + (((AST.bin_xor)expr).e2).type + "\" for performing bin_xor");
                    ((AST.bin_xor)expr).type = "Int";
                }
                ((AST.bin_xor)expr).type = "Int";
                break;
            }

            //expr>>expr
            case "pull":{
                visit_expr(((AST.pull)expr).e1);
                if ((((AST.pull)expr).e1).type.equals("Graph") == false){
                    reportError(filename, ((AST.pull)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.pull)expr).e1).type + "\" & \"" + (((AST.pull)expr).e2).type + "\" for performing pull");
                    ((AST.pull)expr).type = "Int";
                } 
                visit_expr(((AST.pull)expr).e2);
                if ((((AST.pull)expr).e2).type.equals("Vertex") == false && (((AST.pull)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.pull)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.pull)expr).e1).type + "\" & \"" + (((AST.pull)expr).e2).type + "\" for performing pull");
                    ((AST.pull)expr).type = "Int";
                }
                ((AST.pull)expr).type = "Int";
                break;
            }

            //expr<<expr
            case "push":{
                visit_expr(((AST.push)expr).e1);
                if ((((AST.push)expr).e1).type.equals("Graph") == false){
                    reportError(filename, ((AST.push)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.push)expr).e1).type + "\" & \"" + (((AST.push)expr).e2).type + "\" for performing push");
                    ((AST.push)expr).type = "Int";
                } 
                visit_expr(((AST.push)expr).e2);
                if ((((AST.push)expr).e2).type.equals("Vertex") == false && (((AST.push)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.push)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.push)expr).e1).type + "\" & \"" + (((AST.push)expr).e2).type + "\" for performing push");
                    ((AST.push)expr).type = "Int";
                }
                ((AST.push)expr).type = "Int";
                break;
            }

            //expr#expr
            case "hashtag":{
                visit_expr(((AST.hashtag)expr).e1);
                if ((((AST.hashtag)expr).e1).type.equals("Vertex") == false){
                    reportError(filename, ((AST.hashtag)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.hashtag)expr).e1).type + "\" & \"" + (((AST.hashtag)expr).e2).type + "\" for performing hashtag");
                    ((AST.hashtag)expr).type = "Int";
                } 
                visit_expr(((AST.hashtag)expr).e2);
                if ((((AST.hashtag)expr).e2).type.equals("Graph") == false && (((AST.hashtag)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.hashtag)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.hashtag)expr).e1).type + "\" & \"" + (((AST.hashtag)expr).e2).type + "\" for performing hashtag");
                    ((AST.hashtag)expr).type = "Int";
                }
                ((AST.hashtag)expr).type = "Int";
                break;
            }

            //expr?expr
            case "qmark":{
                visit_expr(((AST.qmark)expr).e1);
                if ((((AST.qmark)expr).e1).type.equals("Vertex") == false){
                    reportError(filename, ((AST.qmark)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.qmark)expr).e1).type + "\" & \"" + (((AST.qmark)expr).e2).type + "\" for performing qmark");
                    ((AST.qmark)expr).type = "Int";
                } 
                visit_expr(((AST.qmark)expr).e2);
                if ((((AST.qmark)expr).e2).type.equals("Graph") == false && (((AST.qmark)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.qmark)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.qmark)expr).e1).type + "\" & \"" + (((AST.qmark)expr).e2).type + "\" for performing qmark");
                    ((AST.qmark)expr).type = "Int";
                }
                ((AST.qmark)expr).type = "Int";
                break;
            }

            //expr addc expr
            case "addc":{
                visit_expr(((AST.addc)expr).e1);
                if ((((AST.addc)expr).e1).type.equals("Matrix") == false){
                    reportError(filename, ((AST.addc)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.addc)expr).e1).type + "\" & \"" + (((AST.addc)expr).e2).type + "\" for performing addc");
                    ((AST.addc)expr).type = "Int";
                } 
                visit_expr(((AST.addc)expr).e2);
                if ((((AST.addc)expr).e2).type.equals("Matrix") == false && (((AST.addc)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.addc)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.addc)expr).e1).type + "\" & \"" + (((AST.addc)expr).e2).type + "\" for performing addc");
                    ((AST.addc)expr).type = "Int";
                }
                ((AST.addc)expr).type = "Int";
                break;
            }

            //expr addr expr
            case "addr":{
                visit_expr(((AST.addr)expr).e1);
                if ((((AST.addr)expr).e1).type.equals("Matrix") == false){
                    reportError(filename, ((AST.addr)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.addr)expr).e1).type + "\" & \"" + (((AST.addr)expr).e2).type + "\" for performing addr");
                    ((AST.addr)expr).type = "Int";
                } 
                visit_expr(((AST.addr)expr).e2);
                if ((((AST.addr)expr).e2).type.equals("Matrix") == false && (((AST.addr)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.addr)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.addr)expr).e1).type + "\" & \"" + (((AST.addr)expr).e2).type + "\" for performing addr");
                    ((AST.addr)expr).type = "Int";
                }
                ((AST.addr)expr).type = "Int";
                break;
            }

             //expr delc expr
             case "delc":{
                visit_expr(((AST.delc)expr).e1);
                if ((((AST.delc)expr).e1).type.equals("Matrix") == false){
                    reportError(filename, ((AST.delc)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.delc)expr).e1).type + "\" & \"" + (((AST.delc)expr).e2).type + "\" for performing delc");
                    ((AST.delc)expr).type = "Int";
                } 
                visit_expr(((AST.delc)expr).e2);
                if ((((AST.delc)expr).e2).type.equals("Matrix") == false && (((AST.delc)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.delc)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.delc)expr).e1).type + "\" & \"" + (((AST.delc)expr).e2).type + "\" for performing delc");
                    ((AST.delc)expr).type = "Int";
                }
                ((AST.delc)expr).type = "Int";
                break;
            }

            //expr delr expr
            case "delr":{
                visit_expr(((AST.delr)expr).e1);
                if ((((AST.delr)expr).e1).type.equals("Matrix") == false){
                    reportError(filename, ((AST.delr)expr).lineNo, "Incompatible type for operand 1 \"" + (((AST.delr)expr).e1).type + "\" & \"" + (((AST.delr)expr).e2).type + "\" for performing delr");
                    ((AST.delr)expr).type = "Int";
                } 
                visit_expr(((AST.delr)expr).e2);
                if ((((AST.delr)expr).e2).type.equals("Matrix") == false && (((AST.delr)expr).e2).type.equals("") == false) {
                    reportError(filename, ((AST.delr)expr).lineNo, "Incompatible type for operand 2 \"" + (((AST.delr)expr).e1).type + "\" & \"" + (((AST.delr)expr).e2).type + "\" for performing delr");
                    ((AST.delr)expr).type = "Int";
                }
                ((AST.delr)expr).type = "Int";
                break;
            }

             //while expr loop expr
            case "loop":{
                visit_expr(((AST.loop)expr).predicate);
                visit_expr(((AST.loop)expr).body);
                if ((((AST.loop)expr).predicate).type.equals("Bool") == true) {
                    ((AST.loop)expr).type = "Object";
                    break;
                }
                ((AST.loop)expr).type = "Object";
                reportError(filename, (((AST.loop)expr).predicate).lineNo, "Type encountered for loop conditional is \"" + (((AST.loop)expr).predicate).type + "\". Expected \"Bool\"");
                break;
            }

           // for exp exp exp loop exp
            case "forloop":{
                visit_expr(((AST.loop)expr).init);
                visit_expr(((AST.loop)expr).predicate);
                visit_expr(((AST.loop)expr).update);
                visit_expr(((AST.loop)expr).body);
                if ((((AST.loop)expr).predicate).type.equals("Bool") == true) {
                    ((AST.loop)expr).type = "Object";
                    break;
                }
                ((AST.loop)expr).type = "Object";
                reportError(filename, (((AST.loop)expr).predicate).lineNo, "Type encountered for loop conditional is \"" + (((AST.loop)expr).predicate).type + "\". Expected \"Bool\"");
                break;
            }



            
            //compund statement {expr;+}
            case "block":{
                for (AST.expression c_expr : ((AST.block)expr).l1) {
                    visit_expr(c_expr);
                }
                ((AST.block)expr).type = ((AST.block)expr).l1.get(((AST.block)expr).l1.size() - 1).type;
                break;
            }
            //ID
            case "object":{
                if (scope.lookUpGlobal(((AST.object)expr).name) != null) {
                    ((AST.object)expr).type = scope.lookUpGlobal(((AST.object)expr).name).typeid;
                    break;
                }
                reportError(filename, ((AST.object)expr).lineNo, "Identifier \"" + ((AST.object)expr).name + "\" being used without being declared in the current scope.");
                ((AST.object)expr).type = "Object";
                break;
            }
            
            //case expr of (ID:TYPE => expr)+ 
            case "typcase":{
                visit_expr((AST.typcase)expr);
                break;
            }

            //class.method
            case "dispatch":{
                visit_expr((AST.dispatch)expr);
                break;
            }

            //class@class.method
            case "static_dispatch":{
                visit_expr((AST.static_dispatch)expr);
                break;
            }

            //Null expr non assignable only for internal workings 
            case "no_expr":{
                ((AST.no_expr)expr).type = "No_type";
                break;
            }
        }
        //If condition to test whether the expr was new_.
        if (expr.getClass() == AST.new_.class) {
            if (classList.containsKey(((AST.new_)expr).typeid) == false) {
                reportError(filename, ((AST.new_)expr).lineNo, "Class type \"" + ((AST.new_)expr).typeid + "\" being used without being defined");
                ((AST.new_)expr).type = "Object";
            } else {
                ((AST.new_)expr).type = ((AST.new_)expr).typeid;
            }
        }
    }

    
    //switch and dcase statements
    private void visit_expr(AST.typcase cases) {
        visit_expr(cases.predicate);
        for (AST.branch single_branch : cases.branches) {
            scope.enterScope();
            String in_type = new String("Object");
            if (classList.containsKey(single_branch.type) == true) {
                in_type = single_branch.type;
                scope.insert(single_branch.name, new AST.attr(single_branch.name, in_type, single_branch.value, single_branch.lineNo));
                visit_expr(single_branch.value);
                scope.exitScope();
                continue;
            }
            reportError(filename, single_branch.lineNo, "Class \"" + single_branch.type + "\" being used without being defined.");
            scope.insert(single_branch.name, new AST.attr(single_branch.name, in_type, single_branch.value, single_branch.lineNo));
            visit_expr(single_branch.value);
            scope.exitScope();            
        }
        //Find least common ancestor for type checking.
        String type = null;
        for (int i = 0; i < cases.branches.size(); i++) {
            for (int j = i + 1; j < cases.branches.size(); j++) {
                if (cases.branches.get(i).type.equals(cases.branches.get(j).type)) {
                    reportError(filename, cases.branches.get(j).lineNo, "Duplicate branch types \"" + cases.branches.get(i).type + "\"encountered in case expression.");
                }
            }
            cases.type = ((i!=0)?lca(type, cases.branches.get(i).value.type):cases.branches.get(i).value.type);
        }
    }

    //dispatch for function calls
    private void visit_expr(AST.dispatch disp) {
        visit_expr(disp.caller);
        for (int i = 0; i < disp.actuals.size(); i++) {
            visit_expr(disp.actuals.get(i));
        }
        if (classList.containsKey(disp.caller.type) == true) {  //Valid caller.
            if (classList.get(disp.caller.type).methods.containsKey(disp.name) == true) {
                disp.type = classList.get(disp.caller.type).methods.get(disp.name).typeid;  //Check no. of arguments
                if (classList.get(disp.caller.type).methods.get(disp.name).formals.size() == disp.actuals.size()) {
                    for (int i = 0; i < classList.get(disp.caller.type).methods.get(disp.name).formals.size(); i++) { //Check conformance
                        if (conform(disp.actuals.get(i).type, classList.get(disp.caller.type).methods.get(disp.name).formals.get(i).typeid) == false) {
                            reportError(filename, disp.lineNo,  "Argument no. \"" + i + 1 + "\" of type \"" + disp.actuals.get(i).type + "\" has no conformance \"" + classList.get(disp.caller.type).methods.get(disp.name).formals.get(i).typeid + "\" to dispatch of method \"" + disp.name);
                            disp.type = "Object";
                        }
                    }
                } else {
                    reportError(filename, disp.lineNo, "Method \"" + disp.name + " has " + disp.actuals.size() + " number of arguments; Expected no. was " + classList.get(disp.caller.type).methods.get(disp.name).formals.size());
                    disp.type = "Object";
                }
            } else {
                reportError(filename, disp.lineNo, "Method " + disp.name + " used without being defined.");
                disp.type = "Object";
            }
            return;
        }
        reportError(filename, disp.caller.lineNo, "Class \"" + disp.caller.type + "\" was not declared");
        disp.type = "Object";
    }
    
    //static dispatch
    private void visit_expr(AST.static_dispatch static_disp) {
        visit_expr(static_disp.caller);
        for (int i = 0; i < static_disp.actuals.size(); i++) {
            visit_expr(static_disp.actuals.get(i));
        }
        if (classList.containsKey(static_disp.typeid) == true) {    //Check whether the class being operated upon exists
            if (conform(static_disp.caller.type, static_disp.typeid) == false) {
                reportError(filename, static_disp.lineNo, "Types encountered \"" + static_disp.caller.type + "\", \"" + static_disp.typeid + "do not conform");
                static_disp.type = "Object";
            } else {
                if (classList.get(static_disp.caller.type).methods.containsKey(static_disp.name) == true) {
                    static_disp.type = classList.get(static_disp.caller.type).methods.get(static_disp.name).typeid;
                    if (classList.get(static_disp.caller.type).methods.get(static_disp.name).formals.size() == static_disp.actuals.size()) {
                        for (int i = 0; i < classList.get(static_disp.caller.type).methods.get(static_disp.name).formals.size(); i++) {
                            if (conform(static_disp.actuals.get(i).type, classList.get(static_disp.caller.type).methods.get(static_disp.name).formals.get(i).typeid) == false) {
                                reportError(filename, static_disp.lineNo,  "Argument no. \"" + i + 1 + "\" of type \"" + static_disp.actuals.get(i).type + "\" has no conformance \"" + classList.get(static_disp.caller.type).methods.get(static_disp.name).formals.get(i).typeid + "\" to dispatch of method \"" + static_disp.name);
                                static_disp.type = "Object";
                            }
                        }
                    } else {
                        reportError(filename, static_disp.lineNo, "Method \"" + static_disp.name + " has " + static_disp.actuals.size() + " number of arguments; Expected no. was " + classList.get(static_disp.caller.type).methods.get(static_disp.name).formals.size());
                        static_disp.type = "Object";
                    }
                } else {
                    reportError(filename, static_disp.lineNo, "Method " + static_disp.name + " used without being defined.");
                    static_disp.type = "Object";
                }
            }
            return;            
        }
        reportError(filename, static_disp.lineNo, "Class \"" + static_disp.typeid + "\" was not declared");  
        static_disp.type = "Object";
    }

    // Least common ancestor of two nodes in AST
    private String lca(String type_1, String type_2) {
        return (type_1.equals(type_2))?type_1:((classList.get(type_1).height)<(classList.get(type_2).height)?lca(type_2,type_1):lca(classList.get(type_1).parent, type_2));
    }
    //Check conformance
    private boolean conform(String inferred_type, String declared_type) {
        return (lca(inferred_type, declared_type).equals(declared_type)) && (classList.get(inferred_type).height >= classList.get(declared_type).height);
    }
}