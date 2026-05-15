package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Voce é um semi-deus e pulou de um helitotero");
        System.out.println("Você deseja aterrissar com estilo ou abrir um paraquedas?");
        System.out.print("Digite sua escolha: ");

        String escolha = sc.nextLine().toLowerCase();

        System.out.println("Os dados vão rolar...");

        int tempo = rd.nextInt(2000) + 1000;

        try {
            Thread.sleep(tempo);
        } catch (Exception e) {
            System.out.println("O programa foi acordado no susto");
        }

        int resultado = rd.nextInt(6) + 1;
        System.out.println("O número é: " + resultado);

       
        if (escolha.contains("estilo")) {
            if (resultado > 4) {
                System.out.println("Você aterrissou com estilo! Sobreviveu ");
            } else {
                System.out.println("A queda foi de 50 metros... você não resistiu ");
            }
        } else if (escolha.contains("paraquedas")) {
            if (resultado > 3) {
                System.out.println("O paraquedas abriu! Você sobreviveu ");
            } else {
                System.out.println("O paraquedas falhou... fim de jogo ");
            }
        } else {
            System.out.println("Escolha inválida!");
        }

    }
}