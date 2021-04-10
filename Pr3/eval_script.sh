#!/bin/bash

cd evaluadorExpresionesCUP

javac -cp "../cup.jar:." */*.java
java -cp "../cup.jar:." eval.Main  input.txt
