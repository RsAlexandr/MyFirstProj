package Homework;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_13_06_2022_4 {
    public static void main(String[] args) throws IOException {
        char a = (char) System.in.read();
        char b = (char) System.in.read();
        char c = (char) System.in.read();
        char d = (char) System.in.read();
        char e = (char) System.in.read();
        char[] all = {a, b, c, d, e};
        char temp = 0;
        int i = 0;
        int j = 0;

        for (i = 0; i < all.length - 1; i++){
            for (j = 0; j < all.length - 1; j++){
                if(all[j] > all[j+1]) {
                    temp = all[j];
                    all[j] = all[j + 1];
                    all[j + 1] = temp;
                }
            }
        }
        System.out.println(all);
    }
}
