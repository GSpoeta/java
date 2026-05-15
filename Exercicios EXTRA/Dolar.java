package exercicios;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Muito prazer, " + nome);
        
        System.out.print("Quantos reais você tem? ");
        double reais = teclado.nextDouble();
        
        double dolar = reais / 5.45;
        System.out.printf("Você pode comprar: US$ %.2f%n", dolar);

        System.out.print("Digite a distância em quilômetros que você vai viajar: ");
        double km = teclado.nextDouble();

        double metros = km * 1000;
        double cm = metros * 100;

        System.out.println("Metros: " + metros);
        System.out.println("Centímetros: " + cm);

        System.out.print("Digite o valor da passagem: ");
        double valor = teclado.nextDouble();

        double novoValor = valor * 0.99;
        
        System.out.printf("Valor com desconto: R$ %.2f%n", novoValor);

        teclado.close();
    }
}