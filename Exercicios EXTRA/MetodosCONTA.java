//
//package exer;
//
//
//public class MetodosCONTA {
//  
//     private double saldo;
//    
//     public static void main(String[] args) {
//        MetodosCONTA minhaConta = new MetodosCONTA(1000.00);
//        
//         System.out.println("Saldo inicial; R$"+minhaConta.obterSaldo());
//         
//         minhaConta.depositar(500.00);
//         
//         System.out.println("Saldo apos deposito; R$"+minhaConta.obterSaldo());
//         
//         minhaConta.sacar(200.00);
//         
//         System.out.println("Saldo apos deposito; R$"+minhaConta.obterSaldo());
//         
//         minhaConta.sacar(2000.00);
//          
//          System.out.println("Saldo Final; R$"+minhaConta.obterSaldo());        
//         //...
//         
//         
//        
//        
//    }
//     
//     
//     
//     
//     
//     
//     
//     
//     
//    //depositar
//    //sacar
//    //obterSaldo
//    //main
//
//     
//     //Construtor - metodo especial
//    public MetodosCONTA(double saldoInicial) {
//       this.saldo = saldoInicial;
//
//    }
//
//    public double obterSaldo() {
//       return saldo;
//
//    }
//
//    public void depositar(double valor) {
//      if(valor > 0){
//          saldo += valor;
//          System.out.println("Deposito de R$"+valor+" realizado com sucesso");
//      }else{
//          System.out.println("Valor de depostio invalido");
//      }
//    }
//
//    public void sacar(double valor) {
//        if(valor > 0 && valor <= saldo){
//            saldo -= valor;
//            System.out.println("Saque de R$"+valor+" Realizado com sucesso");
//        }else{
//            System.out.println("Valor de saque invalido ou saldo insuficiente");
//          }
//     }
//}

//======================versao sem interaçao =====================================


package exer;

import java.util.Scanner;

public class MetodosCONTA {

    private double saldo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MetodosCONTA minhaConta = new MetodosCONTA(1000.00);

        int opcao;

        do {
            System.out.println("\n -- MENU --");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + minhaConta.obterSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor para deposito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    // Construtor
    public MetodosCONTA(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque invalido ou saldo insuficiente.");
        }
    }
}