package org.example;

import java.util.Locale;
import java.util.Scanner;

// <= 2000 - isento
// <= 3000 - 8%
// <= 4500 - 18%
// > 4500 - 28%


public class exec13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if(salario <= 2000){
            imposto = 0.0;
            System.out.println("Isento de imposto");
        } else if(salario <= 3000){
            imposto = 0.08 * (salario - 2000);
            System.out.printf("R$: %.2f", imposto);
        } else if(salario <= 4500){
            imposto = 0.18 * (salario - 3000) + 0.08 * 1000;
            System.out.printf("R$: %.2f", imposto);
        } else {
            imposto = 0.28 * (salario - 4500) + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$: %.2f", imposto);
        }

        sc.close();

    }

}
