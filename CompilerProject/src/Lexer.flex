%%
%public
%class DecafScanner
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
// ----------------------------------------------------------rule part -----------------------------------------

//"my name " [a-z]+    {name = yytext();}
//[1-9]+   {name = yytext(); System.out.println("lexume detected: " + name);}

// ----------------------------------- Key word Token rules ----------------------------------------------------

int             {OutputHandler.handle(Token.T_int);}
double          {OutputHandler.handle(Token.T_double);}
void            {OutputHandler.handle(Token.T_void);}
bool            {OutputHandler.handle(Token.T_bool);}
string          {OutputHandler.handle(Token.T_string);}
class           {OutputHandler.handle(Token.T_class);}
interface       {OutputHandler.handle(Token.T_interface);}
null            {OutputHandler.handle(Token.T_null);}
this            {OutputHandler.handle(Token.T_this);}
extends         {OutputHandler.handle(Token.T_extends);}
implements      {OutputHandler.handle(Token.T_implements);}
for             {OutputHandler.handle(Token.T_for);}
while           {OutputHandler.handle(Token.T_while);}
if              {OutputHandler.handle(Token.T_if);}
else            {OutputHandler.handle(Token.T_else);}
return          {OutputHandler.handle(Token.T_return);}
break           {OutputHandler.handle(Token.T_break);}
continue        {OutputHandler.handle(Token.T_continue);}
new             {OutputHandler.handle(Token.T_new);}
NewArray        {OutputHandler.handle(Token.T_NewArray);}
Print           {OutputHandler.handle(Token.T_Print);}
ReadInteger     {OutputHandler.handle(Token.T_ReadInteger);}
ReadLine        {OutputHandler.handle(Token.T_ReadLine);}
dtoi            {OutputHandler.handle(Token.T_dtoi);}
itod            {OutputHandler.handle(Token.T_itod);}
btoi            {OutputHandler.handle(Token.T_btoi);}
itob            {OutputHandler.handle(Token.T_itob);}
private         {OutputHandler.handle(Token.T_private);}
protected       {OutputHandler.handle(Token.T_protected);}
public          {OutputHandler.handle(Token.T_public);}
[" "]           {}
// ------------------------------------------------------------------------------------------------------------------

[A-Za-z_$][A-Za-z_$0-9]*  {OutputHandler.handle(yytext(),Token.T_ID);}    // rule for ID (modifed mathces underline to).

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
