package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Square {
    private static int calculateSquare(int square) {
        return square * square;
    }

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        int side = Integer.parseInt(SCANNER.nextLine());
        int area = calculateSquare(side);
        System.out.println(area);
    }
}
