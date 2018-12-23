package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {


        String answer = "";

        for (int i = start; i < stop; i++) {

            if (i % 2 != 0) {

                String allNumbers = String.valueOf(i);

                answer = answer.concat(allNumbers);
            }
        }

        return answer;
    }


    public static String getOddNumbers(int start, int stop) {

        String answer = "";

        for (int i = start; i < stop; i++) {

            if (i % 2 == 0) {

                String allNumbers = String.valueOf(i);

                answer = answer.concat(allNumbers);
            }
        }

        return answer;
    }

    public static String getSquareNumbers(int start, int stop, int step) {

        String answer = "";

        for (int i = start; i < stop; i += step) {

            int square = i * i;

            String squareString = Integer.toString(square);

            answer += squareString;

        }
        return answer;
    }

    public static String getRange(int stop) {

        String answer = "";

        for (int i = 0; i < stop - 1; i++) {

            String allNumbers = String.valueOf(i);

            answer = answer.concat(allNumbers);

        }

        return answer;
    }

    public static String getRange(int start, int stop) {

        String answer = "";

        for (int i = start; i < stop; i++) {

            String allNumbers = String.valueOf(i);

            answer = answer.concat(allNumbers);
        }
        return answer;
    }

    public static String getRange(int start, int stop, int step) {

        String answer = "";

        for (int i = start; i < stop; i += step++) {

            String allNumbers = String.valueOf(i);

            answer = answer.concat(allNumbers);
        }

        return answer;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        return null;
    }
}
