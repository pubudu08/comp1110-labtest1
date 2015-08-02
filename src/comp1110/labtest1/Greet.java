package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Greet {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = SCANNER.nextLine();
        System.out.println("Hi " + name + "!");
    }
}
