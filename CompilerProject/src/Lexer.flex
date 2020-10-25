%%
%public
%class DecafScanner
%standalone
%unicode
cer = [\n|\r|\n\r]

%{
    // nothing was necessary here edit :: -Arya
%}

%%
// ----------------------------------------------------------rule part -------------------------------------------------
// ------------------------------------------------------Key word Token rules ------------------------------------------

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

// ------------------------------------------------- Keywords and boolean literals -------------------------------------

true            {OutputHandler.handle("true", Token.T_BOOLEANLITERAL);}
false           {OutputHandler.handle("false", Token.T_BOOLEANLITERAL);}

"+"             {OutputHandler.handle(Token.T_Plus);}
"-"             {OutputHandler.handle(Token.T_Minus);}
"*"             {OutputHandler.handle(Token.T_Star);}
"/"             {OutputHandler.handle(Token.T_Slash);}
"%"             {OutputHandler.handle(Token.T_Modulus);}
">"             {OutputHandler.handle(Token.T_GT);}
">="            {OutputHandler.handle(Token.T_GE);}
"<"             {OutputHandler.handle(Token.T_LT);}
"<="            {OutputHandler.handle(Token.T_LE);}
"=="            {OutputHandler.handle(Token.T_EQ);}
"="             {OutputHandler.handle(Token.T_Assign);}
"!="            {OutputHandler.handle(Token.T_NE);}
"!"             {OutputHandler.handle(Token.T_NOT);}
"&&"            {OutputHandler.handle(Token.T_AND);}
"||"            {OutputHandler.handle(Token.T_OR);}
";"             {OutputHandler.handle(Token.T_SemiColon);}
","             {OutputHandler.handle(Token.T_Comma);}
"."             {OutputHandler.handle(Token.T_Dot);}
"["             {OutputHandler.handle(Token.T_OBracket);}
"]"             {OutputHandler.handle(Token.T_CBracket);}
"("             {OutputHandler.handle(Token.T_OParen);}
")"             {OutputHandler.handle(Token.T_CParen);}

// ------------------------------------------------------ Lexer ignored rules ------------------------------------------

[" "]           {/* no operation*/}
"/*" ~"*/"      {/* no operation*/}
["//"] ~{cer}   {/* no operation*/}
{cer}           {/* no operation*/}

// ------------------------------------------------------- String literals ---------------------------------------------

\" ~\"          {OutputHandler.handle(yytext(),Token.T_STRINGLITERAL);}

// -------------------------------------------------- Integer and double literals --------------------------------------

[0][x|X][0-9a-fA-F]+                {OutputHandler.handle(yytext(),Token.T_INTLITERAL);}
[0-9]+[.][0-9]*[e|E][+|-]?[0-9]+    {OutputHandler.handle(yytext(),Token.T_DOUBLELITERAL);}
[0-9]+[.][0-9]*                     {OutputHandler.handle(yytext(),Token.T_DOUBLELITERAL);}
[0-9]+                              {OutputHandler.handle(yytext(),Token.T_INTLITERAL);}


// ---------------------------------------------------------------------------------------------------------------------

[A-Za-z_$][A-Za-z_$0-9]*    {OutputHandler.handle(yytext(),Token.T_ID);}    // rule for ID checking

//to Generate lexical Scanner
//cd src
//java -jar jflex-full-1.8.2.jar Lexer.flex
