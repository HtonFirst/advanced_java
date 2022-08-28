package io.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();

        employees.add("John");
        employees.add("Helen");
        employees.add("Victor");
        employees.add("Anna");

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream("e_list1.bin")) ){
            outputStream.writeObject(employees);
            System.out.println("Done!!!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
