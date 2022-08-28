package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");

        File folder = new File("C:\\Users\\pbaye\\Desktop\\Taskbox");

        File file2 = new File("C:\\Users\\pbaye\\Desktop\\Taskbox\\test1.txt");
        File folder2 = new File("C:\\Users\\pbaye\\Desktop\\Taskbox\\testfolder");

        System.out.println("file.getAbsolutePath() - " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() - " + folder.getAbsolutePath());
        System.out.println("___________________________________________________");

        System.out.println("file.isAbsolute() - " + file.isAbsolute());
        System.out.println("folder.isAbsolute() - " + folder.isAbsolute());
        System.out.println("___________________________________________________");

        System.out.println("file.isDirectory() - " + file.isDirectory());
        System.out.println("folder.isDirectory() - " + folder.isDirectory());
        System.out.println("___________________________________________________");

        System.out.println("file.exists() - " + file.exists());
        System.out.println("folder.exists() - " + folder.exists());
        System.out.println("file2.exists() - " + file2.exists());
        System.out.println("folder2.exists() - " + folder2.exists());
        System.out.println("___________________________________________________");

        System.out.println("file2.createNewFile() - " + file2.createNewFile());
        System.out.println("folder2.mkdir() - " + folder2.mkdir());
        System.out.println("file.createNewFile() - " + file.createNewFile());
        System.out.println("___________________________________________________");

        System.out.println("file2.length() - " + file2.length());
        System.out.println("folder2.length() - " + folder2.length());
        System.out.println("___________________________________________________");

//        System.out.println("file2.delete() - " + file2.delete());
//        System.out.println("folder2.delete() - " + folder2.delete());
//        System.out.println("___________________________________________________");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("___________________________________________________");


        System.out.println("file2.isHidden()  " + file2.isHidden());
        System.out.println("file2.canRead()  " + file2.canRead());
        System.out.println("file2.canWrite() " + file2.canWrite());
        System.out.println("file2.canExecute()  " + file2.canExecute());
        System.out.println("___________________________________________________");


    }
}
