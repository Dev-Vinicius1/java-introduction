package org.example;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class exec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero%2 == 0){
            System.out.println("É par!");
        }else{
            System.out.println("É ímpar!");
        }

        sc.close();

    }
}
