package com.Alexander.Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String COMMA_DELIMITER = ";";

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
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File csvFile = new File(filepath);
        try (PrintWriter csvWriter = new PrintWriter(new FileWriter(filepath));){
            for(List<String> item : records){
                csvWriter.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
