package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Projetct : comp1110-labtest1
 */
public class Odd {
    public static boolean isOdd(int i) {
        boolean flag;
        flag = i % 2 != 0;
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (isOdd(userInput)) {
            System.out.println("" + userInput + " is odd");
        } else {
            System.out.println("" + userInput + " is even");
        }
    }
}
