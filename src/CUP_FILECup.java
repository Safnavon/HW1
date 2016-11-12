
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Nov 12 19:44:18 IST 2016
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Nov 12 19:44:18 IST 2016
  */
public class CUP_FILECup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public CUP_FILECup() {super();}

  /** Constructor which sets the default scanner. */
  public CUP_FILECup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CUP_FILECup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\005\000\002\002\004\000\002\002" +
    "\005\000\002\002\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\003\003\000\002\004\005\000" +
    "\002\004\003\000\002\004\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\022\002\ufff7\003\005\004\ufff7\005\ufff7\006" +
    "\ufff7\007\ufff7\010\010\062\004\001\002\000\016\002\ufff8" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8\001\002\000" +
    "\016\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\011\ufffa" +
    "\001\002\000\016\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007" +
    "\ufffb\011\ufffb\001\002\000\016\002\ufffe\004\ufffe\005\ufffe" +
    "\006\017\007\016\011\ufffe\001\002\000\022\003\005\004" +
    "\ufff7\005\ufff7\006\ufff7\007\ufff7\010\010\011\ufff7\062\004" +
    "\001\002\000\010\002\014\004\012\005\013\001\002\000" +
    "\024\002\ufff7\003\005\004\ufff7\005\ufff7\006\ufff7\007\ufff7" +
    "\010\010\011\ufff7\062\004\001\002\000\024\002\ufff7\003" +
    "\005\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\010\011\ufff7" +
    "\062\004\001\002\000\004\002\000\001\002\000\016\002" +
    "\uffff\004\uffff\005\uffff\006\017\007\016\011\uffff\001\002" +
    "\000\022\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010" +
    "\010\011\ufff7\062\004\001\002\000\022\002\ufff7\004\ufff7" +
    "\005\ufff7\006\ufff7\007\ufff7\010\010\011\ufff7\062\004\001" +
    "\002\000\016\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd" +
    "\011\ufffd\001\002\000\016\002\ufffc\004\ufffc\005\ufffc\006" +
    "\ufffc\007\ufffc\011\ufffc\001\002\000\016\002\001\004\001" +
    "\005\001\006\017\007\016\011\001\001\002\000\010\004" +
    "\012\005\013\011\024\001\002\000\016\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\011\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\010\002\010\003\006\004\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\002\022\003\006\004\005\001\001\000" +
    "\002\001\001\000\006\003\021\004\005\001\001\000\006" +
    "\003\014\004\005\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\020\001\001\000\004\004\017\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CUP_FILECup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CUP_FILECup$actions(this);
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
    return action_obj.CUP$CUP_FILECup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$CUP_FILECup$actions {
  private final CUP_FILECup parser;

  /** Constructor */
  CUP$CUP_FILECup$actions(CUP_FILECup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$CUP_FILECup$do_action(
    int                        CUP$CUP_FILECup$act_num,
    java_cup.runtime.lr_parser CUP$CUP_FILECup$parser,
    java.util.Stack            CUP$CUP_FILECup$stack,
    int                        CUP$CUP_FILECup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CUP_FILECup$result;

      /* select the action based on the action number */
      switch (CUP$CUP_FILECup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // term ::= 
            {
              Integer RESULT =null;

              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // term ::= INTEGER 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = n; 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // term ::= LP expr RP 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).value;
		 RESULT = e; 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // factor ::= error 
            {
              Integer RESULT =null;
		 System.out.printf("errr"); 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("factor",1, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // factor ::= term 
            {
              Integer RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(t.intValue());                
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("factor",1, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // factor ::= factor DIVIDE term 
            {
              Integer RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(f.intValue() / t.intValue()); 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("factor",1, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // factor ::= factor MULTIPLY term 
            {
              Integer RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(f.intValue() * t.intValue()); 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("factor",1, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= factor 
            {
              Integer RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(f.intValue());                
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr MINUS factor 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(e.intValue() - f.intValue()); 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)).value;
		RESULT = start_val;
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-1)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CUP_FILECup$parser.done_parsing();
          return CUP$CUP_FILECup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= expr PLUS factor 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$CUP_FILECup$stack.peek()).value;
		 RESULT = new Integer(e.intValue() + f.intValue()); 
              CUP$CUP_FILECup$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.elementAt(CUP$CUP_FILECup$top-2)), ((java_cup.runtime.Symbol)CUP$CUP_FILECup$stack.peek()), RESULT);
            }
          return CUP$CUP_FILECup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

