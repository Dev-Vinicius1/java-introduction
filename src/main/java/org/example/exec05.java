package org.example;
/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
* */
import java.util.Scanner;
import java.util.Locale;

public class exec5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int produto1Id = sc.nextInt();
        int numeroDeProdutos1 = sc.nextInt();
        double valorUnitarioDoProduto1 = sc.nextDouble();

        int produto2Id = sc.nextInt();
        int numeroDeProdutos2 = sc.nextInt();
        double valorUnitarioDoProduto2 = sc.nextDouble();

        double valorTotal = (numeroDeProdutos1 * valorUnitarioDoProduto1) + (numeroDeProdutos2 * valorUnitarioDoProduto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();

    }
}
