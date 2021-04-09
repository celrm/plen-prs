package alex;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
  public UnidadLexica unidadPalabra() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.PALABRA,
                                         alex.lexema()); 
  } 
  public UnidadLexica unidadPatron() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.PATRON,
                                         alex.lexema()); 
  } 
  public UnidadLexica unidadOtro() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.OTRO,
                                         alex.lexema()); 
  } 
  public UnidadLexica unidadEof() {
     return new UnidadLexicaUnivaluada(alex.fila(),ClaseLexica.EOF); 
  }
  public void error() {
    System.err.println("***"+alex.fila()+" Caracter inexperado: "+alex.lexema());
  }
}
