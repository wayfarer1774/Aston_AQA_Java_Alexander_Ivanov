//дз-6
package com.Alexander.Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        AppData obj = new AppData();
        String filepath = "myfile.csv";
        int rows = countRows(filepath);
        int rowsWithoutHeader = rows - 1;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            obj.setHeader(line.split("\";\""));
            for (int i = 0; i < obj.getHeader().length; i++) {
                obj.getHeader()[i] = obj.getHeader()[i].replaceAll("\"|\"|;", "");
                //System.out.println((obj.getHeader()[i]));
            }

            for (int j = 0; j < rowsWithoutHeader; j++) {
                line = reader.readLine();
                String[] stringArray = line.split("\";\"");
                int intArray[] = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; i++) {
                    stringArray[i] = stringArray[i].replaceAll("\"|\"|;", "");
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }
            }

            for (int j = 0; j < rowsWithoutHeader; j++) {
                for (int i = 0; i < intArray.length; i++) {
                    obj.getData()[i][j] = intArray[i];
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    private static int countRows(String filePath) {
        int numRows = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) {
                numRows++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numRows;
    }


}
