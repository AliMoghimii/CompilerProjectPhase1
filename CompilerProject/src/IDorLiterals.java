public enum Token{

    //list of Tokens described in project.
    /*==================================*/
    //keywords:     Alireza
    T_void, T_int, T_double, T_bool, T_string, T_class, T_interface, T_null,
    T_this, T_extends, T_implements, T_for, T_while, T_if, T_else, T_return,
    T_break, T_continue, T_new, T_NewArray, T_Print, T_ReadInteger, T_ReadLine,
    T_dtoi, T_itod, T_btoi, T_itob, T_private, T_protected, T_public,
    /*==================================*/
    // operators:   Ali
    T_Plus, T_Minus, T_Star, T_Slash, T_Modulus,
    T_GT, T_GE, T_LT, T_LE, T_Assign, T_EQ, T_NE,
    T_AND, T_OR, T_NOT,
    T_SemiColon, T_Comma, T_Dot,
    T_OBracket, T_CBracket, T_OParen, T_Cparen,
    /*==================================*/
    //other reserved words:     Arya
    T_BOOLEANLITERAL /*i.e. true | false*/,
    /*==================================*/
    // comments:    Arya
    T_SingleLinedComment, T_MultiLinedComment,
    /*==================================*/
    // WHITE SPACE possible token for distinguisher. or just changes state.
    T_STRINGLITERAL,
    T_INTLITERAL,       // read descriptions Desc1IntegerLit.txt
    T_DOUBLELITERAL,    // read description  Desc2DoubleLit.txt
    T_ID; // all valid identifiers.

    /*private fields goes here*/
    private String attribute = null; // the corresponding lexeme.
    private String givenName = null; // the name which output should return. instead of the enum name.

    Token(){}
    Token (String givenName){
        this.givenName = givenName;
    }

    Token(String givenName, boolean hasAttribute){
        this.attribute = attribute;
        this.givenName = givenName;
    }

    /*setters and getters.*/
    // using setter for when the
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
