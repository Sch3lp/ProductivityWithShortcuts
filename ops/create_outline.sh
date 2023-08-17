#!/bin/bash

inputDir=$(readlink -m "$1")
echo "Creating outline.md file in directory: $inputDir"
outlineFile="$inputDir/outline.md"
echo "$outlineFile"

echo '# [Outline](outline.md)' > "$outlineFile"

for file in $inputDir/chapter*.md
 do
   echo "   > processing $file"
   title=$(cat "$file" | grep "^# ")
   echo '' >> $outlineFile
   filename="$(basename "$file" .md)"
   echo "## [${title:2}](./$filename.md)" >> "$outlineFile"
   while read line; do
     if [[ $line == "## "* ]] ; then
         echo "* ${line:3}" >> $outlineFile
     fi
   done < $file
 done
