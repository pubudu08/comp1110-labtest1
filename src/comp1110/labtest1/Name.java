package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Projetct : comp1110-labtest1
 */
public class Name {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = SCANNER.nextLine();
        name = name.toUpperCase();
        int numberOfCharacters = name.length();
        System.out.println(name);
        System.out.println(numberOfCharacters);
    }
}
