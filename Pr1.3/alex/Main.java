package alex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader input = new InputStreamReader(new FileInputStream(args[0]));
        AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
        UnidadLexica unidad;
        ArrayList<UnidadLexica> patrones = new ArrayList<UnidadLexica>();
        ArrayList<UnidadLexica> palabras = new ArrayList<UnidadLexica>();
        do {
            unidad = al.yylex();
            if (unidad.clase() == ClaseLexica.PALABRA){
                palabras.add(unidad);
            }
            else if (unidad.clase() == ClaseLexica.PATRON){
                patrones.add(unidad);
            }
            System.out.println(unidad);
        }
        while (unidad.clase() != ClaseLexica.EOF);
        System.out.println("PALABRAS");
        Iterator<UnidadLexica> itr = palabras.iterator();
        while(itr.hasNext()) {
            UnidadLexica element = itr.next();
            System.out.println(element.lexema());
        }
        System.out.println("PATRONES");
        itr = patrones.iterator();
        while(itr.hasNext()) {
            UnidadLexica element = itr.next();
            String lexema = element.lexema();
            int index = lexema.indexOf('*');
            String iz = lexema.substring(0,index);
            String der = lexema.substring(index+1);
            int occur = 0;
            Iterator<UnidadLexica> itraux = palabras.iterator();
            while(itraux.hasNext()) {
                UnidadLexica elementaux = itraux.next();
                String lexaux = elementaux.lexema();
                if (lexaux.length() >= lexema.length()){
                    String izaux = lexaux.substring(0,index);
                    String deraux = lexaux.substring(lexaux.length()- (lexema.length()-index)+1);
                    if (iz.compareTo(izaux)== 0 && der.compareTo(deraux)== 0){
                        ++occur;
                    }
                }
            }
            System.out.print(lexema);
            System.out.print( ": ");
            System.out.println( occur);
        }
    }
}

