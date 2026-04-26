package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, pluspar, plusimpar;

        System.out.println("Digite números, e eu mostrarei a soma daqueles números que são pares  e ímpares de forma separada. (Até você digitar 0)");

        pluspar = 0;
        plusimpar = 0;

        do {
            numb = sc.nextInt();
            if (numb % 2 == 0) {
                pluspar = pluspar + numb;
            }
            else {
                plusimpar = plusimpar + numb;
            }
        } while (numb != 0);

        System.out.println("A soma dos números pares é: "+pluspar);
        System.out.println("A soma dos números impares é: "+plusimpar);
        sc.close();
    }
}
