import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.BufferedReader;

public class UserInterfice {



    public String scanStringData() {

        Scanner scanner = new Scanner(System.in,"cp866");
        /*String output = new String("utf-8");*/
        String output = scanner.nextLine();
        System.out.println(output);
        return output;
    }

    public int scanIntData() {
        Scanner scanner = new Scanner(System.in);
        int put = scanner.nextInt();
        return put;
    }

/*    public String scanStringData() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        return s;
    }*/
}
