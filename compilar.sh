#!/usr/bin/env bash
set -e
rm -rf target && mkdir -p target
javac -d target $(find src -name '*.java')
echo "Compilacion correcta."
