package alex;

import asint.ClaseLexica;
import errors.GestionErroresTiny;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;
  }
  public UnidadLexica unidadIDEN() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Iden,alex.lexema()); 
  } 
  public UnidadLexica unidadNum() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Num,alex.lexema()); 
  } 
  public UnidadLexica unidadMas() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Mas,alex.lexema()); 
  } 
  public UnidadLexica unidadMenos() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Menos,alex.lexema()); 
  } 
  public UnidadLexica unidadPor() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Por,alex.lexema()); 
  } 
  public UnidadLexica unidadDiv() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Div,alex.lexema()); 
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
     return new UnidadLexica(alex.fila(),ClaseLexica.Lb,alex.lexema()); 
  } 
  public UnidadLexica unidadRBrac() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Rb,alex.lexema()); 
  } 
  public UnidadLexica unidadAss() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Ass,alex.lexema()); 
  } 
  public UnidadLexica unidadComa() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Coma,alex.lexema()); 
  } 
  public UnidadLexica unidadLReduce() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Lreduce,alex.lexema()); 
  } 
  public UnidadLexica unidadLMap() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Lmap,alex.lexema()); 
  } 
  public UnidadLexica unidadLFilter() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Lfilter,alex.lexema()); 
  } 
  public UnidadLexica unidadPrint() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Print,alex.lexema()); 
  } 
  public UnidadLexica unidadConcat() {
     return new UnidadLexica(alex.fila(),ClaseLexica.Concat,alex.lexema()); 
  }
  public UnidadLexica unidadEof() {
     return new UnidadLexica(alex.fila(),ClaseLexica.EOF,"<EOF>"); 
  }
  public void error() {
    System.err.println("***"+alex.fila()+" Caracter inesperado: "+alex.lexema());
  }
  public void fijaGestionErrores(GestionErroresTiny error) {
    error.errorLexico(alex.fila(),alex.lexema());
  }
}
