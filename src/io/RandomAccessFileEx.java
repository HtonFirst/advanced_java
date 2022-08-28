package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {

        try(RandomAccessFile randomAccessFile =
                new RandomAccessFile("test4.txt", "rw")) {

            int a = randomAccessFile.read();
            System.out.println((char) a);

            String s1 = randomAccessFile.readLine();
            System.out.println(s1);

            randomAccessFile.seek(101);

            String s2 = randomAccessFile.readLine();
            System.out.println(s2);

            Long position = randomAccessFile.getFilePointer();
            System.out.println(position);

            randomAccessFile.seek(randomAccessFile.length() - 1);
            randomAccessFile.writeBytes(" \n \t\t\t\t Stav Poleg");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
