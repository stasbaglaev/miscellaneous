package book.shildt.chapter10;
/*
    Программа отображает байты (в кодировке UTF-8) которыми
    представлен задаваемый символ
 */

import java.nio.charset.StandardCharsets;

public class CharacterInBytes {
    public static void main(String[] args) {
        String symbol = "-";
        for (byte b : symbol.getBytes(StandardCharsets.UTF_8)) {
            System.out.printf("%d ", Byte.toUnsignedInt(b));
        }
    }
}
