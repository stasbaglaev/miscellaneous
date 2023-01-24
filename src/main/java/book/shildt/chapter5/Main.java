package book.shildt.chapter5;

import book.shildt.chapter6.OuterClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        byte x = 120;

        x+=30;

        System.out.println(x);


        int[] num = {1,5};
        System.out.println(Arrays.toString(num));
        for (int element : num){
            element = 10;
        }

        System.out.println(Arrays.toString(num));


        char ch = 1100+1103;
        System.out.println(ch);
        System.out.println(Integer.toBinaryString(ch));
    }
}
