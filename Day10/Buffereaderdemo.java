package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffereaderdemo {

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number:");

        // ✅ Use System.in instead of null
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int a = Integer.parseInt(br.readLine());
        System.out.println("Result: " + a);

        // Close the readers (optional for System.in but good practice)
        br.close();
        in.close();
    }
}
