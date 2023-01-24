package tinkoff.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class MainBackUp {
    public static void main(String[] args) throws IOException {
        byte LengthBoard;
        byte WidthBoard;

        do {
            System.out.println("\nВведите два целых числа через пробел");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = reader.readLine().split(" ");

            List<Byte> list = new LinkedList<>();
            for (String string : strings) {
                list.add(Byte.valueOf(string));
            }

            LengthBoard = list.get(0);
            WidthBoard = list.get(1);

            //System.out.println("Длина доски (x): " + LengthBoard);
            //System.out.println("Ширина доски (y): " + WidthBoard);

        } while ((!((LengthBoard >= 1) && (LengthBoard <= 50))) || (!((WidthBoard >= 1) && (WidthBoard <= 50))));

        Horse horse = new Horse();
        moveHorse(horse, LengthBoard - 1, WidthBoard - 1);

    }

    static void moveHorse(Horse horse, int toX, int toY) {
        int step = 0;
        for (; horse.getX() + 2 <= toX; step++) {
            horse.stepRight_Up();
            System.out.println("Конь по оси х " + horse.getX());
            System.out.println("Конь по оси у " + horse.getY());
        }
        for (; horse.getY() + 2 <= toY; step++) {
            horse.stepUp_Right();
            System.out.println("Конь по оси х " + horse.getX());
            System.out.println("Конь по оси у " + horse.getY());
        }

        if ((horse.getX() == toX) && (horse.getY() == toY)) {
            System.out.println(step);
        } else {
            System.out.println(0);
        }


    }

    public static class Horse {
        int x = 0;
        int y = 0;

        public Horse() {
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void stepUp_Right() {
            //System.out.println("вверх");
            this.y = this.y + 2;
            this.x++;
        }

        public void stepRight_Up() {
            //System.out.println("направо");
            this.x = this.x + 2;
            this.y++;
        }
    }
}





