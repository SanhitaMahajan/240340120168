#!/bin/bash

if [ "$#" -ne 1 ]; then
	echo "usage file not found"
fi

path="$1"

if [ -e "$path" ]; then
	echo "Given user input file is executable"
else 
	echo "Given user input file is not executable"
fi




