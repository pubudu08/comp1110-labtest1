package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Projetct : comp1110-labtest1
 */
public class Movie {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = SCANNER.nextInt();
        for (int x = 1; x <= userInput; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
