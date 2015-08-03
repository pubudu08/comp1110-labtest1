package comp1110.labtest1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Pubudu Dissanayake on 8/2/15.
 * Project : comp1110-labtest1
 */
public class Permute {

    public static Set<String> permuteCalculation(String sampleString) {
        Set<String> permuteStrings = new HashSet<String>();

        if (sampleString == null) {
            return null;
        } else if (sampleString.length() == 0) {
            permuteStrings.add("");
            return permuteStrings;
        }
        char firstChar = sampleString.charAt(0);
        String subStringValue = sampleString.substring(1);
        Set<String> collectionOfWords = permuteCalculation(subStringValue);
        if (collectionOfWords != null) {
            for (String words : collectionOfWords) {
                for (int x = 0; x <= words.length(); x++) {
                    permuteStrings.add(permuteCharAdd(words, firstChar, x));
                }
            }
        }
        return permuteStrings;
    }

    public static String permuteCharAdd(String string, char letter, int count) {
        String first = string.substring(0, count);
        String last = string.substring(count);
        return first + letter + last;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputOne = scanner.nextLine();
        String userInputTwo = scanner.nextLine();

        Set<String> collectionOfPossiblePremute = permuteCalculation(userInputOne);
        if (collectionOfPossiblePremute != null) {
            if (collectionOfPossiblePremute.contains(userInputTwo)) {
                System.out.println("Yes");
                System.out.println(collectionOfPossiblePremute);
            } else {
                System.out.println("No");
            }
        }
    }
}
