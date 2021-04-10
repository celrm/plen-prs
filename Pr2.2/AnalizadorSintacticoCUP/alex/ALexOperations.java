package alex;

import asint.ClaseLexica;
import errors.GestionErroresTiny;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;
  }
  public UnidadLexica unidadIDEN() {
     return new UnidadLexica(alex.fila(),ClaseLexica.IDEN,alex.lexema()); 
  } 
  public UnidadLexica unidadNum() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Num,alex.lexema()); 
  } 
  public UnidadLexica unidadMas() {
     return new UnidadLexica(alex.fila(),ClaseLexica.MAS,alex.lexema()); 
  } 
  public UnidadLexica unidadMenos() {
     return new UnidadLexica(alex.fila(),ClaseLexica.MENOS,alex.lexema()); 
  } 
  public UnidadLexica unidadPor() {
     return new UnidadLexica(alex.fila(),ClaseLexica.POR,alex.lexema()); 
  } 
  public UnidadLexica unidadDiv() {
     return new UnidadLexica(alex.fila(),ClaseLexica.DIV,alex.lexema()); 
  } 
  public UnidadLexica unidadOpGE() {
     return new UnidadLexica(alex.fila(),ClaseLexica.OpGE,alex.lexema()); 
  } 
  public UnidadLexica unidadOpLE() {
     return new UnidadLexica(alex.fila(),ClaseLexica.OpLE,alex.lexema()); 
  } 
  public UnidadLexica unidadOpEQ() {
     return new UnidadLexica(alex.fila(),ClaseLexica.OpEQ,alex.lexema()); 
  } 
  public UnidadLexica unidadOpNEQ() {
     return new UnidadLexica(alex.fila(),ClaseLexica.OpNEQ,alex.lexema()); 
  } 
  public UnidadLexica unidadLBrac() {
     return new UnidadLexica(alex.fila(),ClaseLexica.LB,alex.lexema()); 
  } 
  public UnidadLexica unidadRBrac() {
     return new UnidadLexica(alex.fila(),ClaseLexica.RB,alex.lexema()); 
  } 
  public UnidadLexica unidadAss() {
     return new UnidadLexica(alex.fila(),ClaseLexica.ASS,alex.lexema()); 
  } 
  public UnidadLexica unidadComa() {
     return new UnidadLexica(alex.fila(),ClaseLexica.COMA,alex.lexema()); 
  } 
  public UnidadLexica unidadLReduce() {
     return new UnidadLexica(alex.fila(),ClaseLexica.LREDUCE,alex.lexema()); 
  } 
  public UnidadLexica unidadLMap() {
     return new UnidadLexica(alex.fila(),ClaseLexica.LMAP,alex.lexema()); 
  } 
  public UnidadLexica unidadLFilter() {
     return new UnidadLexica(alex.fila(),ClaseLexica.LFILTER,alex.lexema()); 
  } 
  public UnidadLexica unidadPrint() {
     return new UnidadLexica(alex.fila(),ClaseLexica.PRINT,alex.lexema()); 
  } 
  public UnidadLexica unidadConcat() {
     return new UnidadLexica(alex.fila(),ClaseLexica.CONCAT,alex.lexema()); 
  }
  public UnidadLexica unidadEof() {
     return new UnidadLexica(alex.fila(),ClaseLexica.EOF,"<EOF>"); 
  }
  public void error() {
    System.err.println("***"+alex.fila()+" Caracter inexperado: "+alex.lexema());
  }
  public void fijaGestionErrores(GestionErroresTiny error) {
    error.errorLexico(alex.fila(),alex.lexema());
  }
}
