#!/bin/bash

java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoCUP/asint/AnalizadorSintacticoTiny -symbols AnalizadorSintacticoCUP/asint/ClaseLexica -nopositions Tiny.cup

cd AnalizadorSintacticoCUP/
java -cp jlex.jar JLex.Main ejemplo.l
cp ejemplo.l.java alex/AnalizadorLexicoTiny.java

javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt

cd ..
