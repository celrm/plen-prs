#!/bin/bash
java -cp jlex.jar JLex.Main ejemplo.l
mv ejemplo.l.java alex/AnalizadorLexicoTiny.java
javac alex/*.java
java alex.Main input.txt
