
package exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = sc.nextInt();
        for(int i=1; i<=10;i++){ //1 2 ... 10 1*3
            System.out.println(num+ " X " +i+ " = " +(num *i)); // 1 x 1 = 1
        }
    }
      
}
