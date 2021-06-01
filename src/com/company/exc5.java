package com.company;

import java.util.Scanner;

public class exc5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cidadeA;
        int cidadeB;
        int ano = 0;
        int taxaA;
        int taxaB;

        System.out.println("Informe a população da cidade A e da Cidade B.");
        cidadeA = scanner.nextInt();
        cidadeB = scanner.nextInt();

        System.out.println("Informe a taxxa de crescimento da cidade A e da cidade B.");
        taxaA = scanner.nextInt();
        taxaB = scanner.nextInt();

        while (cidadeA < cidadeB){
            cidadeA += cidadeA * taxaA;
            cidadeB += cidadeB * taxaB;
            ano += 1;
        }
    }
}
