package com.company;

import java.util.Scanner;

public class exc4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = 80000;
        int b = 200000;
        int ano = 0;

        while(a <= b){
            a += b * 0.03;
            b += b * 0.015;
            ano += 1;
        }
        System.out.println("A ultrapassa ou iguala a B em %d anos" + ano);

    }
}
