#!/usr/bin/env bash
set -e
./compilar.sh
echo "--- salida del programa ---"
java -cp target edu.practica.Main
