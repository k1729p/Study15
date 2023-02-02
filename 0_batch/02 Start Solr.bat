@echo off
set JAVA_HOME=C:\PROGRA~1\JAVA\JDK-19
set SOLR_DIR=D:\TOOLS\SOLR-9.1.0

%SOLR_DIR%\bin\solr.cmd start -c -f
pause
