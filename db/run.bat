@echo off

REM Run db connection
javac -cp ".;lib/mysql-connector-j-9.6.0.jar" dbconn.java
java -cp ".;lib/mysql-connector-j-9.6.0.jar" dbconn



pause