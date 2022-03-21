package tinkoff.date210322.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        String sign1;
        String sing2;
        String sign3;

//        do {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            sign1 = reader.readLine();
//            sing2 = reader.readLine();
//            sign3 = reader.readLine();
//        } while (!(A >= 0 && A <= Math.pow(10, 4)) || (!(B >= 0 && B <= Math.pow(10, 4))) || (!(N >= 1 && A <= Math.pow(10, 4))));


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sign1 = reader.readLine();
        sing2 = reader.readLine();
        sign3 = reader.readLine();
//        System.out.println(sign1);
//        System.out.println(sing2);
//        System.out.println(sign3);

        if ((sign1.equals("<")) && sing2.equals("<")) {
            if (sign3.equals(">")) {
                System.out.println("acb");
            } else {
                System.out.println("acb");
            }
        } else if ((sign1.equals(">")) && sing2.equals(">")) {
            if (sign3.equals(">")) {
                System.out.println("cba");
            } else {
                System.out.println("bca");
            }
        } else if ((sign1.equals("<")) && sing2.equals(">")) {
            System.out.println("cab");
        } else if ((sign1.equals(">")) && sing2.equals("<")) {
            System.out.println("bac");
        } else if ((sign1.equals("="))) {
            if ((sing2.equals(">"))) {
                System.out.println("cba");
            } else {
                System.out.println("abc");
            }
        }
    }
}
