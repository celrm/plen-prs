package alex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws FileNotFoundException, IOException {
     ArrayList<UnidadLexica> ps = new ArrayList<UnidadLexica>();
     ArrayList<UnidadLexica> pt = new ArrayList<UnidadLexica>();
     Reader input = new InputStreamReader(new FileInputStream(args[0]));
     AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
     UnidadLexica unidad;
     do {
       unidad = al.yylex();
       System.out.println(unidad);
       if(unidad.clase() == ClaseLexica.PALABRA)
        ps.add(unidad);
       else if(unidad.clase() == ClaseLexica.PATRON)
        pt.add(unidad);
     }
     while (unidad.clase() != ClaseLexica.EOF);   
     System.out.println("PALABRAS:");
     for (UnidadLexica i : ps) {
      System.out.println(i);
     }
     System.out.println("PATRONES:");
     for (UnidadLexica i : pt) {
         int occs = 0;
      System.out.println(i.toString() + ": " + occs);
     }
    }        
} 
