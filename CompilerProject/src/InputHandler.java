import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputHandler {


    public static void main(String[] args) throws IOException {

        File file = new File("src\\t1.txt");
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

        // this section seems unnecessary.

        // Token t = Token.
        //System.out.println("\nkeyword tokens:");
        /*for (int i = 0; i < scanner.tokenArrayList.size(); i++){
            System.out.println(scanner.tokenArrayList.get(i));
        }*/

        //System.out.println("\nlexical comment recognazation: " + scanner.commentvalue);

        // System.out.println(scanner.yytext());

    }
}
