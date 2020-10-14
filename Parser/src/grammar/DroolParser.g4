parser grammar DroolParser;

options {
	tokenVocab = CoolLexer;
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

program :
	
;

classs_list:
	[class_element]+
;

class_element:
	CLASS TYPEID [INHERITS TYPEID] '{' feature_list '}'
;

feature_list:
	(feature)+
;

feature:
	ID COLON LPAREN formal(COMMA formal)*  RPAREN COLON TYPEID LBRACE EXPR RBRACE
	| ID COLON TYPEID ASSIGNVAL expr
;

formal:
	ID COLON TYPEID
;

expr_list:
	expr_element((COMMA expr)*)?
;
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
