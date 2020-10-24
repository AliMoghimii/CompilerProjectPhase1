import java.util.ArrayList;

public class OutputHandler {
    public static ArrayList<Token> buffer = new ArrayList<>();
    public static void handle(Token token){
        buffer.add(token);
        System.out.println("DETECTED!!!: " + token);
    }
    public static void handle(String str, Token token){
        buffer.add(token);
        token.setAttribute(str);
        System.out.println(token + " " + str);
    }
}
