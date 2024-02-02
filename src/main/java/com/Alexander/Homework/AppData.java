package com.Alexander.Homework;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[][] toCSVTable() {

        String[][] table = new String[this.data.length + 1][this.header.length];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                String semicolon = column == table[0].length - 1 ? ";\n" : ";";
                if (row == 0) {
                    table[row][column] = this.header[column] + semicolon;
                } else {
                    table[row][column] = this.data[row - 1][column] + semicolon;
                }
            }
        }
        return table;
    }
}
