public enum Token {

    //list of Tokens described in project.

    //keywords:     Alireza

    T_void("void"), T_int("int"), T_double("double"), T_bool("bool"), T_string("string"), T_class("class"), T_interface("interface"), T_null("null"),
    T_this("this"), T_extends("extends"), T_implements("implements"), T_for("for"), T_while("while"), T_if("if"), T_else("else"), T_return("return"),
    T_break("break"), T_continue("continue"), T_new("new"), T_NewArray("NewArray"), T_Print("Print"), T_ReadInteger("ReadInteger"), T_ReadLine("ReadLine"),
    T_dtoi("dtoi"), T_itod("itod"), T_btoi("btoi"), T_itob("itob"), T_private("private"), T_protected("protected"), T_public("public"),


    //other reserved words:     Arya
    T_BOOLEANLITERAL /*i.e. true | false*/,
    /*==================================*/
    // operators:   Ali
    T_Plus("+"), T_Minus("-"), T_Star("*"), T_Slash("/"), T_Modulus("%"),
    T_GT(">"), T_GE(">="), T_LT("<"), T_LE("<="), T_Assign("="), T_EQ("=="), T_NE("!="),
    T_AND("&&"), T_OR("||"), T_NOT("!"),
    T_SemiColon(";"), T_Comma(","), T_Dot("."),
    T_OBracket("["), T_CBracket("]"), T_OParen("("), T_CParen(")"),
    /*==================================*/
    // comments:    Arya
    /*T_SingleLinedComment, T_MultiLinedComment,*/
    /*==================================*/
    // WHITE SPACE possible token for distinguisher. or just changes state.
    T_STRINGLITERAL("T_STRINGLITERAL"),
    T_INTLITERAL("T_INTLITERAL"),
    T_DOUBLELITERAL("T_DOUBLELITERAL"),
    T_ID("T_ID"); // all valid identifiers.

    /*private fields goes here*/
    private String givenName = null;

    Token(){}
    Token (String givenName){
        this.givenName = givenName;
    }

//    Token(String givenName, String attribute){
//        this.attribute = attribute;
//        this.givenName = givenName;
//    }

    /*setters and getters.*/

    @Override
    public String toString() {
        return givenName;
    }
}
