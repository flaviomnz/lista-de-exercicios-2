package com.company;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args){
        //nome
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        nome.length();

        while (nome.length() < 3){
            System.out.println("Nome curto, mínimo 3 caracteres");
            nome = scanner.nextLine();
        }

        //idade
        Scanner sidade = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = sidade.nextInt();

        while(idade < 0 || idade > 150){
            System.out.println("Idade máxima 150 anos.");
            idade = sidade.nextInt();
        }

        //salario
        Scanner ssalario = new Scanner(System.in);
        System.out.println("Digite seu salário");
        double salario = ssalario.nextDouble();

        while (salario < 1){
            System.out.println("ERRO! Digite novamente.");
            salario  = ssalario.nextDouble();
        }

        //sexo
        Scanner ssexo = new Scanner(System.in);
        System.out.println("Digite seu sexo: f = Feminino || m = Masculino.");
        String gen = ssexo.next();
        while(!gen.equalsIgnoreCase("f")&&!gen.equalsIgnoreCase("m")){
            System.out.println("ERRO!");
            gen = ssexo.nextLine();
        }

        //estado civil
        Scanner scivil = new Scanner(System.in);
        System.out.println("Digite seu estado civil: s = solteiro / c = casado / v = viúvp / d = divorciado");
        String civil = scivil.nextLine();

        while (!gen.equalsIgnoreCase("s")&&!gen.equalsIgnoreCase("c")&& !gen.equalsIgnoreCase("v") && !gen.equalsIgnoreCase("d")){

        }

    }
}
