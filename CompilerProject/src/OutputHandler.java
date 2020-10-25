import java.util.ArrayList;

public class OutputHandler {
    public static ArrayList<TokenClass> buffer = new ArrayList<>();
    public static void handle(Token token){
        TokenClass tc = new TokenClass(token);
        buffer.add(tc);
        System.out.println(token);
    }
    public static void handle(String str, Token token){
        TokenClass tc = new TokenClass(token, str);
        buffer.add(tc);
        System.out.println(token + " " + str);
    }

    /*// for debug
    public static void handle(Token token){
        buffer.add(token);
        if(token == Token.something)
            System.out.println("DETECTED!!!: " + token);
    }*/
}
