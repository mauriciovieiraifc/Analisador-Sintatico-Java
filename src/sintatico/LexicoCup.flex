package sintatico;
import static java_cup.runtime.Symbol;
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r,\n]+

%{
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Palavras reservadas */
/* String, int definidos aqui para possíveis validações no arquivo Sintatico.cup */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}
( "\"" ) {return new Symbol(sym.Aspas, yychar, yyline, yytext());}
( String ) {return new Symbol(sym.String, yychar, yyline, yytext());}
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}
( public ) {return new Symbol(sym.Public, yychar, yyline, yytext());}
( static ) {return new Symbol(sym.Static, yychar, yyline, yytext());}
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}
( main ) {return new Symbol(sym.Main, yychar, yyline, yytext());}
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Espaços */
{espaco} {/*Ignore*/}
"//".* {/*Ignore*/}

/* Tipos de dados */
( byte | char | long | float | double ) {return new Symbol(sym.Tipo_Dado, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Operador_Logico, yychar, yyline, yytext());}

/* Operadores Relacionais */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Operador_Relacional, yychar, yyline, yytext());}

/* Operadores Atribuição */
( "+=" | "-="  | "*=" | "/=" | "%=") {return new Symbol(sym.Operador_Atribuicao, yychar, yyline, yytext());}

/* Operadores Incremento e decremento */
( "++" | "--" ) {return new Symbol(sym.Operador_Incremento, yychar, yyline, yytext());}

/* Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Operador_Booleano, yychar, yyline, yytext());}

/* Operadores Aritméticos */
( "+" | "-" | "*" | "/" | "mod" ) {return new Symbol(sym.Operador_Aritmetico, yychar, yyline, yytext());}

( "\n" ) {return new Symbol(sym.Linha, yychar, yyline, yytext());}
( "(" ) {return new Symbol(sym.Abre_Parenteses, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.Fecha_Parenteses, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.Abre_Chaves, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.Fecha_Chaves, yychar, yyline, yytext());}
( ";" ) {return new Symbol(sym.Ponto_Virgula, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}

