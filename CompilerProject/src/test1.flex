%%
%public
%class myfist
%standalone

%unicode
cer = [\n|\r|\n\r]
reg1 = (a|b)+

%{
    String name;
    int len;
    StringBuilder commentvalue = new StringBuilder();
%}

%xstate cb

%%
// rule part //

//"my name " [a-z]+    {name = yytext();}
//[1-9]+   {name = yytext(); System.out.println("lexume detected: " + name);}

<YYINITIAL>{
    [{]     {yybegin(cb);  commentvalue = new StringBuilder();}



}

<cb>{
   [}] {yybegin(YYINITIAL); }
   [^] {commentvalue.append(yytext());}

}

//[1-7]+      {name = yytext(); }
//= {name = yytext();}
//{reg1}  {name = yytext(); }

