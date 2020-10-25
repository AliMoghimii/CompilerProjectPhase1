public class TokenClass {
    /*
    * please ignore this class for the project phase 1.
    * this class is for when you want to pass the tokens to the parser
    * and you want to have attributes and Tokens in a memory stored.
    * this class is not necessary if you have no memory for the lexer
    * and the Lexical Analyzer is passive.
    */
    private String attribute;
    private Token token;
    private String str;
    TokenClass(Token token, String attribute){
        this.token = token;
        this.attribute = attribute;
        str = token.toString()+" "+attribute;
    }
    TokenClass(Token token){
        this.token = token;
        str = token.toString();
    }

    public String getAttribute() {
        return attribute;
    }

    public Token getToken() {
        return token;
    }

    @Override
    public String toString() {
        return str;
    }
}
