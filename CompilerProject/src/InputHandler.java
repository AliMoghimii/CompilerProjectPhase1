import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputHandler {


    public static void main(String[] args) throws IOException {

        File file = new File("D:\\APh504\\Bachelor\\Semester 7\\2. Compiler Design\\3.HWs\\Project Phase 1\\codes\\Compiler Github v2\\this is the folder gitted\\CompilerProject\\src\\t1.txt");
        System.out.println(file.exists());
        FileReader f1 = new FileReader(file);
        myfist scanner = new myfist(f1);
        int j = 0;

        while(true) {

            int code = scanner.yylex();
            System.out.println(j);
            if (code == scanner.YYEOF)
                break;
            j++;
        }

       // Token t = Token.
        System.out.println("\nkeyword tokens:");
        for (int i = 0; i < scanner.tokenArrayList.size(); i++){
            System.out.println(scanner.tokenArrayList.get(i));
        }

        //System.out.println("\nlexical comment recognazation: " + scanner.commentvalue);

        // System.out.println(scanner.yytext());

    }
}
