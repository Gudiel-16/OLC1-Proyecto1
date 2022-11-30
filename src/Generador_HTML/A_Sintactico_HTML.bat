SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_51\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd E:\CHIPECH\PROGRAMACION\COMPILADORES1\PROYECTO1\[OLC1]Proyecto1_201404278\src\Analizador_HTML
java -jar E:\CHIPECH\PROGRAMACION\JAVA\HERRAMIENTAS_JFLEX_CUP\Fuentes\java-cup-11b.jar -parser analisis_sintacticoHTML -symbols SimbolosHTML A_Sintactico_HTML.cup
pause