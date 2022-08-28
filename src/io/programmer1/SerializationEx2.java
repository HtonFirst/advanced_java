package io.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {

        Car car = new Car("Ford", "Green");
        Employee employee = new Employee("Edward", "IT", 33, 120_000.5, car);

        try (ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("employee1.bin"))){

            outputStream.writeObject(employee);
            System.out.println("DONE!!!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
