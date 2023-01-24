package book.shildt.chapter10.serializable;

import java.io.*;

public class SerializableObject {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\miscellaneous\\src\\main\\java\\book\\shildt\\chapter10\\serializable\\Object.txt";
        File file = new File(path);
        Client client = new Client("Stanislav", 28);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(client);
            System.out.printf("Объект 'client' сериализован: Имя %s, возраст %d ", client.getName(), client.getAge());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


class Client implements Serializable {
    static final long serialVersionUID = 42L;
    private String name;
    private int age;


    Client(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}