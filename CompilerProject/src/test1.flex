import java.util.ArrayList;

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
    ArrayList<Token> tokenArrayList = new ArrayList<Token>();
%}

%xstate cb

%%
// rule part //

//"my name " [a-z]+    {name = yytext();}
//[1-9]+   {name = yytext(); System.out.println("lexume detected: " + name);}



int  {tokenArrayList.add(Token.T_int); System.out.println("INT!!"); return 1;}
double  { tokenArrayList.add(Token.T_double);System.out.println("DOUBLE!!");}
void    { tokenArrayList.add(Token.T_void);System.out.println("VOID!!");}

//  *      *//
/*

*/

[a-zA-Z]+ [1-9]* {tokenArrayList.add(Token.T_ID);}

//<YYINITIAL>{
//    [{]     {yybegin(cb);  commentvalue = new StringBuilder();}
//
//
//
//}
//
//<cb>{
//   [}] {yybegin(YYINITIAL); }
//   [^] {commentvalue.append(yytext());}
//
//}
//


//[1-7]+      {name = yytext(); }
//= {name = yytext();}
//{reg1}  {name = yytext(); }
