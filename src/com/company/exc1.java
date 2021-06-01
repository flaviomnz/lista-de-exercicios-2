package com.company;

import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite sua nota de 0 a 10 ");
        int nota = scanner.nextInt();

        while(nota > 10 || nota < 0){
            System.out.println("Valor inválido, por favor digite a nota corretamente.");
            nota = scanner.nextInt();
        }
    }
}
