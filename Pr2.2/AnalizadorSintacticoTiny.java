
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Fri Apr 09 13:15:24 CEST 2021
//----------------------------------------------------

package asint;

import java_cup.runtime.*;
import alex.AnalizadorLexicoTiny;
import alex.UnidadLexica;
import errors.GestionErroresTiny;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Fri Apr 09 13:15:24 CEST 2021
  */
public class AnalizadorSintacticoTiny extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintacticoTiny() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\003\000\002\002\004\000\002\004" +
    "\004\000\002\004\002\000\002\003\005\000\002\003\004" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003\000\002\012\003\000\002\012\003\000\002" +
    "\013\003\000\002\013\003\000\002\014\003\000\002\014" +
    "\003\000\002\005\003\000\002\005\005\000\002\006\003" +
    "\000\002\006\005\000\002\006\006\000\002\006\006\000" +
    "\002\006\005\000\002\007\003\000\002\007\005\000\002" +
    "\010\003\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\010\002\ufffe\005\007\022\005\001\002\000" +
    "\004\002\001\001\002\000\014\005\020\016\016\024\013" +
    "\025\017\026\021\001\002\000\004\002\057\001\002\000" +
    "\004\021\012\001\002\000\010\002\ufffe\005\007\022\005" +
    "\001\002\000\004\002\uffff\001\002\000\014\005\020\016" +
    "\016\024\013\025\017\026\021\001\002\000\012\012\031" +
    "\013\035\014\037\015\036\001\002\000\010\002\ufffd\005" +
    "\ufffd\022\ufffd\001\002\000\012\002\ufff1\005\ufff1\022\ufff1" +
    "\023\053\001\002\000\006\004\045\016\043\001\002\000" +
    "\012\012\031\013\035\014\037\015\036\001\002\000\012" +
    "\002\uffef\005\uffef\022\uffef\023\uffef\001\002\000\012\006" +
    "\023\007\022\010\026\011\024\001\002\000\004\004\ufffa" +
    "\001\002\000\004\004\ufffb\001\002\000\004\004\ufff8\001" +
    "\002\000\004\004\027\001\002\000\004\004\ufff9\001\002" +
    "\000\014\005\020\016\016\024\013\025\017\026\021\001" +
    "\002\000\012\002\uffec\005\uffec\022\uffec\023\uffec\001\002" +
    "\000\016\004\ufff5\005\ufff5\016\ufff5\024\ufff5\025\ufff5\026" +
    "\ufff5\001\002\000\016\004\ufff6\005\ufff6\016\ufff6\024\ufff6" +
    "\025\ufff6\026\ufff6\001\002\000\016\004\ufff7\005\ufff7\016" +
    "\ufff7\024\ufff7\025\ufff7\026\ufff7\001\002\000\004\004\040" +
    "\001\002\000\016\004\ufff4\005\ufff4\016\ufff4\024\ufff4\025" +
    "\ufff4\026\ufff4\001\002\000\016\004\ufff2\005\ufff2\016\ufff2" +
    "\024\ufff2\025\ufff2\026\ufff2\001\002\000\016\004\ufff3\005" +
    "\ufff3\016\ufff3\024\ufff3\025\ufff3\026\ufff3\001\002\000\014" +
    "\005\020\016\016\024\013\025\017\026\021\001\002\000" +
    "\012\002\uffed\005\uffed\022\uffed\023\uffed\001\002\000\006" +
    "\017\uffea\020\051\001\002\000\006\004\045\016\043\001" +
    "\002\000\004\017\046\001\002\000\006\017\uffe8\020\uffe8" +
    "\001\002\000\012\002\uffeb\005\uffeb\022\uffeb\023\uffeb\001" +
    "\002\000\004\017\050\001\002\000\006\017\uffe7\020\uffe7" +
    "\001\002\000\006\004\045\016\043\001\002\000\004\017" +
    "\uffe9\001\002\000\014\005\020\016\016\024\013\025\017" +
    "\026\021\001\002\000\010\002\ufff0\005\ufff0\022\ufff0\001" +
    "\002\000\014\005\020\016\016\024\013\025\017\026\021" +
    "\001\002\000\012\002\uffee\005\uffee\022\uffee\023\uffee\001" +
    "\002\000\004\002\000\001\002\000\010\002\ufffc\005\ufffc" +
    "\022\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\010\002\005\003\007\004\003\001\001\000" +
    "\002\001\001\000\006\005\057\006\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\003\007\004\010\001" +
    "\001\000\002\001\001\000\006\005\013\006\014\001\001" +
    "\000\010\012\054\013\032\014\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\007\043\010\041\001\001" +
    "\000\010\012\033\013\032\014\031\001\001\000\002\001" +
    "\001\000\004\011\024\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\040\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\007\046\010\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\007\051\010\041\001\001\000\002" +
    "\001\001\000\006\005\053\006\014\001\001\000\002\001" +
    "\001\000\004\006\055\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintacticoTiny$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintacticoTiny$actions(this);
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
    return action_obj.CUP$AnalizadorSintacticoTiny$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
   errores = new GestionErroresTiny();
   AnalizadorLexicoTiny alex = (AnalizadorLexicoTiny)getScanner();
   alex.fijaGestionErrores(errores);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }

 
   private GestionErroresTiny errores;
   public void syntax_error(Symbol unidadLexica) {
     errores.errorSintactico((UnidadLexica)unidadLexica);
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintacticoTiny$actions {
  private final AnalizadorSintacticoTiny parser;

  /** Constructor */
  CUP$AnalizadorSintacticoTiny$actions(AnalizadorSintacticoTiny parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action_part00000000(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintacticoTiny$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Prog ::= LIns 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Prog",0, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Prog EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintacticoTiny$stack.elementAt(CUP$AnalizadorSintacticoTiny$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintacticoTiny$parser.done_parsing();
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LIns ::= Ins LIns 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIns",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LIns ::= 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIns",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Ins ::= IDEN ASS List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ins",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Ins ::= PRINT List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ins",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // REL ::= OpGE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // REL ::= OpLE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // REL ::= OpEQ 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // REL ::= OpNEQ 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // AP ::= OP0 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("AP",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // AP ::= OP1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("AP",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OP0 ::= MAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OP0 ::= MENOS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OP1 ::= POR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",10, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP1 ::= DIV 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",10, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // List ::= BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("List",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // List ::= BList CONCAT List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("List",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // BList ::= IDEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // BList ::= LREDUCE AP BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // BList ::= LMAP AP Num BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // BList ::= LFILTER REL Num BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // BList ::= LB COMITAS RB 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMITAS ::= RELL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("COMITAS",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMITAS ::= RELL COMA COMITAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("COMITAS",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RELL ::= Num 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("RELL",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RELL ::= LB COMITAS RB 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("RELL",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintacticoTiny$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintacticoTiny$do_action_part00000000(
                               CUP$AnalizadorSintacticoTiny$act_num,
                               CUP$AnalizadorSintacticoTiny$parser,
                               CUP$AnalizadorSintacticoTiny$stack,
                               CUP$AnalizadorSintacticoTiny$top);
    }
}

