/*----------------- AREA 1: CODIGO DE USUARIO -----------------------*/
//-----------------> paquetes, importaciones 
package Analizador_HTML;
import java_cup.runtime.*;
import javax.swing.table.DefaultTableModel;

/*----------------- AREA 2: OPCIONES Y DECLARACIONES -----------------------*/

%%
%{
    //--------> Codigo de usuario en sintaxis java

    public String errores = "";
    public String lexemas = "";
    public String cadena="";
    public int contador=0;
    public static Object [] encabezado={"","",""};
    public static DefaultTableModel tablaerroresLexHTML=new DefaultTableModel(encabezado,0);
    

    public void addError(String cadena)
    {
    	errores += "\n" + cadena;        
    }
    public void addLexema(Symbol s)
    {
        lexemas+=SimbolosHTML.terminalNames[s.sym] +"\t"+ s.value + "\t" + s.left + "\t" + s.right +"\n";
    }
   
%}

//-------=> Directivas
    %cupsym SimbolosHTML
    %class ScanerHTML
    %cup
    %public
    %unicode    
    %line    
    %column
    %char
    %ignorecase
    
    

//-----------> Expresiones Regulares

    Comentario = "<!--" [^\r\n]* "-->"
    enteroPosit=[0-9]+
    espacio = \t|\f|" "|\r|\n
    letra = [a-zA-Z]
    id ={letra}({letra}|{enteroPosit}|"_")*
    cadena =[\"] [^\"\n]* [\"\n]

%state CAD

%%

/*----------------- AREA 3: REGLAS LEXICAS -----------------------*/

<YYINITIAL>
{
    {espacio}     {/*Se ignora*/}

    ">" {            
            Symbol s = new Symbol(SimbolosHTML.mayor,yycolumn,yyline,yytext()); 
            if(contador==1)
            {
                yybegin(CAD);
            }
            else{
                contador=0;
            }
            addLexema(s); 
            return s;
        }
    "<" {Symbol s = new Symbol(SimbolosHTML.menor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "/" {contador++; Symbol s = new Symbol(SimbolosHTML.diagonal,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "=" {Symbol s = new Symbol(SimbolosHTML.igual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    
    "html" {Symbol s = new Symbol(SimbolosHTML.ghtml,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "head" {contador=0; Symbol s = new Symbol(SimbolosHTML.ghead,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "title" {contador++; Symbol s = new Symbol(SimbolosHTML.gtitle,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "body" {contador=0; Symbol s = new Symbol(SimbolosHTML.gbody,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "noufe" {contador++; Symbol s = new Symbol(SimbolosHTML.gnoufe,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "div" {contador=0; Symbol s = new Symbol(SimbolosHTML.gdiv,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "id" {Symbol s = new Symbol(SimbolosHTML.gid,yycolumn,yyline,yytext()); addLexema(s); return s;}

    {cadena} {Symbol s = new Symbol(SimbolosHTML.cadena,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {Comentario} { /*Se ignora.*/}

//--------> Errores Lexicos
    .     
    {               
       addError("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
       Object[] cars = {yytext(), (yyline+1), (yycolumn+1)};
       tablaerroresLexHTML.addRow(cars);
       System.out.println("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
    }  
 
 }     
<CAD>
{
    [^] //cualquier caracter
    {        
        if(yytext().equals("<"))
        {
           Symbol s = new Symbol(SimbolosHTML.cadena,yycolumn,yyline,cadena); 
           addLexema(s); 
           yypushback(1); // 1 indica que devuelva el numero de caracteres que encontro, devolvera "<"
           yybegin(YYINITIAL); //cambia de estado
           contador=0;
           cadena="";
           return s; 
        }
         

        cadena+=yytext(); //se concatenan los caracteres
    }
}      