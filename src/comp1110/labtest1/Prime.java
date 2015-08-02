package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/2/15.
 * Project : comp1110-labtest1
 */
public class Prime {
    public static void main(String[] args) {
        boolean isPrime;
        int maxValue;
        Scanner scanner = new Scanner(System.in);
        maxValue = scanner.nextInt();

        if (maxValue >= 1) {
            for (int x = 2; x <= maxValue; x++) {
                isPrime = true;
                for(int j=2; j<x ;j++){
                    if (x % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(x);
                }
            }

        }

    }
}
