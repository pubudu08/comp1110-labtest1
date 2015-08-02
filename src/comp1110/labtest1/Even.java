package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Even {

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        int userInput = SCANNER.nextInt();
        for (int x = 1; x <= userInput; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
