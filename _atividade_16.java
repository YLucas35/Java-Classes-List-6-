package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, count;

        count = 0;

        System.out.println("Digite números, e eu mostrarei quantos deles estão entre 10 e 50  (até você digitar 0)");

        do {
            numb= sc.nextInt();
            if (numb >= 10 && numb <= 50) {
                count = count + 1;
            }
        } while (numb != 0);
        
        System.out.println("A quantidade de números que estão entre 10 e 50 é: "+count);
        sc.close();
    }
}
