
package exercicios;

import java.util.Scanner; //

public class array4 {
    public static void main(String[] args) {
       
        
       // String[] alunos = {"jose","pablo","willy","derik"};
       
        Scanner sc = new Scanner(System.in); //
        String[] alunos = new String[3];
        
        System.out.println("-- cadrastro de alunos --"); //
        System.out.println("Voce tem "+alunos.length+" vagas na turma" ); //
       
       
      //  System.out.println("-- lista de chmada --");
     //   System.out.println("Total de alunos matriculados: "+alunos.length);
        System.out.println("-----------------------------");
        
        for (int i = 0; i < alunos.length; i++) {
            //System.out.println("Numero "+(i+1)+ ": "+alunos[i]);
            System.out.println("Digite o nome do "+(i+1)+" aluno: ");
            alunos[i]= sc.nextLine();
        }
      //  System.out.println("\n[aviso] o aluno 'derik' foi tranferido. 'bryan' ocupou a vaga");
       // alunos[3] = "bryan";
        
        System.out.println("--Nova lista atualizada da chamada--");
        for(String nomeAtual : alunos){
            System.out.println("- "+nomeAtual);
        }
            
        }
    }
    
    

    

