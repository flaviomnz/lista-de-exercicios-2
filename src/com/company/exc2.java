package com.company;

import java.util.Scanner;

public class exc2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário");
        String usuario = scanner.next();

        System.out.println("Digite sua senha");
        String senha = scanner.next();

        while(usuario.equalsIgnoreCase(senha)){
            System.out.println("Erro! sua senha e seu usuário não podem ser iguais");
            System.out.println("Digite seu usuario");
            String novo = scanner.next();

            System.out.println("Digite sua senha");
            String senha1 = scanner.next();
        }
        System.out.println("Cadastro concluido!");
    }
}
