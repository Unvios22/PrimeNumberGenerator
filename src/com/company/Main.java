package com.company;

import java.util.Arrays;

public class Main {

    static int input = 101;

    public static void main(String[] args) {
	boolean[] table = new boolean[input + 1];

       Arrays.fill(table,true);

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (table[i]) {
                for (int j = i * i; j < input; j+=i) {
                    table[j] = false;
                }
            }
        }
        for (int i = 2; i <= input ; i++) {
            if (table[i]) {
                System.out.print(i + " ");
            }
        }
    }







}
