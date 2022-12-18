package book.shildt.chapter10;

import java.util.Scanner;

public class ScannerExs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            if (scanner.hasNextInt()) {

                System.out.println(scanner.nextInt());
            }
        } while (scanner.next().compareTo("stop") != 0);
    }
}
