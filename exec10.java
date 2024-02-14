package org.example;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
--------------------------------------------------
Código    |      Especificação     |      Preço
  1       |    Cachorro quente     |  R$4.00
  2       |   X-Salada             |  R$ 4.50
  3       |   X-Bacon              |  R$ 5.00
  4       |   Torrada Simples      |  R$ 2.00
  5       |  Refrigerante          |  R$ 1.50
--------------------------------------------------
*/

import java.util.Scanner;

public class exec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoProduto = sc.nextInt();
        int quantidadeDoProduto = sc.nextInt();
        double precoTotal = 0;

        switch (codigoProduto){
            case 1:
                precoTotal = 4.00*quantidadeDoProduto;
                break;
            case 2:
                precoTotal = 4.50*quantidadeDoProduto;
                break;
            case 3:
                precoTotal = 5.00*quantidadeDoProduto;
                break;
            case 4:
                precoTotal = 2.00*quantidadeDoProduto;
                break;
            case 5:
                precoTotal = 1.50*quantidadeDoProduto;
                break;
            default:
                System.out.println("Valor incorreto, tente novamente!");
        }
        
        System.out.printf("Total: R$ %.2f",precoTotal);

        sc.close();

    }
}
