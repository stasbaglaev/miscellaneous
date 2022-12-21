package book.shildt.chapter10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.53;
        boolean b = true;
    
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("RWFile.txt"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("RWFile.txt"))) {
            System.out.println("Записано: " + i);
            dataOutputStream.writeInt(i);
            System.out.println("Записано: " + d);
            dataOutputStream.writeDouble(d);
            System.out.println("Записано: " + b);
            dataOutputStream.writeBoolean(b);
            System.out.println();

            i = dataInputStream.readInt();
            System.out.println("Прочитано: " + i);
            d = dataInputStream.readDouble();
            System.out.println("Прочитано: " + d);
            b = dataInputStream.readBoolean();
            System.out.println("Прочитано: " + b);


        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
