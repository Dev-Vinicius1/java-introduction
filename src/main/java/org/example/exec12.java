package org.example;

// Q1 => x e y > 0
// Q2 => x < 0  e y > 0
// Q3 => x e y < 0
// Q4 => x > 0 e y < 0

import java.util.Locale;
import java.util.Scanner;

public class exec12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Q1.");
        } else if(x < 0 && y > 0){
            System.out.println("Q2.");
        } else if(x < 0 && y < 0){
            System.out.println("Q3.");
        } else if(x > 0 && y < 0){
            System.out.println("Q4.");
        }
        else{
            System.out.println("Origem.");
        }

        sc.close();

    }
}
