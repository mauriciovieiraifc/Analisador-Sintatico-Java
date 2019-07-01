package lexico;
import static lexico.Tokens.*;
%%
%class Lexico
%type Tokens

L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r]+

%{
    public String lexema;
%}
%%

( "=" ) {lexema=yytext(); return Igual;}
( "\"" ) {lexema=yytext(); return Aspas;}

/* Palavras reservadas */
/* String, int definidos aqui para possíveis validações no arquivo Sintatico.cup */
( String ) {lexema=yytext(); return String;}
( int ) {lexema=yytext(); return Int;}
( if ) {lexema=yytext(); return If;}
( else ) {lexema=yytext(); return Else;}
( for ) {lexema=yytext(); return For;}
( public ) {lexema=yytext(); return Public;}
( static ) {lexema=yytext(); return Static;}
( void ) {lexema=yytext(); return Void;}
( main ) {lexema=yytext(); return Main;}
( do ) {lexema=yytext(); return Do;}
( while ) {lexema=yytext(); return While;}
{espaco} {/*Ignore*/}
"//".* {/*Ignore*/}

/* Tipos de dados */
( byte | char | long | float | double ) {lexema=yytext(); return Tipo_Dado;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexema=yytext(); return Operador_Logico;}

/* Operadores Relacionais */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexema=yytext(); return Operador_Relacional;}

/* Operadores Atribuição */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexema=yytext(); return Operador_Atribuicao;}

/* Operadores Incremento e decremento */
( "++" | "--" ) {lexema=yytext(); return Operador_Incremento;}

/* Operadores Booleanos*/
( true | false ) {lexema=yytext(); return Operador_Booleano;}

/* Operadores Aritméticos */
( "+" | "-" | "*" | "/" | "mod" ) {lexema=yytext(); return Operador_Aritmetico;}

( "\n" ) {lexema=yytext(); return Linha;}
( "(" ) {lexema=yytext(); return Abre_Parenteses;}
( ")" ) {lexema=yytext(); return Fecha_Parenteses;}
( "{" ) {lexema=yytext(); return Abre_Chaves;}
( "}" ) {lexema=yytext(); return Fecha_Chaves;}
( ";" ) {lexema=yytext(); return Ponto_Virgula;}

{L}({L}|{D})* {lexema=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return Numero;}
 . {lexema=yytext(); return ERROR;}
