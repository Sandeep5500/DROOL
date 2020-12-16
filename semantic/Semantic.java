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

    // Hashmap containing all the classes
    public HashMap<String, ClassDefn> classList = new HashMap<String, ClassDefn>();
    private String filename;

    //functon to recursilvely travel classlist and store parents of each class
    public HashMap<String, Array<String> > parent = new Hashmap<>();
    public void Inheritance(DroolParser.ClassList ctx, parent){
        if(ctx == null)
            return;
        String temp = ctx.classDefn().classHead().className().Identifier().getText();
        classList[temp] = ctx.classDefn();
        if (ctx.classDefn().classHead().inheritanceClause() != null)
            parent.put(temp, ctx.classDefn().inheritanceClause().getText().split());
        System.out.println(ctx.classDefn().classHead().className().Identifier())
        Inheritance(ctx.classList()); 
    }
    public Semantic(DroolParser.programContext program) 

    // Checks if is there a Main function
        if (functionDefn.Identifier.containsKey("Main") == false) {
            reportError(filename, 1, "Program does not contain 'Main' function");
        } 

    }
     //returns the number of graph in the adjacency list of the class graph 
    private int ClassNumber(HashMap<String, Array<String>> class_node,String name )
    {
        for (int i = 0 ; i < class_node.size(); i++ )
        {
            if( class_node.get(i) != null &&((class_node.get(i)).name).equals(name))
                return i; 
        }
        return -1;
    }

    //checks for cycles in a graph takes the parent hashmap which is an adjacency list as the arguments
    private void GraphHandler(HashMap<String, Array<String>_> classes) {

        // contains all the classes
        // defines a Array list variable of type <DroolParser.class_> which stroes all the classes
        ArrayList<DroolParser.class_> class_node = new ArrayList<DroolParser.class_>();     

        // contains inheritance graph all the classes
        ArrayList<ArrayList<Integer>> adjacency_list = new ArrayList<ArrayList<Integer>>();
       
        
        boolean flag = true;

        // checks for proper class redefinition and inheritance from class and then adds to the graph
        int m = 0;
        while ( m < classes.size()) {

            //check if class is redefined again
            if ( ( classNumber(class_node, classes.get(m).name)!= -1)) {
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
            String paren = classes.get(n).parent;
            if (classNumber(class_node, paren) == -1) {
                reportError(classes.get(n).filename, classes.get(n).lineNo, "Class '" + classes.get(n).name + "' inherits from an undefined class or non-existing class '" + paren + "'.");
                flag = false;
            }

            
        //function call to detect cycles
        if (flag == false || isCyclic(adjacency_list, class_node)) {
            System.exit(0);
        }
        // adds the classes to classlist
        makeClassList(adjacency_list,class_node);
    }


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
                                             

        Iterator<DroolParser.formal> cl_m_for_Iter = cl_m.formals.iterator();
        
        visit_expr(cl_m.body);
        if (conform(cl_m.body.type, cl_m.typeid) != true)          
            reportError(filename, cl_m.lineNo, "Types \"" + cl_m.body.type + ", " + cl_m.typeid + "\" do not conform.");
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

    

    //Type checking
   
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
    // private void visit_expr(DroolParser.let l) {
         
    //     if (classList.containsKey(l.typeid) == false) { //Class for let body is undefined
    //         reportError(filename, l.lineNo, "Let has undefined class for In");
    //     }

    //     if (l.value.getClass()==DroolParser.no_expr.class) {    //Trivial case. No body
    //         switch(l.typeid){
    //             case "String": {
    //                 l.value = new DroolParser.string_const("", l.lineNo);
    //                 break;
    //             }
    //             case "Int": {
    //                 l.value = new DroolParser.int_const(0, l.lineNo);
    //                 break;
    //             }
    //             case "Bool": {
    //                 l.value = new DroolParser.bool_const(false, l.lineNo);
    //                 break;
    //             }
    //         }
    //     } else {
    //         visit_expr(l.value);
    //         if (conform(l.value.type, l.typeid) == false) {
    //             reportError(filename, l.lineNo, "Types \"" + l.value.type + "\" & \"" + l.typeid + "\" encountered do not conform. ");
    //         }
    //     }

        
    //     visit_expr(l.body);                         //There is a body. Explore it.
    //     l.type = l.body.type;
        
    // }
    //switch and duplicate case statements
    // private void visit_expr(DroolParser.typcase cases) {
    //     visit_expr(cases.predicate);
    //     for (DroolParser.branch single_branch : cases.branches) {
             
    //         String in_type = new String("Object");
    //         if (classList.containsKey(single_branch.type) == true) {
    //             in_type = single_branch.type
    //             continue;
    //         }
    //         reportError(filename, single_branch.lineNo, "Class \"" + single_branch.type + "\" being used without being defined.");
    //         visit_expr(single_branch.value);      
    //     }
    //     //Find least common ancestor for type checking.
    //     String type = null;
    //     for (int i = 0; i < cases.branches.size(); i++) {
    //         for (int j = i + 1; j < cases.branches.size(); j++) {
    //             if (cases.branches.get(i).type.equals(cases.branches.get(j).type)) {
    //                 reportError(filename, cases.branches.get(j).lineNo, "Duplicate branch types \"" + cases.branches.get(i).type + "\"encountered in case expression.");
    //             }
    //         }
    //         cases.type = ((i!=0)?lca(type, cases.branches.get(i).value.type):cases.branches.get(i).value.type);
    //     }
    // }
    
    // Least common ancestor of two nodes in AST
    // private String lca(String type_1, String type_2) {
    //     return (type_1.equals(type_2))?type_1:((classList.get(type_1).height)<(classList.get(type_2).height)?lca(type_2,type_1):lca(classList.get(type_1).parent, type_2));
    // }
    
}
