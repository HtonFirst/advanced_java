package io;

import java.io.*;

public class CopyBinaryFileExample {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\pbaye\\Desktop\\java.png");
        FileOutputStream outputStream = new FileOutputStream("java.png");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("Done!!!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
