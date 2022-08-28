package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String text = "Коммерческие запасы нефти в США\n" +
                " (исключая стратегический резерв) за неделю,\n" +
                " завершившуюся 29 июля, выросли на 4,5 миллиона баррелей, \n" +
                "или на 1,1%, до 426,6 миллиона баррелей, говорится в еженедельном обзоре\n" +
                " управления энергетической информации минэнерго страны.\n";
        String s = "Privet!!!";


        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt", true);
//            for(int i = 0; i < text.length(); i++) {
//                writer.write(text.charAt(i));
//            }
//            writer.write(text);
            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
