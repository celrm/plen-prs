package alex;

%%
%line
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode

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
palabra = {letra}+
patron = (({letra}*)\*({letra}*))
otro = ((^{separador})+)
%%
{separador}               {}
{palabra}                  {return ops.unidadPalabra();}
{patron}                   {return ops.unidadPatron();}
[^]           {return ops.unidadOtro();}
[^]                       {ops.error();}  
