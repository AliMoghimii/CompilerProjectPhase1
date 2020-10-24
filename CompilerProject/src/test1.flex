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
// ----------------------------------------------------------rule part -----------------------------------------

//"my name " [a-z]+    {name = yytext();}
//[1-9]+   {name = yytext(); System.out.println("lexume detected: " + name);}

// ----------------------------------- Key word Token rules ----------------------------------------------------

int     {tokenArrayList.add(Token.T_int); TokenHandler.handle(Token.T_int);}
double  { tokenArrayList.add(Token.T_double); TokenHandler.handle(Token.T_double);}
void    { tokenArrayList.add(Token.T_void);  TokenHandler.handle(Token.T_void);}
bool    {tokenArrayList.add(Token.T_bool);  TokenHandler.handle(Token.T_bool);}
string  {tokenArrayList.add(Token.T_string);  TokenHandler.handle(Token.T_string);}
class   {tokenArrayList.add(Token.T_class);  TokenHandler.handle(Token.T_class);}
interface   {tokenArrayList.add(Token.T_interface);  TokenHandler.handle(Token.T_interface);}
null    {tokenArrayList.add(Token.T_null);  TokenHandler.handle(Token.T_null);}
this    {tokenArrayList.add(Token.T_this);  TokenHandler.handle(Token.T_this);}
extends {tokenArrayList.add(Token.T_extends);  TokenHandler.handle(Token.T_extends);}
implements  {tokenArrayList.add(Token.T_implements);  TokenHandler.handle(Token.T_implements);}
for     {tokenArrayList.add(Token.T_for);  TokenHandler.handle(Token.T_for);}
while   {tokenArrayList.add(Token.T_while);  TokenHandler.handle(Token.T_while);}
if  {tokenArrayList.add(Token.T_if);  TokenHandler.handle(Token.T_if);}
else    {tokenArrayList.add(Token.T_else);  TokenHandler.handle(Token.T_else);}
return  {tokenArrayList.add(Token.T_return);  TokenHandler.handle(Token.T_return);}
break   {tokenArrayList.add(Token.T_break);  TokenHandler.handle(Token.T_break);}
continue {tokenArrayList.add(Token.T_continue);  TokenHandler.handle(Token.T_continue);}
new  {tokenArrayList.add(Token.T_new);  TokenHandler.handle(Token.T_new);}
NewArray  {tokenArrayList.add(Token.T_NewArray);  TokenHandler.handle(Token.T_NewArray);}
Print   {tokenArrayList.add(Token.T_Print);  TokenHandler.handle(Token.T_Print);}
ReadInteger  {tokenArrayList.add(Token.T_ReadInteger);  TokenHandler.handle(Token.T_ReadInteger);}
ReadLine    {tokenArrayList.add(Token.T_ReadLine);  TokenHandler.handle(Token.T_ReadLine);}
dtoi    {tokenArrayList.add(Token.T_dtoi);  TokenHandler.handle(Token.T_dtoi);}
itod    {tokenArrayList.add(Token.T_itod);  TokenHandler.handle(Token.T_itod);}
btoi    {tokenArrayList.add(Token.T_btoi);  TokenHandler.handle(Token.T_btoi);}
itob    {tokenArrayList.add(Token.T_itob);  TokenHandler.handle(Token.T_itob);}
private    {tokenArrayList.add(Token.T_private);  TokenHandler.handle(Token.T_private);}
protected  {tokenArrayList.add(Token.T_protected);  TokenHandler.handle(Token.T_protected);}
public   {tokenArrayList.add(Token.T_public);  TokenHandler.handle(Token.T_public);}

// ------------------------------------------------------------------------------------------------------------------

[A-Za-z_$][A-Za-z_$0-9]*  {tokenArrayList.add(Token.T_ID); }    // rule for ID (modifed mathces underline to).

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
