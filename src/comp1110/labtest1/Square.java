package comp1110.labtest1;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Projetct : comp1110-labtest1
 */
public class Square {
    private static Scanner SCANNER = new Scanner(System.in);


    private static int calculateSquare(int square) {
        return square * square;
    }

    public static void main(String[] args) {
//        String queryOne = "Input the length of a side : ";
//        System.out.print(queryOne);
//        int side = Integer.parseInt(SCANNER.nextLine());
//        int area = calculateSquare(side);
//        System.out.println( area);

        Random r = new Random();
        for(int e = 0; e < 10; ++e) {
            calculateSquare(r.nextInt(1024));
            System.out.println(calculateSquare(r.nextInt(1024)));
        }
    }
}
