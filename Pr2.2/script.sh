#!/bin/bash
java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoTiny -symbols ClaseLexica -nopositions Tiny.cup
cp ejemplo.l.java alex/AnalizadorLexicoTiny.java
javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt
