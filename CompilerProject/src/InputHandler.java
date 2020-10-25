import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputHandler {


    public static void main(String[] args) throws IOException {

        File file = new File("src\\TestCases.txt");
        // System.out.println(file.exists());
        FileReader f1 = new FileReader(file);
        DecafScanner scanner = new DecafScanner(f1);
        int j = 0;

        while(true) {

            int code = scanner.yylex();
            /*System.out.println(j);*/
            if (code == scanner.YYEOF)
                break;
            j++;
        }
    }
}
