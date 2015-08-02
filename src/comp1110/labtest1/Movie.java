package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Movie {
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
                if(!appender.isEmpty()){
                    appender = appender +"and "+ minute + " minutes";
                } else{
                    appender = appender+ minute + " minutes";
                }
            }
        }

        return appender;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTheMovie = scanner.nextLine();
        int runTime = scanner.nextInt();
        System.out.println(nameOfTheMovie + " runs for " + runTimeCalculator(runTime));

    }
}
