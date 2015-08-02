package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Pubudu Dissanayake on 8/1/15.
 * Project : comp1110-labtest1
 */
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = scanner.nextDouble();
        double lowestMark = 0.0;
        double highestMark = 100.0;
        if (mark <= highestMark && mark >= lowestMark) {
            System.out.println(GradeValues.gradeFromMark(mark));
        } else {
            System.out.println("Bad mark");
        }
    }

    enum GradeValues {
        HD(80), D(70), C(60), P(50), N(0);

        int lowerBound;

        GradeValues(int i) {
            this.lowerBound = i;
        }

        public static GradeValues gradeFromMark(double mark) {
            for (GradeValues grade : GradeValues.values()) {
                if (mark >= grade.lowerBound) {
                    return grade;
                }
            }
            return N;
        }
    }
}
