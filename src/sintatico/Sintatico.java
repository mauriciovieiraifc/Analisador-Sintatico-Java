
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package sintatico;

import java_cup.runtime.Symbol;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintatico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Sintatico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintatico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintatico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\004\000\002\002\013\000\002\002" +
    "\011\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\004\000\002" +
    "\003\003\000\002\003\004\000\002\003\003\000\002\004" +
    "\005\000\002\004\005\000\002\004\007\000\002\004\005" +
    "\000\002\004\005\000\002\004\006\000\002\004\006\000" +
    "\002\004\010\000\002\004\011\000\002\005\011\000\002" +
    "\006\015\000\002\007\003\000\002\007\005\000\002\007" +
    "\005\000\002\007\005\000\002\007\006\000\002\007\007" +
    "\000\002\010\011\000\002\011\013\000\002\012\011\000" +
    "\002\013\012\000\002\013\011\000\002\014\005\000\002" +
    "\014\005\000\002\014\004\000\002\014\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\176\000\006\007\006\013\004\001\002\000\004\014" +
    "\171\001\002\000\004\002\170\001\002\000\004\016\007" +
    "\001\002\000\004\031\010\001\002\000\004\032\011\001" +
    "\002\000\004\033\012\001\002\000\022\006\026\007\022" +
    "\010\016\012\024\017\021\020\014\021\030\036\025\001" +
    "\002\000\024\006\ufff7\007\ufff7\010\ufff7\012\ufff7\017\ufff7" +
    "\020\ufff7\021\ufff7\034\ufff7\036\ufff7\001\002\000\004\031" +
    "\162\001\002\000\024\006\ufff3\007\ufff3\010\ufff3\012\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\034\ufff3\036\ufff3\001\002\000" +
    "\004\031\150\001\002\000\024\006\ufffd\007\ufffd\010\ufffd" +
    "\012\ufffd\017\ufffd\020\ufffd\021\ufffd\034\ufffd\036\ufffd\001" +
    "\002\000\024\006\ufff9\007\ufff9\010\ufff9\012\ufff9\017\ufff9" +
    "\020\ufff9\021\ufff9\034\ufff9\036\ufff9\001\002\000\004\033" +
    "\140\001\002\000\004\036\133\001\002\000\024\006\ufffb" +
    "\007\ufffb\010\ufffb\012\ufffb\017\ufffb\020\ufffb\021\ufffb\034" +
    "\ufffb\036\ufffb\001\002\000\004\031\064\001\002\000\010" +
    "\004\056\024\054\025\055\001\002\000\004\036\043\001" +
    "\002\000\024\006\026\007\022\010\016\012\024\017\021" +
    "\020\014\021\030\034\035\036\025\001\002\000\004\036" +
    "\032\001\002\000\024\006\ufff5\007\ufff5\010\ufff5\012\ufff5" +
    "\017\ufff5\020\ufff5\021\ufff5\034\ufff5\036\ufff5\001\002\000" +
    "\004\035\033\001\002\000\024\006\ufff2\007\ufff2\010\ufff2" +
    "\012\ufff2\017\ufff2\020\ufff2\021\ufff2\034\ufff2\036\ufff2\001" +
    "\002\000\024\006\ufff8\007\ufff8\010\ufff8\012\ufff8\017\ufff8" +
    "\020\ufff8\021\ufff8\034\ufff8\036\ufff8\001\002\000\004\002" +
    "\uffff\001\002\000\024\006\ufff4\007\ufff4\010\ufff4\012\ufff4" +
    "\017\ufff4\020\ufff4\021\ufff4\034\ufff4\036\ufff4\001\002\000" +
    "\024\006\ufffe\007\ufffe\010\ufffe\012\ufffe\017\ufffe\020\ufffe" +
    "\021\ufffe\034\ufffe\036\ufffe\001\002\000\024\006\ufffa\007" +
    "\ufffa\010\ufffa\012\ufffa\017\ufffa\020\ufffa\021\ufffa\034\ufffa" +
    "\036\ufffa\001\002\000\024\006\ufffc\007\ufffc\010\ufffc\012" +
    "\ufffc\017\ufffc\020\ufffc\021\ufffc\034\ufffc\036\ufffc\001\002" +
    "\000\024\006\ufff6\007\ufff6\010\ufff6\012\ufff6\017\ufff6\020" +
    "\ufff6\021\ufff6\034\ufff6\036\ufff6\001\002\000\006\004\045" +
    "\035\044\001\002\000\024\006\uffef\007\uffef\010\uffef\012" +
    "\uffef\017\uffef\020\uffef\021\uffef\034\uffef\036\uffef\001\002" +
    "\000\004\005\046\001\002\000\006\005\047\036\050\001" +
    "\002\000\004\035\053\001\002\000\004\005\051\001\002" +
    "\000\004\035\052\001\002\000\024\006\uffea\007\uffea\010" +
    "\uffea\012\uffea\017\uffea\020\uffea\021\uffea\034\uffea\036\uffea" +
    "\001\002\000\024\006\uffeb\007\uffeb\010\uffeb\012\uffeb\017" +
    "\uffeb\020\uffeb\021\uffeb\034\uffeb\036\uffeb\001\002\000\004" +
    "\037\062\001\002\000\004\035\061\001\002\000\004\037" +
    "\057\001\002\000\004\035\060\001\002\000\024\006\uffec" +
    "\007\uffec\010\uffec\012\uffec\017\uffec\020\uffec\021\uffec\034" +
    "\uffec\036\uffec\001\002\000\024\006\uffee\007\uffee\010\uffee" +
    "\012\uffee\017\uffee\020\uffee\021\uffee\034\uffee\036\uffee\001" +
    "\002\000\004\035\063\001\002\000\024\006\uffed\007\uffed" +
    "\010\uffed\012\uffed\017\uffed\020\uffed\021\uffed\034\uffed\036" +
    "\uffed\001\002\000\006\007\067\036\066\001\002\000\004" +
    "\032\127\001\002\000\004\004\121\001\002\000\004\036" +
    "\070\001\002\000\004\004\071\001\002\000\004\037\072" +
    "\001\002\000\004\035\073\001\002\000\006\026\075\036" +
    "\076\001\002\000\004\035\107\001\002\000\006\032\uffe7" +
    "\035\uffe7\001\002\000\004\023\077\001\002\000\012\005" +
    "\101\026\102\036\103\037\100\001\002\000\006\032\uffe5" +
    "\035\uffe5\001\002\000\006\005\104\036\105\001\002\000" +
    "\006\032\uffe6\035\uffe6\001\002\000\006\032\uffe4\035\uffe4" +
    "\001\002\000\006\032\uffe3\035\uffe3\001\002\000\004\005" +
    "\106\001\002\000\006\032\uffe2\035\uffe2\001\002\000\006" +
    "\025\110\036\111\001\002\000\004\036\120\001\002\000" +
    "\010\004\115\024\113\025\114\001\002\000\004\032\uffde" +
    "\001\002\000\004\037\117\001\002\000\004\032\uffda\001" +
    "\002\000\004\037\116\001\002\000\004\032\uffdb\001\002" +
    "\000\004\032\uffdc\001\002\000\004\032\uffd9\001\002\000" +
    "\004\037\122\001\002\000\004\035\123\001\002\000\006" +
    "\026\075\036\076\001\002\000\004\035\125\001\002\000" +
    "\006\025\110\036\111\001\002\000\004\032\uffdd\001\002" +
    "\000\004\033\130\001\002\000\022\006\026\007\022\010" +
    "\016\012\024\017\021\020\014\021\030\036\025\001\002" +
    "\000\024\006\026\007\022\010\016\012\024\017\021\020" +
    "\014\021\030\034\132\036\025\001\002\000\024\006\uffdf" +
    "\007\uffdf\010\uffdf\012\uffdf\017\uffdf\020\uffdf\021\uffdf\034" +
    "\uffdf\036\uffdf\001\002\000\006\004\135\035\134\001\002" +
    "\000\024\006\ufff1\007\ufff1\010\ufff1\012\ufff1\017\ufff1\020" +
    "\ufff1\021\ufff1\034\ufff1\036\ufff1\001\002\000\004\037\136" +
    "\001\002\000\004\035\137\001\002\000\024\006\ufff0\007" +
    "\ufff0\010\ufff0\012\ufff0\017\ufff0\020\ufff0\021\ufff0\034\ufff0" +
    "\036\ufff0\001\002\000\022\006\026\007\022\010\016\012" +
    "\024\017\021\020\014\021\030\036\025\001\002\000\024" +
    "\006\026\007\022\010\016\012\024\017\021\020\014\021" +
    "\030\034\142\036\025\001\002\000\004\020\143\001\002" +
    "\000\004\031\144\001\002\000\006\026\075\036\076\001" +
    "\002\000\004\032\146\001\002\000\004\035\147\001\002" +
    "\000\024\006\uffe0\007\uffe0\010\uffe0\012\uffe0\017\uffe0\020" +
    "\uffe0\021\uffe0\034\uffe0\036\uffe0\001\002\000\006\026\075" +
    "\036\076\001\002\000\004\032\152\001\002\000\004\033" +
    "\153\001\002\000\022\006\026\007\022\010\016\012\024" +
    "\017\021\020\014\021\030\036\025\001\002\000\024\006" +
    "\026\007\022\010\016\012\024\017\021\020\014\021\030" +
    "\034\155\036\025\001\002\000\026\006\uffe9\007\uffe9\010" +
    "\uffe9\011\156\012\uffe9\017\uffe9\020\uffe9\021\uffe9\034\uffe9" +
    "\036\uffe9\001\002\000\004\033\157\001\002\000\022\006" +
    "\026\007\022\010\016\012\024\017\021\020\014\021\030" +
    "\036\025\001\002\000\024\006\026\007\022\010\016\012" +
    "\024\017\021\020\014\021\030\034\161\036\025\001\002" +
    "\000\024\006\uffe8\007\uffe8\010\uffe8\012\uffe8\017\uffe8\020" +
    "\uffe8\021\uffe8\034\uffe8\036\uffe8\001\002\000\006\026\075" +
    "\036\076\001\002\000\004\032\164\001\002\000\004\033" +
    "\165\001\002\000\022\006\026\007\022\010\016\012\024" +
    "\017\021\020\014\021\030\036\025\001\002\000\024\006" +
    "\026\007\022\010\016\012\024\017\021\020\014\021\030" +
    "\034\167\036\025\001\002\000\024\006\uffe1\007\uffe1\010" +
    "\uffe1\012\uffe1\017\uffe1\020\uffe1\021\uffe1\034\uffe1\036\uffe1" +
    "\001\002\000\004\002\001\001\002\000\004\015\172\001" +
    "\002\000\004\016\173\001\002\000\004\031\174\001\002" +
    "\000\004\032\175\001\002\000\004\033\176\001\002\000" +
    "\022\006\026\007\022\010\016\012\024\017\021\020\014" +
    "\021\030\036\025\001\002\000\024\006\026\007\022\010" +
    "\016\012\024\017\021\020\014\021\030\034\200\036\025" +
    "\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\176\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\026\004\016\005" +
    "\022\006\017\010\012\011\030\012\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\004\036\005\040" +
    "\006\037\010\033\011\041\012\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\064\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\073" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\014\111\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\123\001\001\000\002" +
    "\001\001\000\004\014\125\001\001\000\002\001\001\000" +
    "\002\001\001\000\020\003\130\004\016\005\022\006\017" +
    "\010\012\011\030\012\014\001\001\000\016\004\036\005" +
    "\040\006\037\010\033\011\041\012\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\003\140" +
    "\004\016\005\022\006\017\010\012\011\030\012\014\001" +
    "\001\000\016\004\036\005\040\006\037\010\033\011\041" +
    "\012\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\144\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\150\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\003\153\004\016\005\022" +
    "\006\017\010\012\011\030\012\014\001\001\000\016\004" +
    "\036\005\040\006\037\010\033\011\041\012\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\003\157\004" +
    "\016\005\022\006\017\010\012\011\030\012\014\001\001" +
    "\000\016\004\036\005\040\006\037\010\033\011\041\012" +
    "\035\001\001\000\002\001\001\000\004\007\162\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\003\165\004" +
    "\016\005\022\006\017\010\012\011\030\012\014\001\001" +
    "\000\016\004\036\005\040\006\037\010\033\011\041\012" +
    "\035\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\003\176\004\016\005\022" +
    "\006\017\010\012\011\030\012\014\001\001\000\016\004" +
    "\036\005\040\006\037\010\033\011\041\012\035\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintatico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintatico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintatico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;

    public void syntax_error(Symbol s) {
        this.s = s;
    }

    public Symbol getS() {
        return this.s;
    }
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintatico$actions {
  private final Sintatico parser;

  /** Constructor */
  CUP$Sintatico$actions(Sintatico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintatico$do_action_part00000000(
    int                        CUP$Sintatico$act_num,
    java_cup.runtime.lr_parser CUP$Sintatico$parser,
    java.util.Stack            CUP$Sintatico$stack,
    int                        CUP$Sintatico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintatico$result;

      /* select the action based on the action number */
      switch (CUP$Sintatico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)).value;
		RESULT = start_val;
              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintatico$parser.done_parsing();
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Public Static Void Main Abre_Parenteses Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-8)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Int Main Abre_Parenteses Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCA ::= SENTENCA DECLARACAO 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCA ::= DECLARACAO 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCA ::= SENTENCA IF 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCA ::= SENTENCA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCA ::= SENTENCA WHILE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCA ::= SENTENCA DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCA ::= DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCA ::= SENTENCA FOR 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA",1, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACAO ::= Tipo_Dado Identificador Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACAO ::= Int Identificador Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACAO ::= Int Identificador Igual Numero Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACAO ::= String Identificador Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACAO ::= Identificador Operador_Incremento Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACAO ::= Identificador Operador_Atribuicao Numero Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACAO ::= Identificador Igual Numero Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACAO ::= String Identificador Igual Aspas Aspas Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACAO ::= String Identificador Igual Aspas Identificador Aspas Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IF ::= If Abre_Parenteses SENTENCA_BOOLEANA Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("IF",3, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // IF_ELSE ::= If Abre_Parenteses SENTENCA_BOOLEANA Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves Else Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("IF_ELSE",4, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCA_BOOLEANA ::= Operador_Booleano 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCA_BOOLEANA ::= Identificador Operador_Relacional Operador_Booleano 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCA_BOOLEANA ::= Identificador Operador_Relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCA_BOOLEANA ::= Identificador Operador_Relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCA_BOOLEANA ::= Identificador Operador_Relacional Aspas Aspas 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCA_BOOLEANA ::= Identificador Operador_Relacional Aspas Identificador Aspas 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // WHILE ::= While Abre_Parenteses SENTENCA_BOOLEANA Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // DO_WHILE ::= Do Abre_Chaves SENTENCA Fecha_Chaves While Abre_Parenteses SENTENCA_BOOLEANA Fecha_Parenteses Ponto_Virgula 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-8)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // FOR ::= For Abre_Parenteses SENTENCA_FOR Fecha_Parenteses Abre_Chaves SENTENCA Fecha_Chaves 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCA_FOR ::= Int Identificador Igual Numero Ponto_Virgula SENTENCA_BOOLEANA Ponto_Virgula DECLARACAO_FOR 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_FOR",9, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // SENTENCA_FOR ::= Identificador Igual Numero Ponto_Virgula SENTENCA_BOOLEANA Ponto_Virgula DECLARACAO_FOR 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("SENTENCA_FOR",9, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DECLARACAO_FOR ::= Identificador Operador_Atribuicao Numero 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DECLARACAO_FOR ::= Identificador Igual Numero 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // DECLARACAO_FOR ::= Identificador Operador_Incremento 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DECLARACAO_FOR ::= Operador_Incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintatico$result = parser.getSymbolFactory().newSymbol("DECLARACAO_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintatico$stack.elementAt(CUP$Sintatico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintatico$stack.peek()), RESULT);
            }
          return CUP$Sintatico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintatico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintatico$do_action(
    int                        CUP$Sintatico$act_num,
    java_cup.runtime.lr_parser CUP$Sintatico$parser,
    java.util.Stack            CUP$Sintatico$stack,
    int                        CUP$Sintatico$top)
    throws java.lang.Exception
    {
              return CUP$Sintatico$do_action_part00000000(
                               CUP$Sintatico$act_num,
                               CUP$Sintatico$parser,
                               CUP$Sintatico$stack,
                               CUP$Sintatico$top);
    }
}
