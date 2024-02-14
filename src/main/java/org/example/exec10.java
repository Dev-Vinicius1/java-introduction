package org.example;
/*
*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */

import java.util.Scanner;

public class exec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if(horaInicial > horaFinal){
            int tempoTotalDeJogo = 24 - (horaInicial - horaFinal);
            System.out.printf("O JOGO DUROU %d HORA(S)", tempoTotalDeJogo);
        }else{
            int tempoTotalDeJogo = horaFinal - horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", tempoTotalDeJogo);
        }

        sc.close();
        
    }
}
