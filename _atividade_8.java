package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, multi;

        multi = 0;

        System.out.println("Digite números, e eu mostrarei quantos deles são multiplos de 5 (até você digitar 0)");

        do {
            numb = sc.nextInt();

            if (numb % 5 == 0) {
                multi = multi + 1;
            }
        } while (numb != 0);

        System.out.println("Existem "+multi+" números múltiplos de 5.");
        sc.close();
    }
}
