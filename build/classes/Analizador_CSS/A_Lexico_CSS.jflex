/*----------------- AREA 1: CODIGO DE USUARIO -----------------------*/
//-----------------> paquetes, importaciones 
package Analizador_CSS;
import java_cup.runtime.*;
import javax.swing.table.DefaultTableModel;

/*----------------- AREA 2: OPCIONES Y DECLARACIONES -----------------------*/

%%
%{
    //--------> Codigo de usuario en sintaxis java

    public String errores = "";
    public String lexemas = "";
    public static Object [] encabezado={"","",""};
    public static DefaultTableModel tablaerroresLexCSS=new DefaultTableModel(encabezado,0);
    

    public void addError(String cadena)
    {
    	errores += "\n" + cadena;        
    }
    public void addLexema(Symbol s)
    {
        lexemas+=SimbolosCSS.terminalNames[s.sym] +"\t"+ s.value + "\t" + s.left + "\t" + s.right +"\n";
    }
   
%}

//-------=> Directivas
    %cupsym SimbolosCSS
    %class ScanerCSS
    %cup
    %public
    %unicode    
    %line    
    %column
    %char
    %ignorecase
    
    

//-----------> Expresiones Regulares

    Comentario = "//" [^\r\n]* [^\r\n]
    ComentarioMulti = "/*" [^/] ~"*/" | "/*" "/"+ "*/" 
    enteroPosit=[0-9]+
    espacio = \t|\f|" "|\r|\n
    letra = [a-zA-Z]    
    hexadecim= "#"({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})
    fuentes= "'" ({letra}|{espacio})* "'"
    id ={letra}({letra}|{enteroPosit}|"_")* 
    //cadena =[\"] [^\"\n]* [\"\n]
%%

/*----------------- AREA 3: REGLAS LEXICAS -----------------------*/

<YYINITIAL>
{
    {espacio}     {/*Se ignora*/}

    "{" {Symbol s = new Symbol(SimbolosCSS.llaveabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "}" {Symbol s = new Symbol(SimbolosCSS.llavecierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "(" {Symbol s = new Symbol(SimbolosCSS.parenabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ")" {Symbol s = new Symbol(SimbolosCSS.parencierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "," {Symbol s = new Symbol(SimbolosCSS.coma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ";" {Symbol s = new Symbol(SimbolosCSS.puntoycoma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ":" {Symbol s = new Symbol(SimbolosCSS.dospuntos,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "." {Symbol s = new Symbol(SimbolosCSS.punto,yycolumn,yyline,yytext()); addLexema(s); return s;}
    
  
    "Background" {Symbol s = new Symbol(SimbolosCSS.backgroundd,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Border" {Symbol s = new Symbol(SimbolosCSS.boorder,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Border-color" {Symbol s = new Symbol(SimbolosCSS.bcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Border-width" {Symbol s = new Symbol(SimbolosCSS.bwidth,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Align" {Symbol s = new Symbol(SimbolosCSS.aligndecla,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Font" {Symbol s = new Symbol(SimbolosCSS.fontt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Font-size" {Symbol s = new Symbol(SimbolosCSS.fsize,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "Font-color" {Symbol s = new Symbol(SimbolosCSS.fcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "hight" {Symbol s = new Symbol(SimbolosCSS.hightt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "width" {Symbol s = new Symbol(SimbolosCSS.widthh,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "rgb" {Symbol s = new Symbol(SimbolosCSS.rgbb,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "true" {Symbol s = new Symbol(SimbolosCSS.booll,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "false" {Symbol s = new Symbol(SimbolosCSS.booll,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "left" {Symbol s = new Symbol(SimbolosCSS.alineam,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "right" {Symbol s = new Symbol(SimbolosCSS.alineam,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "center" {Symbol s = new Symbol(SimbolosCSS.alineam,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "red" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "pink" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "orange" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "yellow" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "purple" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "magenta" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "green" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "blue" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "brown" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "white" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "gray" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "black" {Symbol s = new Symbol(SimbolosCSS.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}    

    {enteroPosit} {Symbol s = new Symbol(SimbolosCSS.intt,yycolumn,yyline,yytext()); addLexema(s); return s;}    
    {hexadecim} {Symbol s = new Symbol(SimbolosCSS.hexad,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {fuentes} {Symbol s = new Symbol(SimbolosCSS.fuent,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {id} {Symbol s = new Symbol(SimbolosCSS.id,yycolumn,yyline,yytext()); addLexema(s); return s;}

    //{cadena} {Symbol s = new Symbol(SimbolosCSS.cadena,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {Comentario} { /*Se ignora.*/}
    {ComentarioMulti} { /*Se ignora.*/}

//--------> Errores Lexicos
    .     
    {               
       addError("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
       Object[] cars = {yytext(), (yyline+1), (yycolumn+1)};
       tablaerroresLexCSS.addRow(cars);
       System.out.println("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
    }  
 
 }     
