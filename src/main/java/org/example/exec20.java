package org.example;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
* */

import java.util.Scanner;

public class exec20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0){
                System.out.println("divisão impossível");
            }else{
                double divisao = (double) a / b;
                System.out.println(divisao);
            }

        }

        sc.close();

    }
}
