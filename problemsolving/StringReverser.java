package problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringReverser {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        ReverseStringParenthesis reverseStringParenthesis = new ReverseStringParenthesis();
        String output = reverseStringParenthesis.reverseSubstrings(str);

        System.out.println("Reverses substring -> " + output);
    }
}
