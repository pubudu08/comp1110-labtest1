package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/2/15.
 * Projetct : comp1110-labtest1
 */
public class Radix {

    public static void main(String[] args) {
        int sourceBase, destinationBase;
        Scanner scanner = new Scanner(System.in);
        sourceBase = scanner.nextInt();
        destinationBase = scanner.nextInt();
        int userInput = scanner.nextInt();
        //Source base conversion
        int tempInt =   Integer.parseInt("" + userInput, sourceBase);
        //Destination base conversion
        String value= Integer.toString(tempInt, destinationBase);
        System.out.println(value);

    }

}
