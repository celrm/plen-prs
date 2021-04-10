#!/bin/bash

cd constructorASTCUP/constructorast
java -cp ".:../../cup.jar" java_cup.Main -parser ConstructorASTExp -symbols ClaseLexica -nopositions ConstructorAST.cup

cd ..
javac -cp "../cup.jar:." */*.java
java -cp "../cup.jar:." constructorast.Main  input.txt
