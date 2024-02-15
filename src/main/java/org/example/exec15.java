package org.example;

import java.util.Scanner;
/*
1º  x e y > 0
2º  x < 0 && y > 0
3º x < 0 && y < 0
4º x > 0 && y < 0
*/

public class exec15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            } else if(x < 0 && y > 0){
                System.out.println("segundo");
            } else if(x < 0 && y < 0){
                System.out.println("terceiro");
            } else if(x > 0 && y < 0){
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }
}
