package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Projetct : comp1110-labtest1
 */
public class Movie {
    private static Scanner SCANNER = new Scanner(System.in);

    public static String runTimeCalculator(int runTime) {
        int hours = runTime / 60;
        int minute = runTime % 60;
        String appender = "";

        if (hours >= 1) {
            if (hours == 1) {
                appender = hours + " hour ";
            } else {
                appender = hours + " hours ";
            }
        }
        if (minute >= 1) {
            if (minute == 1) {
                appender = appender + minute + " minute";
            } else {
                appender = appender + minute + " minutes";
            }
        }

        return appender;
    }

    public static void main(String[] args) {
        //System.out.print("Name of the movie : ");
        String nameOfTheMovie = SCANNER.nextLine();
       // System.out.print("Run time of the movie : ");
        int runTime = SCANNER.nextInt();
        System.out.println(nameOfTheMovie + " runs for " + runTimeCalculator(runTime));

    }
}
