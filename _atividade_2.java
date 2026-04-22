package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, maior;

        maior = 0;

        do {
            System.out.println("Digite números, e eu direi quantos deles são maiores que 10. (até você digitar o número 0)");
            numb = sc.nextInt();

            if (numb >= 10) {
                maior = maior + 1;
            }
        } while (numb != 0);

        System.out.println("Existem: "+maior+" números maiores que 10.");
        sc.close();
    }
}
