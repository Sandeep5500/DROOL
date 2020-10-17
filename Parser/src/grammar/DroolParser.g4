parser grammar DroolParser;

options {
	tokenVocab = DroolLexer;
}

@header{
	import cool.AST;
	import java.util.List;
}

@members{
	String filename;
	public void setFilename(String f){
		filename = f;
	}

}	

program returns [AST.program value] : 
	cl=class_list EOF 
	{
		$value = new AST.program($cl.value, $cl.value.get(0).lineNo);
	}
	
	
;

class_list returns [ArrayList<AST.class_element> value]
	@init
	{
		$value = new ArrayList<AST.class_element>();
	}
	:
		(c = class_element SEMICOLON {$value.add($c.value);})+
	
	//[class_element]+
;

class_element returns [AST.class_element value]
	//class type { [[feature]]* }
	:cl=CLASS type=TYPEID LBRACE fl=feature_list RBRACE
	{
		$value = new AST.class_element($type.getText(), filename, "Object", $feature_list.value, $cl.getLine());
	}

	//class TYPE [inherits TYPE] { [[feature]]* }
	| cl=CLASS type=TYPEID INHERITS parent_type=TYPEID LBRACE fl=feature_list RBRACE
	{
		$value = new AST.class_element($type.getText(), filename, $parent_type.getText(), $feature_list.value, $cl.getLine());
	}
	
	//CLASS TYPEID [INHERITS TYPEID] '{' feature_list '}'
;

feature_list returns [ArrayList<AST.feature> value]
	//(feature ;) *
	@init
	{
		$value = new ArrayList<AST.feature>();
	}
	:(f=feature SEMICOLON {$value.add($f.value);})*	
	
;


feature returns [AST.feature value]
	//function
	:function=method
	{
		$value=$feature.value
	}
	|variable=attr
	{
		$value=$variable.value
	}

	// ID COLON LPAREN formal(COMMA formal)*  RPAREN COLON TYPEID LBRACE EXPR RBRACE
	// | ID COLON TYPEID ASSIGNVAL expr
;

attr returns [AST.attr value]
	// ID:TYPE
	:id=OBJECTID COLON type=TYPEID
	{
		$value=  new AST.attr($id.getText(), $type.getText(), new AST.no_expr($id.getLine()), $id.getLine());
	}
	//ID:TYPE[<-EXPR]
	|id=OBJECTID COLON type= TYPEID ASSIGN expression=expr
	{
		$value = new AST.attr($id.getText(), $type.getText(), $expression.value, $id.getLine());
	}
	;

method returns [AST.method value]
	// ID(FORMAL):TYPE{EXPR}
	:id=OBJECTID LPAREN RPAREN COLON type=TYPEID LBRACE expression=expr RBRACE
	{
		$value = new AST.method($id.getText(), new ArrayList<AST.formal>(), $type.getText(), $expression.value, $id.getLine());
	}
	//ID(FORMAL_LIST+):TYPE{EXPR}
	| id=OBJECTID LPAREN fr_l=formal_list RPAREN COLON type=TYPEID LBRACE expression=expr RBRACE
	{
		$value = new AST.method($id.getText(), $fr_l.value, $type.getText(), $expression.value, $id.getLine());
	}
	;	

formal_list returns [Arraylist<AST.formal>value]
	@init
	{
		$value = new ArrayList<AST.formal>();
	}
	://([formal[[,formal]]*)
		a = formal {$value.add($c.value);} (COMMA b = formal {$value.add($y.value);})*
	;

formal returns [AST.formal value]
	//ID:TYPE
	:id=OBJECTID COLON type=TYPEID
	{
		$value = new AST.formal($id.getText(), $type.getText(), $id.getLine()) ;
	}
	;
	

//expr_list:[expr [[, expr]]* ]
expr_list returns [ArrayList<AST.expr> value]
	@init
	{
		$value = new ArrayList<AST.expr>();
	}
	:
		( expression = expr {$value.add($expression.value);} (COMMA expression = expr {$value.add($expression.value);})* )?
	;
	//expr_element((COMMA expr)*)?

//till here done	

expr_element:
	id ASSIGNVAL expr
	| expr_element ATSYM TYPEID DOT ID expr_list
	| ID LPAREN expr_list RPAREN
	| IF expr_element THEN expr_element ELSE expr_element FI
	| WHILE expr_element LOOP expr_element POOL
	| expr_element STAR expr_element
	| expr_element EQUALS expr_element
	| expr_element SLASH expr_element
	| expr_element PLUS expr_element
	| expr_element MINUS expr_element
	| expr_element DSLASH expr_element
	| expr_element OR expr_element
	| expr_element AND expr_element
	| expr_element BOR expr_element
	| expr_element BAND expr_element
	| expr_element XOR expr_element
	| expr_element LT expr_element
	| expr_element GT expr_element
	| expr_element LE expr_element
	| expr_element GE expr_element
	| expr_element POW expr_element
	| expr_element MOD expr_element
	| TILDE expr_element 
	| ID
	| INT_CONST
	| FLOAT_CONST
	| MATRIX_CONST
	| GRAPH_CONST
	| EDGE_CONST
	| vERTEX_COST
	| BOOL_CONST
	| STRING_CONST
	| ID
;
