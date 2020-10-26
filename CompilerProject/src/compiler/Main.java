package compiler;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {



        /*File file = new File("src\\TestCases.txt");
        FileReader f1 = new FileReader(file);
        DecafScanner scanner = new DecafScanner(f1);*/

        String inputFile = new Scanner(System.in).next();
        DecafScanner scanner = new DecafScanner(new FileReader(inputFile));

        while(true) {
            int code = scanner.yylex();
            if (code == scanner.YYEOF)
                break;
        }
    }
}
