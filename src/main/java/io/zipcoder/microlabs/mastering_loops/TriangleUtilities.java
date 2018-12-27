package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= numberOfRows-1; i++) {

            for (int j = 1; j <= i ; j++) {

                str.append("*");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public static String getRow(int numberOfStars) {

        String answer = "";

        for (int i = 1; i <= numberOfStars; i++) {

            answer += "*";
        }

        return answer;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
