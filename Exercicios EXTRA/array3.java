
package exercicios;

import java.util.Scanner; //

public class array3 {
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in); //
         
        // double[]notas = {8.5,7.0,9.2,6.5,10,0};
         
         System.out.println("---- relatorio de notas-----");
         System.out.println("Quantas notas vode deseja calcular?");
         int qtdNotas = sc.nextInt();
         
        
         
         double[]notas = new double[qtdNotas]; //
         
          //System.out.println(" quantidade de provas avaliadas: "+notas.length);  
         
         double soma = 0;  
         
         System.out.println("\nDigite as notas abaixo: "); //
         
         for (int i = 0; i < notas.length; i++) {
             
             //System.out.println("Nota"+(i+1)+" (armazenada no indice"+i+" ):"+notas[i]);
             
             System.out.println("Digite a nota "+(i+1)+": "); //
             notas[i] = sc.nextInt(); // 0,1,2
             soma = soma + notas [i];
             
         }
         
        double media = soma / notas.length;
         System.out.println("-------------------");
         System.out.println("Media final da turma: "+media);
         
         //laço for each
         System.out.println("\nListando as notas rapidamente usando for each: ");
         for(double notaAtual : notas){
             System.out.println("-> "+notaAtual);
             
         }
     }
}