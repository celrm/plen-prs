#!/bin/bash
java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoCUP/AnalizadorSintacticoTiny -symbols AnalizadorSintacticoCUP/ClaseLexica -nopositions Tiny.cup
cd AnalizadorSintacticoCUP/
javac -cp "../cup.jar" */*.java
java -cp ".:../cup.jar" asint.Main ../input.txt
