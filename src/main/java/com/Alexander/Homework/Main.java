package com.Alexander.Homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    /*
    Реализовать сохранение данных в csv файл; Реализовать загрузку данных из csv файла. Файл читается целиком.

    Структура csv файла:
    Строка заголовок с набором столбцов
    Набор строк с целочисленными значениями
    Разделитель между столбцами - символ точка с запятой (;)

    Пример (см. на прикрепленном скриншоте)

    Для хранения данных использовать класс вида:
    public class AppData {
        private String[] header;
        private int[][] data;
        // ...
    }
    Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
    */
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

    }
}
