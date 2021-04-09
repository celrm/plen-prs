
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Fri Apr 09 12:46:26 CEST 2021
//----------------------------------------------------

package asint;

import java_cup.runtime.*;
import alex.AnalizadorLexicoTiny;
import alex.UnidadLexica;
import errors.GestionErroresTiny;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Fri Apr 09 12:46:26 CEST 2021
  */
public class AnalizadorSintacticoCUP/AnalizadorSintacticoTiny extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintacticoCUP/AnalizadorSintacticoTiny() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoCUP/AnalizadorSintacticoTiny(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoCUP/AnalizadorSintacticoTiny(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\011\003\000\002\002\004\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\012\003" +
    "\000\002\012\003\000\002\013\003\000\002\013\003\000" +
    "\002\014\003\000\002\014\003\000\002\002\003\000\002" +
    "\004\004\000\002\004\002\000\002\003\005\000\002\003" +
    "\004\000\002\005\003\000\002\005\005\000\002\006\003" +
    "\000\002\006\005\000\002\006\006\000\002\006\006\000" +
    "\002\006\005\000\002\007\003\000\002\007\005\000\002" +
    "\010\003\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\007\000\012\006\005\007\004\010\010\011\006\001" +
    "\002\000\004\002\uffff\001\002\000\004\002\001\001\002" +
    "\000\004\002\ufffd\001\002\000\004\002\011\001\002\000" +
    "\004\002\ufffe\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\007\000\004\011\006\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$actions(this);
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
    return action_obj.CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$do_action(act_num, parser, stack, top);
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
class CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$actions {
  private final AnalizadorSintacticoCUP/AnalizadorSintacticoTiny parser;

  /** Constructor */
  CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$actions(AnalizadorSintacticoCUP/AnalizadorSintacticoTiny parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$do_action_part00000000(
    int                        CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // REL ::= OpGE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= REL EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$stack.elementAt(CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$parser.done_parsing();
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // REL ::= OpLE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // REL ::= OpEQ 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // REL ::= OpNEQ 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("REL",7, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // AP ::= OP0 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("AP",8, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // AP ::= OP1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("AP",8, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // OP0 ::= MAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",9, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // OP0 ::= MENOS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",9, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OP1 ::= POR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",10, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OP1 ::= DIV 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",10, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Prog ::= LIns 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Prog",0, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LIns ::= Ins LIns 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIns",2, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LIns ::= 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIns",2, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Ins ::= IDEN ASS List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ins",1, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Ins ::= PRINT List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ins",1, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // List ::= BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("List",3, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // List ::= BList CONCAT List 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("List",3, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // BList ::= IDEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // BList ::= LREDUCE AP BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // BList ::= LMAP AP Num BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // BList ::= LFILTER REL Num BList 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // BList ::= LB COMITAS RB 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("BList",4, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMITAS ::= RELL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("COMITAS",5, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMITAS ::= RELL COMA COMITAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("COMITAS",5, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RELL ::= Num 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("RELL",6, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RELL ::= LB COMITAS RB 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("RELL",6, RESULT);
            }
          return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$do_action(
    int                        CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$do_action_part00000000(
                               CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$act_num,
                               CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$parser,
                               CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$stack,
                               CUP$AnalizadorSintacticoCUP/AnalizadorSintacticoTiny$top);
    }
}
