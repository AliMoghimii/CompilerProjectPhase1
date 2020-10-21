import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputHandler {


    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Universty\\Term_7\\Compiler\\Project\\CompilerProject\\CompilerProject\\src\\t1.txt");
        System.out.println(file.exists());
        FileReader f1 = new FileReader(file);

        myfist scanner = new myfist(f1);
        int code = scanner.yylex();

        System.out.println("\nlexical comment recognazation: " + scanner.commentvalue);

        // System.out.println(scanner.yytext());


    }
}
