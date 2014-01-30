#!/bin/bash

scriptName=`basename $0`

Sep=':'

uname | grep -i cyg > /dev/null

if [ $? -eq 0 ]; then Sep=';'; fi
