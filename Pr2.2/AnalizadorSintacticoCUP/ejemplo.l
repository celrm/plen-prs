package alex;

%%
%line
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode
%public
%cup

%{
  private ALexOperations ops;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letra  = ([A-Z]|[a-z])
separador = [ \t\r\b\n]
comentario = //[^\n]*
digitoPos = [1-9]
digito = {digitoPos}|0
numero = {digitoPos}{digito}*
identificador = {letra}({letra}|{digito})*
opge = >
ople = <
opeq = \=\=
opneq = !\=
mas = \+
menos = \-
por = \*
div = /
leftbrac = \[
rightbrac = \]
coma = ,
ass = \=
print = print
concat = #
lreduce = lreduce
lmap = lmap
lfilter = lfilter

%%
{separador}                 {}
{comentario}                {}
{lreduce}                   {return ops.unidadLReduce();}
{lmap}                   {return ops.unidadLMap();}
{lfilter}                   {return ops.unidadLFilter();}
{print}                     {return ops.unidadPrint();}
{concat}                     {return ops.unidadConcat();}
{ass}                     {return ops.unidadAss();}
{coma}                     {return ops.unidadComa();}
{leftbrac}                     {return ops.unidadLBrac();}
{rightbrac}                     {return ops.unidadRBrac();}
{div}                     {return ops.unidadDiv();}
{por}                     {return ops.unidadPor();}
{menos}                     {return ops.unidadMenos();}
{mas}                     {return ops.unidadMas();}
{opge}                     {return ops.unidadOpGE();}
{ople}                     {return ops.unidadOpLE();}
{opeq}                     {return ops.unidadOpEQ();}
{opneq}                     {return ops.unidadOpNEQ();}
{numero}                     {return ops.unidadNum();}
{identificador}              {return ops.unidadIDEN();}
[^]                       {ops.error();}  
