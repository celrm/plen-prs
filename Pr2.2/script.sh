#!/bin/bash

java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoTiny -symbols ClaseLexica -nopositions Tiny.cup
cp AnalizadorSintacticoTiny.java AnalizadorSintacticoCUP/asint/AnalizadorSintacticoTiny.java
cp ClaseLexica.java AnalizadorSintacticoCUP/asint/ClaseLexica.java

cd AnalizadorSintacticoCUP/
java -cp jlex.jar%public JLex.Main ejemplo.l
cp ejemplo.l.java alex/AnalizadorLexicoTiny.java

javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt

cd ..
