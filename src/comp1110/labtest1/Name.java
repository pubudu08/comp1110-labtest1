package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.toUpperCase();
        int numberOfCharacters = name.length();
        System.out.println(name);
        System.out.println(numberOfCharacters);
    }
}
