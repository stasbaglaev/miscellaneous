package book.shildt.chapter10.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableObject {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\miscellaneous\\src\\main\\java\\book\\shildt\\chapter10\\serializable\\Object.txt";
        File file = new File(path);
        Client client;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            client = (Client) ois.readObject();
            System.out.printf("Клиент десериализован: Имя %s, возраст %d ", client.getName(), client.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}