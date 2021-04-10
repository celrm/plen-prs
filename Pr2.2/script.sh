#!/bin/bash
clear 
java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoTiny -symbols ClaseLexica -nopositions Tiny.cup
mv AnalizadorSintacticoTiny.java AnalizadorSintacticoCUP/asint/AnalizadorSintacticoTiny.java
mv ClaseLexica.java AnalizadorSintacticoCUP/asint/ClaseLexica.java

echo -e '\n\nAnalizador léxico:\n\n'

cd AnalizadorSintacticoCUP/
java -cp jlex.jar JLex.Main ejemplo.l
mv ejemplo.l.java alex/AnalizadorLexicoTiny.java

echo -e '\n\nAnalizador sintáctico:\n\n'

javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt

cd ..
