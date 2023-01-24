package book.shildt.chapter5;

public class Task7 {

//    public static void main(String[] args) {
//        String msg = "Это просто тест";
//        String encMsg = "";
//        String decMsg = "";
//        String key = "hello!!!";
//        char code = 0;
//
//        System.out.print("Исходное сообщение: ");
//        System.out.println(msg);
//
//        // Получение ключа для шифрования из строки
//        for (int i = 0; i < key.length(); i++) {
//            code += key.charAt(i);
//        }
//        System.out.println(code);
//
//        // Шифрование сообщения
//        for (int i = 0; i < msg.length(); i++) {
//            encMsg = encMsg + (char) (msg.charAt(i) ^ code);
//        }
//
//        System.out.print("Зашифрованное сообщение: ");
//        System.out.println(encMsg);
//
//
//        // Дешифровка сообщения
//        for (int i = 0; i < msg.length(); i++) {
//            decMsg = decMsg + (char) (encMsg.charAt(i) ^ code);
//        }
//
//
//        System.out.print("Дешифрованное сообщение: ");
//        System.out.println(decMsg);
//    }

//    public static void main(String[] args) {
//        String msg = "Это просто тест";
//        String encMsg = "";
//        String decMsg = "";
//        String key = "aBC2!. -";
//
//
//        System.out.print("Исходное сообщение: ");
//        System.out.println(msg);
//
//        // Шифрование сообщения
//        for (int i = 0; i < msg.length(); i++) {
//            int mediate;
//            mediate = msg.charAt(i);
//            for (int j = 0; j < key.length(); j++) {
//                mediate = mediate ^ key.charAt(j);
//            }
//            encMsg = encMsg + (char) mediate;
//        }
//
//        System.out.print("Зашифрованное сообщение: ");
//        System.out.println(encMsg);
//
//        // Дешифровка сообщения
//        for (int i = 0; i < msg.length(); i++) {
//            int mediate;
//            mediate = encMsg.charAt(i);
//            for (int j = 0; j < key.length(); j++) {
//                mediate = mediate ^ key.charAt(j);
//            }
//            decMsg = decMsg + (char) mediate;
//        }
//
//        System.out.print("Дешифрованное сообщение: ");
//        System.out.println(decMsg);
//    }


    public static void main(String[] args) {
        String msg = "Это просто тест";
        String encMsg = "";
        String decMsg = "";
        String key = "aBC2!. -";
        int j;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        j = 0;
        // Шифрование сообщения
        for (int i = 0; i < msg.length(); i++) {
            encMsg = encMsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == key.length()) {
                j = 0;
            }
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encMsg);

        j = 0;
        // Дешифровка сообщения
        for (int i = 0; i < msg.length(); i++) {
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == key.length()) {
                j = 0;
            }
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decMsg);
    }

}