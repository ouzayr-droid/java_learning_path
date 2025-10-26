#!/bin/bash

# Nettoyer les anciens fichiers .class
rm -rf *.class

# Compiler la classe Java
javac Category.java

# Si la compilation réussit (code retour 0), exécuter le programme
if [ $? -eq 0 ]; then
    java Category
else
    echo "Erreur de compilation"
fi
