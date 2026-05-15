
package atividades3;

import java.util.Scanner;

public class media {
   
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Segunda nota");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.printf("A media do aluno é: %.2f",media);
        
        if(media >= 7){
            System.out.println(" Aluno aprovado");
        }else if(media >= 5){
            System.out.println(" Aluno em recuperaçao");
        }else{ 
            System.out.println(" Aluno reprovado");
        } 
    
    
}
}

