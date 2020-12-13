import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class semantPhase1 extends droolBaseListener{

    //class table map which has key=class name , value = parent name
    Map<String, String> class_table = new HashMap<String, String>();
 
    //method table[class_name]<method name, pointer to method object>
    Map<String, Map<String, method>> method_table = new HashMap<String, Map<String,
    method>>();
    Map<String, method> mt = new HashMap<String, method>();
    LinkedHashMap<String, String> formals = new LinkedHashMap<String, String>();
    
    //attribute table <attribute name, attribute type>
    Map<String, Map<String, String>> attr_table = new HashMap<String, Map<String, String>>();
    Map<String, String> attr = new HashMap<String, String>();
    SymbolTable object_table = new SymbolTable();
    
    //program

    @Override publicvoid enterProgram(droolParser.ProgramContext ctx) {
        // blockdeclaration|functiondef|classdef
        
        
        //inserting basic classes
                                    class_table.put("Object", "No_class");
                                    class_table.put("IO", "Object");
                                    class_table.put("Bool", "Object");
                                    class_table.put("String", "Object");
                                    class_table.put("Int", "Object");
                                    class_table.put("Float","Object");
                                    class_table.put("Matrix","Object");
                                    class_table.put("Vertex","Object");
                                    class_table.put("Graph","Object");
                                    class_table.put("Edge","Object");
                                    class_table.put("Void","Object");
                                    class_table.put("className","Object");
                                    //class_table.put("SELF_TYPE", "No_class");
                                }