package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int countChars = 0;     //Количество символов в тексте;
        int countNonSpace = 0;  //Количество символов без пробелов
        int countWord = 0;      //Количество слов

	    String pathIn = "C:\\Users\\anato\\IdeaProjects\\analizeFile\\src\\com\\company\\Input_file.txt";
        FileReader fr = new FileReader(pathIn);
        BufferedReader br = new BufferedReader(fr);

	    String pathOut = "C:\\Users\\anato\\IdeaProjects\\analizeFile\\src\\com\\company\\Output_file.txt";
        FileWriter fw = new FileWriter(pathOut);
        BufferedWriter bw = new BufferedWriter(fw);

        String string = "";
        while ((string = br.readLine()) != null){

            countChars += string.length();
            String[] arrayString = string.split(" ");
            countWord += arrayString.length;

            for (int i = 0; i < arrayString.length; i++){
                countNonSpace += arrayString[i].length();
            }
        }
        br.close();

        bw.write("Количество символов: " + countChars + "\n");
        bw.write("Количество символов без пробелов: " + countNonSpace + "\n");
        bw.write("Количество слов: " + countWord + "\n");
        bw.close(); //Без закрытия потока записи файл не сохранится

        System.out.println("Количество символов: " + countChars);
        System.out.println("Количество символов без пробелов: " + countNonSpace);
        System.out.println("Количество слов: " + countWord);
    }
}
