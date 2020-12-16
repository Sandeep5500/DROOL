package drool;
import java.util.List;
public class AST{
	public static class ASTNode {
		int lineNo;
	}
	public static String sp = "  ";

        static String escapeSpecialCharacters(String text) {
                return
                        text
                                .replaceAll("\\\\", "\\\\\\\\")
                                .replaceAll("\n", "\\\\n")
                                .replaceAll("\t", "\\\\t")
                                .replaceAll("\b", "\\\\b")
                                .replaceAll("\f", "\\\\f")
                                .replaceAll("\"", "\\\\\"")
                                .replaceAll("\r", "\\\\015")
                                .replaceAll("\033","\\\\033")
                                .replaceAll("\001","\\\\001")
                                .replaceAll("\002","\\\\002")
                                .replaceAll("\003","\\\\003")
                                .replaceAll("\004","\\\\004")
                                .replaceAll("\022","\\\\022")
                                .replaceAll("\013","\\\\013")
                                .replaceAll("\000", "\\\\000")
                                ;
        }

	

	public static class declaration extends ASTNode {
		String type;
		public declaration(){
			type = "_no_type";
		}
		String getString(String space){
			return "";
		};
	}
	public static class no_expr extends declaration {
		public no_expr(int l){
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_no_expr\n"+space+": "+type;
		}
	}
	public static class bool_const extends  primaryExpr{
		public boolean value;
		public bool_const(boolean v, int l){
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_bool\n"+space+sp+(value?"1":"0")+"\n"+space+": "+type;
		}
	}
	public static class string_const extends  primaryExpr{
		public String value;
		public string_const(String v, int l){
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_string\n"+space+sp+"\""+escapeSpecialCharacters(value)+"\""+"\n"+space+": "+type;
		}
	}

	public static class int_const extends  primaryExpr{
		public int value;
		public int_const(int v, int l){
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_int\n"+space+sp+value+"\n"+space+": "+type;
		}
	}
  
  public static class float_const extends  primaryExpr{
		public float value;
		public float_const(float v, int l){
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_float\n"+space+sp+value+"\n"+space+": "+type;
		}
	}

  public static class vertex_const extends  primaryExpr{
		public  primaryExpr value;
		public vertex_const( primaryExpr v, int l){
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_vertex\n"+space+sp+value+"\n"+space+": "+type;
		}
	}

	public static class object extends  primaryExpr{
		public String name;
		public object(String v, int l){
			name = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_object\n"+space+sp+name+"\n"+space+": "+type;
		}
	}

  //tildae ~
	public static class postfixExpr extends  primaryExpr{
		public  primaryExpr e1;
		public comp( primaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_comp\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //NOT !
	// public static class neg extends  postfixExpr{
	// 	public  primaryExpr e1;
	// 	public neg( primaryExpr v, int l){
	// 		e1 = v;
	// 		lineNo = l;
	// 	}
	// 	String getString(String space){
	// 		return space+"#"+lineNo+"\n"+space+"_neg\n"+e1.getString(space+sp)+"\n"+space+": "+type;
	// 	}
	// }

  //orexp
	public static class unary_or extends  unaryExpr{
		public  unaryExpr e1;
		public unary_or( unaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_unary_or\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //and &exp
	public static class unary_and extends  unaryExpr{
		public  unaryExpr e1;
		public unary_and( primaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_unary_and\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //*exp
	public static class unary_mul extends  unaryExpr{
		public  unaryExpr e1;
		public unsary_mul( unaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_unary_mul\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //+exp
	public static class unary_plus extends  unaryExpr{
		public  unaryExpr e1;
		public unary_plus( unaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_unary_or\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //-exp
	public static class unary_minus extends  unaryExpr{
		public  unaryExpr e1;
		public unary_minus( unaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_unary_minus\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //plusplus
	public static class plusplus extends  unaryExpr{
		public  unaryExpr e1;
		public plusplus( primaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"plusplus\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //--
	public static class minusminus extends  unaryExpr{
		public  unaryExpr e1;
		public minusminus( primaryExpr v, int l){
			e1 = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"minusminus\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	public static class divide extends  multiplicationExpr{
		public   multiplicationExpr e1;
		public   multiplicationExpr e2;
		public divide(  multiplicationExpr v1,   multiplicationExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_divide\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //*
	public static class mul extends   multiplicationExpr{
		public   multiplicationExpr e1;
		public   multiplicationExpr e2;
		public mul(  multiplicationExpr v1,  additiveExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_mul\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //-
	public static class sub extends  additiveExpr{
		public  additiveExpr e1;
		public  additiveExpr e2;
		public sub( additiveExpr v1,  additiveExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_sub\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //+
	public static class plus extends  additiveExpr{
		public  additiveExpr e1;
		public  additiveExpr e2;
		public plus( additiveExpr v1,  additiveExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_plus\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //equal ==
	public static class eq extends  primaryExpr{
		public  primaryExpr e1;
		public  primaryExpr e2;
		public eq( primaryExpr v1,  primaryExpr v2, int l){
			e1=v1;
			e2=v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_eq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //notequal !=
	public static class neq extends  comparisionExpr{
		public  comparisionExpr e1;
		public  comparisionExpr e2;
		public neq( comparisionExpr v1,  comparisionExpr v2, int l){
			e1=v1;
			e2=v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_neq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}
	
  //<=
	public static class leq extends  comparisionExpr{
		public  comparisionExpr e1;
		public  comparisionExpr e2;
		public leq( comparisionExpr v1,  comparisionExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_leq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}
  
  //<
	public static class lt extends  comparisionExpr{
		public  comparisionExpr e1;
		public  comparisionExpr e2;
		public lt( comparisionExpr v1,  comparisionExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_lt\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //>=
	public static class geq extends  comparisionExpr{
		public  comparisionExpr e1;
		public  comparisionExpr e2;
		public geq( comparisionExpr v1,  comparisionExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_geq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //>
	public static class gt extends  comparisionExpr{
		public  comparisionExpr e1;
		public  comparisionExpr e2;
		public gt( comparisionExpr v1,  comparisionExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_gt\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}
  

  // /
	
  //%
	public static class mod extends  multiplicationExpr{
		public  primaryExpr e1;
		public  multiplicationExpr e2;
		public mod( multiplicationExpr v1,  multiplicationExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_mod\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //binary xor ^
	public static class bin_xor extends  equalityExpr{
		public  equalityExpr e1;
		public  equalityExpr e2;
		public bin_xor( equalityExpr v1,  equalityExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_bin_xor\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //binary and &&
	public static class bin_and extends  equalityExpr{
		public  equalityExpr e1;
		public  equalityExpr e2;
		public bin_and( equalityExpr v1,  equalityExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_bin_and\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //binary or ||
	public static class bin_or extends  binXorExpr{
		public  binXorExpr e1;
		public  binXorExpr e2;
		public bin_or( binXorExpr v1,  binXorExpr v2, int l){
			e1 = v1;
			e2 = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_bin_or\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	//=
	public static class assign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public assign(String n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_assign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}
	//*=
  public static class mulassign extends  primaryExpr{
		public  orExpr name;
		public  orExpr e1;
		public mulassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_mulassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	// /=
  public static class divassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public divassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_divassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	// %=
	public static class modassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public modassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_modassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //+=
	public static class plusassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public plusassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_plusassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //-=
	public static class minusassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public minusassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_minusassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

 // &=
	public static class andassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public andassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_andassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //^=
	public static class xorassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public xorassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_xorassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //|=
	public static class orassign extends  orExpr{
		public  orExpr name;
		public  orExpr e1;
		public orassign( orExpr n,  orExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_orassign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  // >>
	public static class pull extends  graph{
		public  graph name;
		public  graph e1;
		public pull( graph n,  graph v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_pull\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //<<
	public static class push extends  graph{
		public  graph name;
		public  graph e1;
		public push( graph n,  graph v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_push\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	// hashtag #
	public static class hashtag extends  graph{
		public  graph name;
		public  graph e1;
		public hashtag( graph name, graph v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_pull\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	// qmark ?
	public static class qmark extends  graph{
		public  graph name;
		public  graph e1;
		public qmark( graph name, graph v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_pull\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}


  
  
 // add row
  public static class addr extends  primaryExpr{
		public  primaryExpr name;
		public  primaryExpr e1;
		public addr( primaryExpr n,  primaryExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_addr\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	//add coloumn
  public static class addc extends  unaryExpr{
		public  unaryExpr name;
		public  unaryExpr e1;
		public addc( unaryExpr n,  unaryExpr v1, int l){
			name = n;
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_addc\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //delete row
	public static class delr extends  unaryExpr{
		public  unaryExpr e1;
		public delr( unaryExpr v1, int l){
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_delr\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}

	//delete column
	public static class delc extends  unaryExpr{
		public  unaryExpr e1;
		public delc( unaryExpr v1, int l){
			e1 = v1;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_delc\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
		}
	}


  //compund statement
  public static class block extends  declaration{
		public List< declaration> l1;
		public block(List< declaration> v1, int l){
			l1 = v1;
			lineNo = l;
		}
		String getString(String space){
			String str = space+"#"+lineNo+"\n"+space+"_block\n";
			for ( declaration e1 : l1){
				str += e1.getString(space+sp)+"\n";
			}
			str+=space+": "+type;
			return str;
		}
	}

  //while
	public static class whileloop extends  statement{
		public  statement predicate;
		public  statement body;
		public whileloop( statement v1,  statement v2, int l){
			predicate = v1;
			body = v2;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_whileloop\n"+predicate.getString(space+sp)+"\n"+body.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //for
  public static class forloop extends  statement{
    public  statement init;
		public  statement predicate;
    public  statement update;
		public  statement body;
		public loop( statement v1,  statement v2, statement v3,  statement v4 int l){
			init = v1;
      		predicate = v2;
           update = v3;
			body = v4;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_forloop\n"+predicate.getString(space+sp)+"\n"+body.getString(space+sp)+"\n"+space+": "+type;
		}
	}

  //ifthen
	public static class cond extends  statement{
		public  statement predicate;
		public  statement ifbody;
		public  statement elsebody;
		public cond( statement v1,  statement v2,  statement v3, int l){
			predicate = v1;
			ifbody = v2;
			elsebody = v3;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_cond\n"+predicate.getString(space+sp)+"\n"+ifbody.getString(space+sp)+"\n"+elsebody.getString(space+sp)+"\n"+space+": "+type;
		}
	}
	
	public static class switchcase extends statement{
		public  statement predicate;
		public List<funcDefn> functions;
		public switchcase( statement p, List<funcDefn> b, int l){
			predicate = p;
			functions = b;
			lineNo = l;
		}
		String getString(String space){
			String str = space+"#"+lineNo+"\n"+space+"_switchcase\n"+predicate.getString(space+sp)+"\n";
			for ( funcDefn b1 : functions ) {
				str += b1.getString(space+sp)+"\n";
			}
			str += space+": "+type;
			return str;
		}
	}
	public static class funcDefn extends ASTNode {
		public String name;
		public String type;
		public  primaryExpr value;
		public funcDefn(String n, String t,  primaryExpr v, int l){
			name = n;
			type = t;
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_funcDefn\n"+space+sp+name+"\n"+space+sp+type+"\n"+value.getString(space+sp);
		}
	}
	public static class class_head extends ASTNode {
		public String name;
		public String typeid;
		public class_head(String n, String t, int l){
			name = n;
			typeid = t;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_class_head\n"+space+sp+name+"\n"+space+sp+typeid;
		}
	}
	public static class memberDeclaration extends ASTNode {
		public memberDeclaration(){
		}
		String getString(String space){
			return "";
		}

	}
	public static class method extends memberDeclaration {
		public String name;
		public List<class_head> class_heads;
		public String typeid;
		public  primaryExpr body;
		public method(String n, List<class_head> f, String t,  primaryExpr b, int l){
			name = n;
			class_heads = f;
			typeid = t;
			body = b;
			lineNo = l;
		}
		String getString(String space){
			String str = space+"#"+lineNo+"\n"+space+"_method\n"+space+sp+name+"\n";
			for ( class_head f : class_heads ) {
				str += f.getString(space+sp)+"\n";
			}
			str += space+sp+typeid+"\n"+body.getString(space+sp);
			return str;
		}
	}
	public static class member extends memberDeclaration {
		public String name;
		public String typeid;
		public  primaryExpr value;
		public member(String n, String t,  primaryExpr v, int l){
			name = n;
			typeid = t;
			value = v;
			lineNo = l;
		}
		String getString(String space){
			return space+"#"+lineNo+"\n"+space+"_member\n"+space+sp+name+"\n"+space+sp+typeid+"\n"+value.getString(space+sp);
		}
	}
	public static class class_ extends classList {
		public String name;
		public String filename;
		public String parent;
		public List<memberDeclaration> memberDeclarations;
		public class_(String n, String f, String p, List<memberDeclaration> fs, int l){
			name = n;
			filename = f;
			parent = p;
			memberDeclarations = fs;
			lineNo = l;
		}
		String getString(String space){
			String str;
			str = space+"#"+lineNo+"\n"+space+"_class\n"+space+sp+name+"\n"+space+sp+parent+"\n"+space+sp+"\""+filename+"\""+"\n"+space+sp+"(\n";
			for ( memberDeclaration f : memberDeclarations ) {
				str += f.getString(space+sp)+"\n";
			}
			str += space+sp+")";
			return str;
		}
	}
	public static class program extends ASTNode {
		public List<class_> classes;
		public program(List<class_> c, int l){
			classes = c;
			lineNo = l;
		}
		String getString(String space){
			String str;
			str = space+"#"+lineNo+"\n"+space+"_program";
			for ( class_ c : classes ) {
				str += "\n"+c.getString(space+sp);
			}
			
			return str;
		}
	}
}
