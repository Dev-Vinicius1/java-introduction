package org.example;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
*/

import java.util.Scanner;

public class exec16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while(opcao != 4){
            if(opcao == 1){
                alcool++;
            } else if(opcao == 2){
                gasolina++;
            } else if(diesel == 3){
                diesel++;
            }
            opcao = sc.nextInt();
            }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
        }

}
