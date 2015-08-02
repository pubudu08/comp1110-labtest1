package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!");
    }
}
