package org.example;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
* */
public class exec4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int horaTrabalhada = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salarioFuncionario = horaTrabalhada * valorPorHora;

        System.out.println("Number = " + id);
        System.out.println("Salary = U$ "+ salarioFuncionario);


        sc.close();


    }
}
