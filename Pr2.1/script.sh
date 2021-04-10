#!/bin/bash

java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoTiny -symbols ClaseLexica -nopositions Tiny.cup
mv AnalizadorSintacticoTiny.java AnalizadorSintacticoCUP/asint/AnalizadorSintacticoTiny.java
mv ClaseLexica.java AnalizadorSintacticoCUP/asint/ClaseLexica.java

cd AnalizadorSintacticoCUP/

javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt

cd ..
