package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class ShoeSize {


    private static int calculateShoeSize(double height) {
        return (int) Math.round(height * 5.0);
    }

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        double userHeight = SCANNER.nextDouble();
        int shoeSize = calculateShoeSize(userHeight);
        System.out.println(shoeSize);
    }

}
