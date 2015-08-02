package comp1110.labtest1;



import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/2/15.
 * Projetct : comp1110-labtest1
 */
public class Ones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputOne = Integer.parseInt(scanner.nextLine());
        String binaryConversion = Integer.toBinaryString(userInputOne);
        int counter = binaryConversion.length() - binaryConversion.replace("1","").length();
        System.out.println(counter);
    }
}
