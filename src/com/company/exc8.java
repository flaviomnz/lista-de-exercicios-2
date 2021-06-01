package com.company;

import java.util.Scanner;

public class exc8 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        double num, soma = 0;
        int cont = 0;

        do {
            System.out.println("Digite um número");
            num = ent.nextDouble();

            if (num >= 0){
                soma = num = soma;
                cont++;
            }
        }while (num >= 0);

        System.out.println("A soma é: " +soma);
        System.out.println("A quantidade de números digitados foi: " +cont);
        System.out.println("A média é: " + soma / cont);
    }
}
