package atividades3;

import java.util.Scanner;

public class Departamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); 

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = sc.nextInt(); 
        
        System.out.print("Digite o ano atual: ");
        int ano = sc.nextInt();  
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu ano de nascimento é: " + nasc);
        System.out.println("O ano atual é: " + ano);

      
        int idadeCalculada = ano - nasc;

        
        if (idadeCalculada >= 18) {
            System.out.println("APTO, pode beber 51! ");
        } else {
            System.out.println("Você deve beber toddynho no role! ");
        }
    }
}