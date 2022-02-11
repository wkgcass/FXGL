#!/bin/bash

JAR_NAME="fxgl-17+dev-SNAPSHOT-uber.jar"

set +e

rm -f "./$JAR_NAME"

set -e

ls "fxgl/target/$JAR_NAME" > /dev/null

cp "fxgl/target/$JAR_NAME" "./$JAR_NAME"

ENTRIES='org/*
kotlin*
META-INF/maven/*
META-INF/versions/*
META-INF/kotlin-*
javafx*
*.dylib
com/sun/*'

set +e

echo "------"
for ENTRY in $ENTRIES
do
	echo "deleting $ENTRY"
	zip -d -q "$JAR_NAME" "$ENTRY"
	echo "------"
done

set -e
