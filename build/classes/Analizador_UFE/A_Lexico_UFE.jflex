/*----------------- AREA 1: CODIGO DE USUARIO -----------------------*/
//-----------------> paquetes, importaciones 
package Analizador_UFE;
import java_cup.runtime.*;
import javax.swing.table.DefaultTableModel;

/*----------------- AREA 2: OPCIONES Y DECLARACIONES -----------------------*/

%%
%{
    //--------> Codigo de usuario en sintaxis java

    public String errores = "";
    public String lexemas = "";
    public static Object [] encabezado={"","",""};
    public static DefaultTableModel tablaerroresLexUFE=new DefaultTableModel(encabezado,0);
    

    public void addError(String cadena)
    {
    	errores += "\n" + cadena;        
    }
    public void addLexema(Symbol s)
    {
        lexemas+=SimbolosUFE.terminalNames[s.sym] +"\t"+ s.value + "\t" + s.left + "\t" + s.right +"\n";
    }
   
%}

//-------=> Directivas
    %cupsym SimbolosUFE
    %class ScanerUFE
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
    espacio = \t|\f|" "|\r|\n
    enteroPosit= [0-9]+
    letra = [a-zA-Z]
    caracter= "'"{letra}"'"
    cadena =[\"] [^\"\n]* [\"\n]
    doubl= {enteroPosit}"."{enteroPosit}
    id ={letra}({letra}|{enteroPosit}|"_")* 
    hexadecim= "#"({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})({letra}|{enteroPosit})

%%

/*----------------- AREA 3: REGLAS LEXICAS -----------------------*/

<YYINITIAL>
{
    {espacio}     {/*Se ignora*/}

    "(" {Symbol s = new Symbol(SimbolosUFE.parenabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ")" {Symbol s = new Symbol(SimbolosUFE.parencierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "{" {Symbol s = new Symbol(SimbolosUFE.llaveabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "}" {Symbol s = new Symbol(SimbolosUFE.llavecierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "[" {Symbol s = new Symbol(SimbolosUFE.corchabre,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "]" {Symbol s = new Symbol(SimbolosUFE.corchcierra,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "=" {Symbol s = new Symbol(SimbolosUFE.igual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "," {Symbol s = new Symbol(SimbolosUFE.coma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ";" {Symbol s = new Symbol(SimbolosUFE.puntoycoma,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "+" {Symbol s = new Symbol(SimbolosUFE.mas,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "-" {Symbol s = new Symbol(SimbolosUFE.menos,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "*" {Symbol s = new Symbol(SimbolosUFE.producto,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "/" {Symbol s = new Symbol(SimbolosUFE.division,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "pow" {Symbol s = new Symbol(SimbolosUFE.potencia,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "<" {Symbol s = new Symbol(SimbolosUFE.menorque,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ">" {Symbol s = new Symbol(SimbolosUFE.mayorque,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "var" {Symbol s = new Symbol(SimbolosUFE.variab,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "render" {Symbol s = new Symbol(SimbolosUFE.renderr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "component" {Symbol s = new Symbol(SimbolosUFE.componentt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "return" {Symbol s = new Symbol(SimbolosUFE.returnn,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "id" {Symbol s = new Symbol(SimbolosUFE.iduf,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "x" {Symbol s = new Symbol(SimbolosUFE.equis,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "y" {Symbol s = new Symbol(SimbolosUFE.ye,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "height" {Symbol s = new Symbol(SimbolosUFE.heightt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "width" {Symbol s = new Symbol(SimbolosUFE.widthh,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "color" {Symbol s = new Symbol(SimbolosUFE.colorr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "border" {Symbol s = new Symbol(SimbolosUFE.borderr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "classname" {Symbol s = new Symbol(SimbolosUFE.classnamee,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "panel" {Symbol s = new Symbol(SimbolosUFE.panell,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "text" {Symbol s = new Symbol(SimbolosUFE.textt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "textfield" {Symbol s = new Symbol(SimbolosUFE.textfieldd,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "button" {Symbol s = new Symbol(SimbolosUFE.buttonn,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "onclick" {Symbol s = new Symbol(SimbolosUFE.onclickk,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "list" {Symbol s = new Symbol(SimbolosUFE.listt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "elements" {Symbol s = new Symbol(SimbolosUFE.elementss,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "item" {Symbol s = new Symbol(SimbolosUFE.itemm,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "default" {Symbol s = new Symbol(SimbolosUFE.defaultt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "spinner" {Symbol s = new Symbol(SimbolosUFE.spinnerr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "max" {Symbol s = new Symbol(SimbolosUFE.maxx,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "min" {Symbol s = new Symbol(SimbolosUFE.minn,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "image" {Symbol s = new Symbol(SimbolosUFE.imagee,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "src" {Symbol s = new Symbol(SimbolosUFE.srcc,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "import" {Symbol s = new Symbol(SimbolosUFE.importt,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "from" {Symbol s = new Symbol(SimbolosUFE.fromm,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "si" {Symbol s = new Symbol(SimbolosUFE.sii,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "sino" {Symbol s = new Symbol(SimbolosUFE.sinoo,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "mientras" {Symbol s = new Symbol(SimbolosUFE.mientrass,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "repetir" {Symbol s = new Symbol(SimbolosUFE.repetirr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "imprimir" {Symbol s = new Symbol(SimbolosUFE.imprimirr,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "==" {Symbol s = new Symbol(SimbolosUFE.igualigual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "!=" {Symbol s = new Symbol(SimbolosUFE.diferenteigual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "<=" {Symbol s = new Symbol(SimbolosUFE.menorigual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    ">=" {Symbol s = new Symbol(SimbolosUFE.mayorigual,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\&&" {Symbol s = new Symbol(SimbolosUFE.andd,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\|\|" {Symbol s = new Symbol(SimbolosUFE.orr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\^" {Symbol s = new Symbol(SimbolosUFE.xorr,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\!" {Symbol s = new Symbol(SimbolosUFE.nott,yycolumn,yyline,yytext()); addLexema(s); return s;}
    

    "true" {Symbol s = new Symbol(SimbolosUFE.booll,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "false" {Symbol s = new Symbol(SimbolosUFE.booll,yycolumn,yyline,yytext()); addLexema(s); return s;}

    "\"red\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"pink\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"orange\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"yellow\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"purple\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"magenta\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"green\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"blue\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"brown\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"white\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"gray\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;}
    "\"black\"" {Symbol s = new Symbol(SimbolosUFE.nomcolor,yycolumn,yyline,yytext()); addLexema(s); return s;} 

    {enteroPosit} {Symbol s = new Symbol(SimbolosUFE.intt,yycolumn,yyline,yytext()); addLexema(s); return s;}    
    {id} {Symbol s = new Symbol(SimbolosUFE.id,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {hexadecim} {Symbol s = new Symbol(SimbolosUFE.hexad,yycolumn,yyline,yytext()); addLexema(s); return s;}

    {doubl} {Symbol s = new Symbol(SimbolosUFE.doublee,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {caracter} {Symbol s = new Symbol(SimbolosUFE.caracter,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {cadena} {Symbol s = new Symbol(SimbolosUFE.cadena,yycolumn,yyline,yytext()); addLexema(s); return s;}
    {Comentario} { /*Se ignora.*/}
    {ComentarioMulti} { /*Se ignora.*/}

//--------> Errores Lexicos
    .     
    {               
       addError("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
       Object[] cars = {yytext(), (yyline+1), (yycolumn+1)};
       tablaerroresLexUFE.addRow(cars);
       System.out.println("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
    }  
 
 }     