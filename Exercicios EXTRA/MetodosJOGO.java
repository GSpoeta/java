package exer;

import java.util.Scanner;
import java.util.Random;

public class MetodosJOGO {

    public static void iniciarJogo() {
        System.out.println("Bem-vindo ao jogo de adivinhacao!");
        System.out.println("Tente adivinhar o numero que estou pensando de 1 a 100");
    }

    // metodo para processar a entrada do usuario
    public static int processarEntrada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu palpite: ");
        return sc.nextInt();
    }

    // metodo para verificar se o jogador ganhou
    public static boolean verificarVencedor(int palpite, int numeroSecreto) {
        if (palpite == numeroSecreto) {
            System.out.println("Parabens! Voce acertou o numero!");
            return true;
        } else if (palpite < numeroSecreto) {
            System.out.println("O numero e maior que " + palpite);
        } else {
            System.out.println("O numero e menor que " + palpite);
        }
        return false;
    }

    // metodo principal
    public static void main(String[] args) {
        iniciarJogo();

        Random rd = new Random();
        int numeroSecreto = rd.nextInt(100) + 1;
        boolean venceu = false;

        while (!venceu) {
            int palpite = processarEntrada();
            venceu = verificarVencedor(palpite, numeroSecreto);
        }

        System.out.println("Obrigado por jogar!");
    }
}