package drool;

import java.util.*;

import java.*;


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
    private ScopeTable<DroolParser.classListContext.memberDeclarator> scope = new ScopeTable<DroolParser.classListContext.memberDeclarator>();

    // Hashmap containing all the classes
    public HashMap<String, ClassNode> classList = new HashMap<String, ClassNode>();
    private String filename;

    //SEMANTIC ANALYSIS BEGINS
    //Takes the argument of type DroolParser.program
    public HashMap<String, String> parent = new Hashmap<>();
    public void Inheritance(DroolParser.ClassList ctx, parent){
        if(ctx == null)
            return;
        String temp = ctx.classDefn().classHead().className().Identifier().getText();
        if (ctx.classDefn().classHead().inheritanceClause() != null)
            parent.put(temp, ctx.classDefn().inheritanceClause().className().getText());
        System.out.println(ctx.classDefn().classHead().className().Identifier())
        Inheritance(ctx.classList()); 
    }
    public Semantic(DroolParser.programContext program) {

        // adds basic classes to the class list
        addBuiltInClasses();

        // process the entire program and fills classList with the help of few functions
        GraphHandler(program.declarseq);
        int i = 0 ;
        while (i < (program.class).size()) {
	    
            filename = ((program.classes).get(i)).filename; // each class has a file name

            scope.enterScope(); // entering new scope
            
            String name = ((program.classes).get(i)).name;
            DroolParser.no_expr b = new DroolParser.no_expr(((program.classes).get(i)).lineNo); 
            int lNo = ((program.classes).get(i)).lineNo;
            DroolParser.classListContext.memberDeclarator a = new DroolParser.classListContext.memberDeclarator("self", name , b , lNo );
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

    }

    //function for incorporating built-in data types
    private void addBuiltInClasses() {
       
        // contains Object, String, Input/output methods, graph and matrices

        List<HashMap<String,DroolParser.classListContext.method>> basicClassMethods = new ArrayList<HashMap<String,DroolParser.classListContext.method> >(); 
        basicClassMethods.add(new HashMap<String, DroolParser.classListContext.method>());
        basicClassMethods.add(new HashMap<String, DroolParser.classListContext.method>());
        basicClassMethods.add(new HashMap<String, DroolParser.classListContext.method>());
        basicClassMethods.add(new HashMap<String, DroolParser.classListContext.method>());
        basicClassMethods.add(new HashMap<String, DroolParser.classListContext.method>());
        List<DroolParser.classListContext.formal> substr_formal = new ArrayList<DroolParser.classListContext.formal>();
        substr_formal.add(new DroolParser.formal("i", "Int", 0));
        substr_formal.add(new DroolParser.formal("l", "Int", 0));
        // fills basicClassMethods with respective classes
        helperAddObjectIOString(basicClassMethods, substr_formal);
        // adds the built in classes to the class list
        helperAddBuiltInClassToClassList(basicClassMethods);
     }
// helper function to fill basicClassMethods with respective classes
private void helperAddObjectIOString(List<HashMap<String,DroolParser.method>> basicClassMethods,  List<DroolParser.formal> substr_formal)
    {
        DroolParser.no_expr[] nox  =  new DroolParser.no_expr[14];
           
        for(int i = 0; i < 14; i++)
        {
            nox[i] = new DroolParser.no_expr(0);
        }
        // adding Object
        basicClassMethods.get(0).put("abort", new DroolParser.method("abort", new ArrayList<DroolParser.formal>(), "Object",nox[0] , 0));
        basicClassMethods.get(0).put("type_name", new DroolParser.method("type_name", new ArrayList<DroolParser.formal>(), "String",nox[1], 0));
        basicClassMethods.get(0).put("copy", new DroolParser.method("copy", new ArrayList<DroolParser.formal>(), "Object", nox[2], 0));

        // adding IO    
        basicClassMethods.get(1).put("output", new DroolParser.method("output", new ArrayList<DroolParser.formal>(), "String", nox[3], 0));
        basicClassMethods.get(1).put("input", new DroolParser.method("input", new ArrayList<DroolParser.formal>(), "String", nox[4], 0));
        basicClassMethods.get(1).putAll(basicClassMethods.get(0));      //inheriting all object methods
        
        // adding String
        //defining methods for string length, concatanation,substr
        basicClassMethods.get(2).put("length", new DroolParser.method("length", new ArrayList<DroolParser.formal>(), "Int", nox[5], 0));
        basicClassMethods.get(2).put("concat", new DroolParser.method("concat", Arrays.asList(new DroolParser.formal("s", "String", 0)), "String", nox[6], 0));
        basicClassMethods.get(2).put("substr", new DroolParser.method("substr", substr_formal, "String",nox[7], 0));
        basicClassMethods.get(2).putAll(basicClassMethods.get(0));      //inheriting all object methods

        //adding Graph
        //defining methods for size,vetex no.size,edge no. size
        basicClassMethods.get(3).put("size", new DroolParser.method("size", new ArrayList<DroolParser.formal>(), "Int", nox[8], 0));
        basicClassMethods.get(3).put("vsize", new DroolParser.method("vsize", new ArrayList<DroolParser.formal>(), "Int", nox[9], 0));
        basicClassMethods.get(3).put("esize", new DroolParser.method("esize", new ArrayList<DroolParser.formal>(), "Int", nox[10], 0));
        basicClassMethods.get(3).putAll(basicClassMethods.get(0)); 

        //Adding Matrix
        //defining methods for no. of rows, no. of coloumns, deteminant.
        basicClassMethods.get(3).put("nrow", new DroolParser.method("nrow", new ArrayList<DroolParser.formal>(), "Int", nox[11], 0));
        basicClassMethods.get(3).put("ncol", new DroolParser.method("ncol", new ArrayList<DroolParser.formal>(), "Int", nox[12], 0));
        basicClassMethods.get(3).put("det", new DroolParser.method("det", new ArrayList<DroolParser.formal>(), "Float", nox[13], 0));
        basicClassMethods.get(2).putAll(basicClassMethods.get(0)); 

        return ;
    }

    // adding all the classes to the class list
    private void helperAddBuiltInClassToClassList(List<HashMap<String,DroolParser.method>> basicClassMethods)
    {
        classList.put("Object", new ClassNode("Object", null, 0, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), basicClassMethods.get(0)));
        classList.put("IO", new ClassNode("IO", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), basicClassMethods.get(1)));
        classList.put("String", new ClassNode("String", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), basicClassMethods.get(2)));
        classList.put("Graph", new ClassNode("Graph", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), basicClassMethods.get(3)));
        classList.put("Matrix", new ClassNode("Matrix", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), basicClassMethods.get(4)));
        classList.put("Int", new ClassNode("Int", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), new HashMap <String, DroolParser.method>(basicClassMethods.get(0))));
        classList.put("Bool", new ClassNode("Bool", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), new HashMap <String, DroolParser.method>(basicClassMethods.get(0))));
        classList.put("Float", new ClassNode("Float", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), new HashMap <String, DroolParser.method>(basicClassMethods.get(0))));
        classList.put("Vertex", new ClassNode("Vertex", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), new HashMap <String, DroolParser.method>(basicClassMethods.get(0))));
        classList.put("Edge", new ClassNode("Edge", "Object", 1, new HashMap <String, DroolParser.classListContext.memberDeclarator>(), new HashMap <String, DroolParser.method>(basicClassMethods.get(0))));
        return;
    }

        // returns the number equivalent to a class in the adjacenccy graph
        //return -1 if classname which is provided in the class list
    private int ClassNameEquivalentNumber(ArrayList<DroolParser.class_> class_node,String name )
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
    //Takes the argument of type List<DroolParser.class_> which is list of all classes in the language
    private void GraphHandler(List<DroolParser.class_> classes) {

        // contains all the classes
        // defines a Array list variable of type <DroolParser.class_> which stroes all the classes
        ArrayList<DroolParser.class_> class_node = new ArrayList<DroolParser.class_>();     

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
    private void helperUpdateClassNodeAndGraph(ArrayList<DroolParser.class_> class_node, ArrayList<ArrayList<Integer>> adjacency_list)
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
    private void makeClassList(ArrayList<ArrayList<Integer>> adjacency_list,ArrayList<DroolParser.class_> class_node)
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

    private boolean isCyclic(ArrayList<ArrayList<Integer>> adjacency_list, ArrayList<DroolParser.class_> class_node) {
    
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
    void printHelperFunc(DroolParser.class_ Node)
    {
        reportError(Node.filename, Node.lineNo, " Class " + Node.name + ", or an ancestor of " + Node.name + ", is involved in an inheritance cycle.");
    }

    //prints the cycle present in the adjacency list when the class_node results in a cyclic inheritance graph
    private void printCycle(ArrayList<ArrayList<Integer>> adjacency_list, ArrayList<DroolParser.class_> class_node, Integer node) {

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
    private void add_default_value(DroolParser.classListContext.memberDeclarator atr) {
        switch(atr.typeid){
            case "Int":{
                atr.value = new DroolParser.int_const(0, atr.lineNo);
                break;
            }
            case "String":{
                atr.value = new DroolParser.string_const("", atr.lineNo);
                break;
            }
            case "Bool":{
                atr.value = new DroolParser.bool_const(false, atr.lineNo);
                break;
            }
            case "Float":{
                atr.value = new DroolParser.float_const(0.0, atr.lineNo);
                break;
            }
            case "Vertex":{
                atr.value = new DroolParser.string_const("", atr.lineNo);
                break;
            }
            case "Edge":{
                atr.value = new DroolParser.string_const("", atr.lineNo);
                break;
            }
            
        }
    }

    // inserts classes to the classList in a BFS manner
    private void insert_class(DroolParser.class_ cl) {
        //stores the parent of class cl
        String parent = cl.parent;
        ArrayList<HashMap<String, DroolParser.classListContext.memberDeclarator>> attribuitess = new ArrayList<HashMap<String, DroolParser.classListContext.memberDeclarator>>();
        ArrayList<HashMap<String, DroolParser.method>> methodss = new ArrayList<HashMap<String, DroolParser.method>>();
        attribuitess.add(new HashMap<String, DroolParser.classListContext.memberDeclarator>());
        attribuitess.add(classList.get(parent).attributes);
        methodss.add(new HashMap<String, DroolParser.method>());
        methodss.add(classList.get(parent).methods);
        int i =0;

        // parents attribute & method list are added here
        ClassNode clNode = new ClassNode(cl.name, parent, classList.get(parent).height + 1, attribuitess.get(1), methodss.get(1)); 

        boolean flag = true;
        
        while(i< (cl.features).size()) {

            // Going throug the attributes of class
            if (cl.features.get(i).getClass() == DroolParser.classListContext.memberDeclarator.class) {
                DroolParser.classListContext.memberDeclarator atr = (DroolParser.classListContext.memberDeclarator)cl.features.get(i);
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
                    if (atr.value.getClass() == DroolParser.no_expr.class)
                       {
                            add_default_value(atr);
                       }
                    attribuitess.get(0).put(atr.name, atr);
                }
            }

            else if (cl.features.get(i).getClass() == DroolParser.method.class) {
                DroolParser.method me = (DroolParser.method)cl.features.get(i);
                flag = true;

                if (methodss.get(0).containsKey(me.name)) {
                    reportError(cl.filename, me.lineNo, "Method '" + me.name + "' is defined multiple times in class '" + cl.name + "'.");
                    flag =  false;
                }
                if (methodss.get(1).containsKey(me.name)) {
                    DroolParser.method pr_met = methodss.get(1).get(me.name);

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
    private void visit_class(DroolParser.class_ cl) {
        Iterator<DroolParser.feature> cl_f_Iter = cl.features.iterator(); //Inits at -1
        while(cl_f_Iter.hasNext()) {
        DroolParser.feature temp = cl_f_Iter.next();
        if (temp.getClass() == DroolParser.method.class) {
            visit_method((DroolParser.method)temp);
            continue;
        }
        if (temp.getClass() == DroolParser.classListContext.memberDeclarator.class) 
            visit_attr((DroolParser.classListContext.memberDeclarator)temp);
        }
    }

    // Visit methods of a certain class
    private void visit_method(DroolParser.method cl_m) {
        scope.enterScope();                                     //Entering a new scope
        Iterator<DroolParser.formal> cl_m_for_Iter = cl_m.formals.iterator();
        while(cl_m_for_Iter.hasNext()) {
            DroolParser.formal temp = cl_m_for_Iter.next();
            if (scope.lookUpLocal(temp.name) == null){
                scope.insert(temp.name, new DroolParser.classListContext.memberDeclarator(temp.name, temp.typeid, new DroolParser.no_expr(temp.lineNo), temp.lineNo));
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
    private void visit_attr(DroolParser.classListContext.memberDeclarator attrib) {
        //Visit recursively if possible
        if ((attrib.value.getClass() == DroolParser.no_expr.class) != true) {
            visit_expr(attrib.value);
            if (conform(attrib.value.type, attrib.typeid) != true) {  
                reportError(filename, attrib.lineNo, "Types \"" + attrib.value.type + "\", \"" + attrib.typeid + "\" do not conform. ");
            }
        }
    }

    

    // Big bad function to take care of all the expressions tiny and large alike.
   
    private void visit_expr(DroolParser.expression expr) {
        String type = expr.getClass().getSimpleName();  //get type of AST as string for case
        switch (type){                                  //Select action based on type of expression
            //Constants
            case "bool_const": {
                ((DroolParser.bool_const)expr).type = "Bool";
                break;
            }

            case "string_const":{
                ((DroolParser.string_const)expr).type = "String";
                break;
            }

            case "int_const":{
                ((DroolParser.int_const)expr).type = "Int";
                break;
            }

            case "float_const":{
                ((DroolParser.float_const)expr).type = "Float";
                break;
            }

            case "vertex_const":{
                ((DroolParser.vertex_const)expr).type = "Vertex";
                break;
            }
            
            //~expr
            case "comp":{
                DroolParser.comp the_complement = ((DroolParser.comp)expr);
                visit_expr(((DroolParser.comp)expr).e1);
                if ((((DroolParser.comp)expr).e1).type.equals("Bool") == true) {
                    ((DroolParser.comp)expr).type = "Bool";
                    break;
                }
                // if the expresion expr is not of type bool: report error
                ((DroolParser.comp)expr).type = "Bool";
                reportError(filename, (((DroolParser.comp)expr).e1).lineNo, "Type \"" + (((DroolParser.comp)expr).e1).type + "\" encountered for complement. Expected \"Bool\"");
                break;
            }

            //not expr
            case "neg":{
                visit_expr(((DroolParser.neg)expr).e1);
                if (((((DroolParser.neg)expr).e1).type.equals("Int")) == true || ((((DroolParser.neg)expr).e1).type.equals("Bool")) == true) {
                    ((DroolParser.neg)expr).type = "Int";
                    break;
                }
                ((DroolParser.neg)expr).type = "Int";
                reportError(filename, ((DroolParser.neg)expr).lineNo, "Type \"" + (((DroolParser.neg)expr).e1).type + "\" encountered. Expected \"Int\" for negation");
                break;
            }

            // | expr
            case "unary_or":{
                visit_expr(((DroolParser.unary_or)expr).e1);
                if (((((DroolParser.unary_or)expr).e1).type.equals("Int")) == true || ((((DroolParser.unary_or)expr).e1).type.equals("Bool")) == true) {
                    ((DroolParser.unary_or)expr).type = "Int";
                    break;
                }
                ((DroolParser.unary_or)expr).type = "Int";
                reportError(filename, ((DroolParser.unary_or)expr).lineNo, "Type \"" + (((DroolParser.unary_or)expr).e1).type + "\" encountered. Expected \"Int\" for unary or");
                break;
            }

             // &expr
             case "unary_and":{
                visit_expr(((DroolParser.unary_and)expr).e1);
                if (((((DroolParser.unary_and)expr).e1).type.equals("Int")) == true || ((((DroolParser.unary_and)expr).e1).type.equals("Bool")) == true) {
                    ((DroolParser.unary_and)expr).type = "Int";
                    break;
                }
                ((DroolParser.unary_and)expr).type = "Int";
                reportError(filename, ((DroolParser.unary_and)expr).lineNo, "Type \"" + (((DroolParser.unary_and)expr).e1).type + "\" encountered. Expected \"Int\" for unary and");
                break;
            }

             // *expr
             case "unary_mul":{
                visit_expr(((DroolParser.neg)expr).e1);
                if (((((DroolParser.neg)expr).e1).type.equals("Int")) == true || ((((DroolParser.neg)expr).e1).type.equals("Bool")) == true) {
                    ((DroolParser.neg)expr).type = "Int";
                    break;
                }
                ((DroolParser.neg)expr).type = "Int";
                reportError(filename, ((DroolParser.neg)expr).lineNo, "Type \"" + (((DroolParser.neg)expr).e1).type + "\" encountered. Expected \"Int\" for unary mul");
                break;
            }

             // +expr
             case "unary_plus":{
                visit_expr(((DroolParser.neg)expr).e1);
                if (((((DroolParser.neg)expr).e1).type.equals("Int")) == true || ((((DroolParser.neg)expr).e1).type.equals("Bool")) == true) {
                    ((DroolParser.neg)expr).type = "Int";
                    break;
                }
                ((DroolParser.neg)expr).type = "Int";
                reportError(filename, ((DroolParser.neg)expr).lineNo, "Type \"" + (((DroolParser.neg)expr).e1).type + "\" encountered. Expected \"Int\" for unary plus");
                break;
            }

             // ++expr,expr++
             case "plusplus":{
                visit_expr(((DroolParser.plusplus)expr).e1);
                if (((((DroolParser.plusplus)expr).e1).type.equals("Int")) == true) {
                    ((DroolParser.plusplus)expr).type = "Int";
                    break;
                }
                ((DroolParser.plusplus)expr).type = "Int";
                reportError(filename, ((DroolParser.plusplus)expr).lineNo, "Type \"" + (((DroolParser.plusplus)expr).e1).type + "\" encountered. Expected \"Int\" for increment");
                break;
            }

             // --expr,expr--
             case "minusminus":{
                visit_expr(((DroolParser.minusminus)expr).e1);
                if (((((DroolParser.minusminus)expr).e1).type.equals("Int")) == true) {
                    ((DroolParser.minusminus)expr).type = "Int";
                    break;
                }
                ((DroolParser.minusminus)expr).type = "Int";
                reportError(filename, ((DroolParser.minusminus)expr).lineNo, "Type \"" + (((DroolParser.minusminus)expr).e1).type + "\" encountered. Expected \"Int\" for decrement");
                break;
            }

            // equal
            //expr == expr.
            //type of expressions should be same
            case "eq":{
                DroolParser.eq the_equality = (DroolParser.eq)expr;
                visit_expr(((DroolParser.eq)expr).e1);
                visit_expr(((DroolParser.eq)expr).e2);

                Boolean e1_Ok =  (((DroolParser.eq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Bool");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Vertex");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Edge");

                Boolean e2_Ok =  (((DroolParser.eq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("Bool");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("vertex");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("Edge");
                
                ((DroolParser.eq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.eq)expr).e1).type.equals((((DroolParser.eq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.eq)expr).e1).type + "\", \"" + (((DroolParser.eq)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

             // not equal
            //expr != expr.
            //type of expressions should be equal
            case "neq":{
                DroolParser.neq not_equality = (DroolParser.neq)expr;
                visit_expr(((DroolParser.neq)expr).e1);
                visit_expr(((DroolParser.neq)expr).e2);

                Boolean e1_Ok =  (((DroolParser.neq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.neq)expr).e1).type.equals("String");
                e1_Ok = e1_Ok || (((DroolParser.neq)expr).e1).type.equals("Bool");
                e1_Ok = e1_Ok || (((DroolParser.neq)expr).e1).type.equals("Vertex");
                e1_Ok = e1_Ok || (((DroolParser.neq)expr).e1).type.equals("Edge");

                Boolean e2_Ok =  (((DroolParser.neq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.neq)expr).e2).type.equals("String");
                e2_Ok = e2_Ok || (((DroolParser.neq)expr).e2).type.equals("Bool");
                e2_Ok = e2_Ok || (((DroolParser.neq)expr).e2).type.equals("vertex");
                e2_Ok = e2_Ok || (((DroolParser.neq)expr).e2).type.equals("Edge");
                
                ((DroolParser.neq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.neq)expr).e1).type.equals((((DroolParser.neq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.neq)expr).e1).type + "\", \"" + (((DroolParser.neq)expr).e2).type + "\"encountered for not equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }


            //expr = expr
            case "assign":{
                visit_expr(((DroolParser.assign)expr).e1);
                visit_expr(((DroolParser.assign)expr).e2);


                if (scope.lookUpGlobal(((DroolParser.assign)expr).name) == null) {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.assign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.assign)expr).e1).type, scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid) == true) {
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Types \"" + (((DroolParser.assign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.assign)expr).type = "Object";
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                }
                ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.assign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.assign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.assign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.assign)expr).e2).type.equals("Float");


                ((DroolParser.assign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.assign)expr).e1).type.equals((((DroolParser.assign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.assign)expr).e1).type + "\", \"" + (((DroolParser.assign)expr).e2).type + "\"encountered for assign testing. Expected \"Int\"");
                        break;
                    }
                }

                break;
            }

            //expr += expr
            case "plusassign":{
                visit_expr(((DroolParser.plusassign)expr).e1);
                visit_expr(((DroolParser.plusassign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.plusassign)expr).name) == null) {
                    reportError(filename, ((DroolParser.plusassign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.plusassign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.plusassign)expr).e1).type, scope.lookUpGlobal(((DroolParser.plusassign)expr).name).typeid) == true) {
                    ((DroolParser.plusassign)expr).type = ((DroolParser.plusassign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.plusassign)expr).lineNo, "Types \"" + (((DroolParser.plusassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.plusassign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.plusassign)expr).type = "Object";
                    ((DroolParser.plusassign)expr).type = ((DroolParser.plusassign)expr).e1.type;
                }
                ((DroolParser.plusassign)expr).type = ((DroolParser.plusassign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.plusassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.plusassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.plusassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.plusassign)expr).e2).type.equals("Float");


                ((DroolParser.plusassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.plusassign)expr).e1).type.equals((((DroolParser.plusassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.plusassign)expr).e1).type + "\", \"" + (((DroolParser.plusassign)expr).e2).type + "\"encountered for plusassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr -= expr
            case "minusassign":{
                visit_expr(((DroolParser.minusassign)expr).e1);
                visit_expr(((DroolParser.minusassign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.minusassign)expr).name) == null) {
                    reportError(filename, ((DroolParser.minusassign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.minusassign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.minusassign)expr).e1).type, scope.lookUpGlobal(((DroolParser.minusassign)expr).name).typeid) == true) {
                    ((DroolParser.minusassign)expr).type = ((DroolParser.minusassign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.minusassign)expr).lineNo, "Types \"" + (((DroolParser.minusassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.minusassign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.minusassign)expr).type = "Object";
                    ((DroolParser.minusassign)expr).type = ((DroolParser.minusassign)expr).e1.type;
                }
                ((DroolParser.minusassign)expr).type = ((DroolParser.minusassign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.minusassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.minusassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.minusassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.minusassign)expr).e2).type.equals("Float");


                ((DroolParser.minusassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.minusassign)expr).e1).type.equals((((DroolParser.minusassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.minusassign)expr).e1).type + "\", \"" + (((DroolParser.minusassign)expr).e2).type + "\"encountered for minusassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr /= expr
            case "divassign":{
                visit_expr(((DroolParser.divassign)expr).e1);
                visit_expr(((DroolParser.divassign)expr).e1);

                if (scope.lookUpGlobal(((DroolParser.divassign)expr).name) == null) {
                    reportError(filename, ((DroolParser.divassign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.divassign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.divassign)expr).e1).type, scope.lookUpGlobal(((DroolParser.divassign)expr).name).typeid) == true) {
                    ((DroolParser.divassign)expr).type = ((DroolParser.divassign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.divassign)expr).lineNo, "Types \"" + (((DroolParser.divassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.divassign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.divassign)expr).type = "Object";
                    ((DroolParser.divassign)expr).type = ((DroolParser.divassign)expr).e1.type;
                }
                ((DroolParser.divassign)expr).type = ((DroolParser.divassign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.divassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.divassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.divassign)expr).e2).type.equals("Int") && ((DroolParser.eq)expr).e2!=0);
                e2_Ok = e2_Ok || (((DroolParser.divassign)expr).e2).type.equals("Float");
                


                ((DroolParser.divassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.divassign)expr).e1).type.equals((((DroolParser.divassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.divassign)expr).e1).type + "\", \"" + (((DroolParser.divassign)expr).e2).type + "\"encountered for division assign testing. Expected \"Int\"");
                        break;
                    }
                }
                
                break;
            }

            //expr *= expr
            case "mulassign":{
                visit_expr(((DroolParser.mulassign)expr).e1);
                visit_expr(((DroolParser.mulassign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.mulassign)expr).name) == null) {
                    reportError(filename, ((DroolParser.mulassign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.mulassign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.mulassign)expr).e1).type, scope.lookUpGlobal(((DroolParser.mulassign)expr).name).typeid) == true) {
                    ((DroolParser.mulassign)expr).type = ((DroolParser.mulassign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.mulassign)expr).lineNo, "Types \"" + (((DroolParser.mulassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.mulassign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.mulassign)expr).type = "Object";
                    ((DroolParser.mulassign)expr).type = ((DroolParser.mulassign)expr).e1.type;
                }
                ((DroolParser.mulassign)expr).type = ((DroolParser.mulassign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.mulassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.mulassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.mulassign)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.mulassign)expr).e2).type.equals("Float");


                ((DroolParser.mulassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.mulassign)expr).e1).type.equals((((DroolParser.mulassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.mulassign)expr).e1).type + "\", \"" + (((DroolParser.mulassign)expr).e2).type + "\"encountered for mulassign testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr %= expr
            case "modassign":{
                visit_expr(((DroolParser.modassign)expr).e1);
                visit_expr(((DroolParser.modassign)expr).e2)

                if (scope.lookUpGlobal(((DroolParser.modassign)expr).name) == null) {
                    reportError(filename, ((DroolParser.modassign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.modassign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.modassign)expr).e1).type, scope.lookUpGlobal(((DroolParser.modassign)expr).name).typeid) == true) {
                    ((DroolParser.modassign)expr).type = ((DroolParser.modassign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.modassign)expr).lineNo, "Types \"" + (((DroolParser.modassign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.modassign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.modassign)expr).type = "Object";
                    ((DroolParser.modassign)expr).type = ((DroolParser.modassign)expr).e1.type;
                }
                ((DroolParser.modassign)expr).type = ((DroolParser.modassign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.modassign)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.modassign)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.modassign)expr).e2).type.equals("Int") && ((DroolParser.eq)expr).e2!=0);
                e2_Ok = e2_Ok || (((DroolParser.modassign)expr).e2).type.equals("Float");
                
             ((DroolParser.modassign)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.modassign)expr).e1).type.equals((((DroolParser.modassign)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.modassign)expr).e1).type + "\", \"" + (((DroolParser.modassign)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr |= expr
            case "orassign":{
                visit_expr(((DroolParser.assign)expr).e1);
                visit_expr(((DroolParser.assign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.assign)expr).name) == null) {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.assign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.assign)expr).e1).type, scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid) == true) {
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Types \"" + (((DroolParser.assign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.assign)expr).type = "Object";
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                }
                ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.eq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.eq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("Float");


                ((DroolParser.eq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.eq)expr).e1).type.equals((((DroolParser.eq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.eq)expr).e1).type + "\", \"" + (((DroolParser.eq)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr &= expr
            case "andassign":{
                visit_expr(((DroolParser.assign)expr).e1);
                visit_expr(((DroolParser.assign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.assign)expr).name) == null) {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.assign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.assign)expr).e1).type, scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid) == true) {
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Types \"" + (((DroolParser.assign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.assign)expr).type = "Object";
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                }
                ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.eq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.eq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("Float");


                ((DroolParser.eq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.eq)expr).e1).type.equals((((DroolParser.eq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.eq)expr).e1).type + "\", \"" + (((DroolParser.eq)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr ^= expr
            case "xorassign":{
                visit_expr(((DroolParser.assign)expr).e1);
                visit_expr(((DroolParser.assign)expr).e2);

                if (scope.lookUpGlobal(((DroolParser.assign)expr).name) == null) {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Variable being used without being declared");
                    ((DroolParser.assign)expr).type = "Object";
                    break;
                } 
                if (conform((((DroolParser.assign)expr).e1).type, scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid) == true) {
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                } else {
                    reportError(filename, ((DroolParser.assign)expr).lineNo, "Types \"" + (((DroolParser.assign)expr).e1).type + "\", \"" + scope.lookUpGlobal(((DroolParser.assign)expr).name).typeid + "\" do not conform.");
                    ((DroolParser.assign)expr).type = "Object";
                    ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;
                }
                ((DroolParser.assign)expr).type = ((DroolParser.assign)expr).e1.type;

                Boolean e1_Ok =  (((DroolParser.eq)expr).e1).type.equals("Int");
                e1_Ok = e1_Ok || (((DroolParser.eq)expr).e1).type.equals("Float");

                Boolean e2_Ok =  (((DroolParser.eq)expr).e2).type.equals("Int");
                e2_Ok = e2_Ok || (((DroolParser.eq)expr).e2).type.equals("Float");


                ((DroolParser.eq)expr).type = "Bool";
                if ((e1_Ok || e2_Ok)) {
                    if ((((DroolParser.eq)expr).e1).type.equals((((DroolParser.eq)expr).e1).type) == false) {
                        reportError(filename, the_equality.lineNo, "Types \"" + (((DroolParser.eq)expr).e1).type + "\", \"" + (((DroolParser.eq)expr).e2).type + "\"encountered for equality testing. Expected \"Int\"");
                        break;
                    }
                }
                break;
            }

            //expr <= expr
            case "leq": {
                visit_expr(((DroolParser.leq)expr).e1);
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.leq)expr).type = "Bool";
                    reportError(filename, ((DroolParser.leq)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.leq)expr).e1).type + "\" & \"" + (((DroolParser.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                visit_expr(((DroolParser.leq)expr).e2);
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.leq)expr).type = "Bool";
                    reportError(filename, ((DroolParser.leq)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.leq)expr).e1).type + "\" & \"" + (((DroolParser.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                ((DroolParser.leq)expr).type = "Bool";
                break;
            }
            //expr < expr
            case "lt":{
                visit_expr(((DroolParser.lt)expr).e1);
                visit_expr(((DroolParser.lt)expr).e2);
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.lt)expr).type = "Bool";
                    reportError(filename, ((DroolParser.lt)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.lt)expr).e1).type + "\" & \"" + (((DroolParser.lt)expr).e2).type + "\" for less than operator");
                }
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.lt)expr).type = "Bool";
                    reportError(filename, ((DroolParser.lt)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.lt)expr).e1).type + "\" & \"" + (((DroolParser.lt)expr).e2).type + "\" for less than operator");
                }
                ((DroolParser.lt)expr).type = "Bool";
                break;
            }

            //expr >= expr
            case "geq": {
                visit_expr(((DroolParser.geq)expr).e1);
                if ((((DroolParser.geq)expr).e1).type.equals("Int") == false && (((DroolParser.geq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.leq)expr).type = "Bool";
                    reportError(filename, ((DroolParser.geq)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.leq)expr).e1).type + "\" & \"" + (((DroolParser.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                visit_expr(((DroolParser.leq)expr).e2);
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.leq)expr).type = "Bool";
                    reportError(filename, ((DroolParser.leq)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.leq)expr).e1).type + "\" & \"" + (((DroolParser.leq)expr).e2).type + "\" for less than or equal to operator");
                }
                ((DroolParser.leq)expr).type = "Bool";
                break;
            }
            //expr > expr
            case "gt":{
                visit_expr(((DroolParser.lt)expr).e1);
                visit_expr(((DroolParser.lt)expr).e2);
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.lt)expr).type = "Bool";
                    reportError(filename, ((DroolParser.lt)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.lt)expr).e1).type + "\" & \"" + (((DroolParser.lt)expr).e2).type + "\" for less than operator");
                }
                if ((((DroolParser.leq)expr).e1).type.equals("Int") == false && (((DroolParser.leq)expr).e1).type.equals("Float") == false){
                    ((DroolParser.lt)expr).type = "Bool";
                    reportError(filename, ((DroolParser.lt)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.lt)expr).e1).type + "\" & \"" + (((DroolParser.lt)expr).e2).type + "\" for less than operator");
                }
                ((DroolParser.lt)expr).type = "Bool";
                break;
            }
            
            //if expr then expr else expr
            case "cond":{
                visit_expr(((DroolParser.cond)expr).predicate);
                visit_expr(((DroolParser.cond)expr).ifbody);
                visit_expr(((DroolParser.cond)expr).elsebody);
                if ((((DroolParser.cond)expr).predicate).type.equals("Bool") == true) {
                    ((DroolParser.cond)expr).type = lca((((DroolParser.cond)expr).ifbody).type, (((DroolParser.cond)expr).elsebody).type);
                    break;
                }
                ((DroolParser.cond)expr).type = lca((((DroolParser.cond)expr).ifbody).type, (((DroolParser.cond)expr).elsebody).type);
                reportError(filename, (((DroolParser.cond)expr).predicate).lineNo, "Conditional encountered has type \"" + (((DroolParser.cond)expr).predicate).type + "\". Expected \"Bool\"");
                break;
            }
            
            //expr/expr
            case "divide":{
                visit_expr(((DroolParser.divide)expr).e1);
                if ((((DroolParser.divide)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((DroolParser.divide)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.divide)expr).e1).type + "\" & \"" + (((DroolParser.divide)expr).e2).type + "\" for performing division");
                    ((DroolParser.divide)expr).type = "Int";
                }
                visit_expr(((DroolParser.divide)expr).e2);
                if ((((DroolParser.divide)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((DroolParser.divide)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.divide)expr).e1).type + "\" & \"" + (((DroolParser.divide)expr).e2).type + "\" for performing division");
                    ((DroolParser.divide)expr).type = "Int";
                }
                ((DroolParser.divide)expr).type = "Int";
                break;
            }
            //expr*expr
            case "mul":{
                visit_expr(((DroolParser.mul)expr).e1);
                if ((((DroolParser.mul)expr).e1).type.equals("Int") == false){
                    ((DroolParser.mul)expr).type = "Int";
                    reportError(filename, ((DroolParser.mul)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.mul)expr).e1).type + "\" & \"" + (((DroolParser.mul)expr).e2).type + "\" for performing multiplication");    
                }
                visit_expr(((DroolParser.mul)expr).e2);
                if ((((DroolParser.mul)expr).e2).type.equals("Int") == false) {
                    ((DroolParser.mul)expr).type = "Int";
                    reportError(filename, ((DroolParser.mul)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.mul)expr).e1).type + "\" & \"" + (((DroolParser.mul)expr).e2).type + "\" for performing multiplication");
                }
                ((DroolParser.mul)expr).type = "Int";
                break;
            }
            //expr+expr
            case "plus":{
                visit_expr(((DroolParser.plus)expr).e1);
                visit_expr(((DroolParser.plus)expr).e2);
                if ((((DroolParser.plus)expr).e1).type.equals("Int") == false){
                    ((DroolParser.plus)expr).type = "Int";
                    reportError(filename, ((DroolParser.plus)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.plus)expr).e1).type + "\" & \"" + (((DroolParser.plus)expr).e2).type + "\" for performing addition");
                }
                if ((((DroolParser.plus)expr).e2).type.equals("Int") == false) {
                    ((DroolParser.plus)expr).type = "Int";
                    reportError(filename, ((DroolParser.plus)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.plus)expr).e1).type + "\" & \"" + (((DroolParser.plus)expr).e2).type + "\" for performing addition");
                }
                ((DroolParser.plus)expr).type = "Int";
                break;
            }
            //expr-expr
            case "sub":{
                visit_expr(((DroolParser.sub)expr).e1);
                if ((((DroolParser.sub)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((DroolParser.sub)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.sub)expr).e1).type + "\" & \"" + (((DroolParser.sub)expr).e2).type + "\" for performing subtraction");
                    ((DroolParser.sub)expr).type = "Int";
                } 
                visit_expr(((DroolParser.sub)expr).e2);
                if ((((DroolParser.sub)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((DroolParser.sub)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.sub)expr).e1).type + "\" & \"" + (((DroolParser.sub)expr).e2).type + "\" for performing subtraction");
                    ((DroolParser.sub)expr).type = "Int";
                }
                ((DroolParser.sub)expr).type = "Int";
                break;
            }
            //expr%expr
            case "mod":{
                visit_expr(((DroolParser.sub)expr).e1);
                if ((((DroolParser.sub)expr).e1).type.equals("Int") == false){
                    reportError(filename, ((DroolParser.sub)expr).lineNo, "Incompatible type for operand 1 \"" + (((DroolParser.sub)expr).e1).type + "\" & \"" + (((DroolParser.sub)expr).e2).type + "\" for performing subtraction");
                    ((DroolParser.sub)expr).type = "Int";
                } 
                visit_expr(((DroolParser.sub)expr).e2);
                if ((((DroolParser.sub)expr).e2).type.equals("Int") == false) {
                    reportError(filename, ((DroolParser.sub)expr).lineNo, "Incompatible type for operand 2 \"" + (((DroolParser.sub)expr).e1).type + "\" & \"" + (((DroolParser.sub)expr).e2).type + "\" for performing subtraction");
                    ((DroolParser.sub)expr).type = "Int";
                }
                ((DroolParser.sub)expr).type = "Int";
                break;
            }
            //while expr loop expr pool
            case "loop":{
                visit_expr(((DroolParser.loop)expr).predicate);
                visit_expr(((DroolParser.loop)expr).body);
                if ((((DroolParser.loop)expr).predicate).type.equals("Bool") == true) {
                    ((DroolParser.loop)expr).type = "Object";
                    break;
                }
                ((DroolParser.loop)expr).type = "Object";
                reportError(filename, (((DroolParser.loop)expr).predicate).lineNo, "Type encountered for loop conditional is \"" + (((DroolParser.loop)expr).predicate).type + "\". Expected \"Bool\"");
                break;
            }
            //isvoid expr
            case "isvoid":{
                ((DroolParser.isvoid)expr).type = "Bool";
                break;
            }
            //{expr;+}
            case "block":{
                for (DroolParser.expression c_expr : ((DroolParser.block)expr).l1) {
                    visit_expr(c_expr);
                }
                ((DroolParser.block)expr).type = ((DroolParser.block)expr).l1.get(((DroolParser.block)expr).l1.size() - 1).type;
                break;
            }
            //ID
            case "object":{
                if (scope.lookUpGlobal(((DroolParser.object)expr).name) != null) {
                    ((DroolParser.object)expr).type = scope.lookUpGlobal(((DroolParser.object)expr).name).typeid;
                    break;
                }
                reportError(filename, ((DroolParser.object)expr).lineNo, "Identifier \"" + ((DroolParser.object)expr).name + "\" being used without being declared in the current scope.");
                ((DroolParser.object)expr).type = "Object";
                break;
            }
            //let ID:TYPE <- expr* in expr
            case "let":{
                visit_expr((DroolParser.let)expr);
                break;
            }
            //case expr of (ID:TYPE => expr)+ esac
            case "typcase":{
                visit_expr((DroolParser.typcase)expr);
                break;
            }
            //class.method
            case "dispatch":{
                visit_expr((DroolParser.dispatch)expr);
                break;
            }
            //class@class.method
            case "static_dispatch":{
                visit_expr((DroolParser.static_dispatch)expr);
                break;
            }
            //Null expr non assignable only for internal workings 
            case "no_expr":{
                ((DroolParser.no_expr)expr).type = "No_type";
                break;
            }
        }
        //If condition to test whether the expr was new_.
        if (expr.getClass() == DroolParser.new_.class) {
            if (classList.containsKey(((DroolParser.new_)expr).typeid) == false) {
                reportError(filename, ((DroolParser.new_)expr).lineNo, "Class type \"" + ((DroolParser.new_)expr).typeid + "\" being used without being defined");
                ((DroolParser.new_)expr).type = "Object";
            } else {
                ((DroolParser.new_)expr).type = ((DroolParser.new_)expr).typeid;
            }
        }
    }

    // Let expressions
    private void visit_expr(DroolParser.let l) {
        scope.enterScope();
        if (classList.containsKey(l.typeid) == false) { //Class for let body is undefined
            reportError(filename, l.lineNo, "Let has undefined class for In");
        }

        if (l.value.getClass()==DroolParser.no_expr.class) {    //Trivial case. No body
            switch(l.typeid){
                case "String": {
                    l.value = new DroolParser.string_const("", l.lineNo);
                    break;
                }
                case "Int": {
                    l.value = new DroolParser.int_const(0, l.lineNo);
                    break;
                }
                case "Bool": {
                    l.value = new DroolParser.bool_const(false, l.lineNo);
                    break;
                }
            }
        } else {
            visit_expr(l.value);
            if (conform(l.value.type, l.typeid) == false) {
                reportError(filename, l.lineNo, "Types \"" + l.value.type + "\" & \"" + l.typeid + "\" encountered do not conform. ");
            }
        }

        scope.insert(l.name, new DroolParser.classListContext.memberDeclarator(l.name, l.typeid, l.value, l.lineNo));
        visit_expr(l.body);                         //There is a body. Explore it.
        l.type = l.body.type;
        scope.exitScope();
    }
    //switch and dcase statements
    private void visit_expr(DroolParser.typcase cases) {
        visit_expr(cases.predicate);
        for (DroolParser.branch single_branch : cases.branches) {
            scope.enterScope();
            String in_type = new String("Object");
            if (classList.containsKey(single_branch.type) == true) {
                in_type = single_branch.type;
                scope.insert(single_branch.name, new DroolParser.classListContext.memberDeclarator(single_branch.name, in_type, single_branch.value, single_branch.lineNo));
                visit_expr(single_branch.value);
                scope.exitScope();
                continue;
            }
            reportError(filename, single_branch.lineNo, "Class \"" + single_branch.type + "\" being used without being defined.");
            scope.insert(single_branch.name, new DroolParser.classListContext.memberDeclarator(single_branch.name, in_type, single_branch.value, single_branch.lineNo));
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
    //dispatch
    private void visit_expr(DroolParser.dispatch disp) {
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
    private void visit_expr(DroolParser.static_dispatch static_disp) {
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
