package io;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {

        try (DataOutputStream outputStream =
                     new DataOutputStream(new FileOutputStream("my_test1.bin"));
             DataInputStream inputStream =
                     new DataInputStream(new FileInputStream("my_test1.bin"));
             ){
            outputStream.writeBoolean(true);
            outputStream.writeLong(2_000_000L);
            outputStream.writeFloat(3.14F);
//            outputStream.writeBytes("sdf");
            outputStream.writeInt(456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
//            System.out.println("Byte "  + inputStream.readByte());
            System.out.println("Int " + inputStream.readInt());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
