SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_51\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= E:\CHIPECH\PROGRAMACION\JAVA\HERRAMIENTAS_JFLEX_CUP\Fuentes\jflex-1.6.1\lib
cd E:\CHIPECH\PROGRAMACION\COMPILADORES1\PROYECTO1\[OLC1]Proyecto1_201404278\src\Analizador_HTML
java -jar %JFLEX_HOME%\jflex-1.6.1.jar A_Lexico_HTML.jflex
pause