import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputHandler {


    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Universty\\Term_7\\Compiler\\Project\\P1\\Code\\src\\t1.txt");
        FileReader f1 = new FileReader(file);
        System.out.println(file.exists());

        myfist scanner = new myfist(f1);
        int code = scanner.yylex();

        System.out.println("\n" + scanner.name);

        // System.out.println(scanner.yytext());


    }
}
