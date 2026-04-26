package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, entre;

        entre = 0;

        System.out.println("Digite números, e eu mostrarei quais deles estão entre 20 e 80 (até você digitar 0).");

        do {
            numb = sc.nextInt();

            if (numb >= 20 && numb <= 80 ) {
                entre = entre + 1;
            }
        } while (numb != 0);

        System.out.println("Existem "+entre+" números/valores entre 20 e 80");
        sc.close();
    }
}
