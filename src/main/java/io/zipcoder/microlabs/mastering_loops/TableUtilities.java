package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder str = new StringBuilder();

        int rowNum;
        int currentNum;

        for (int i = 0; i < tableSize; i++) {
            rowNum = i + 1;
            currentNum = 0;

            for (int j = 0; j < tableSize; j++) {

                currentNum += rowNum;
                str.append(String.format("%3s |", currentNum));
            }
            str.append("\n");
        }
        return str.toString();
    }
}
