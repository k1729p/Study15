@echo off
set JAVA_HOME=C:\PROGRA~1\JAVA\JDK-21
set SOLR_DIR=D:\TOOLS\SOLR-9.4.0
%SOLR_DIR%\bin\solr.cmd start -c -f -Dsolr.modules=sql
pause