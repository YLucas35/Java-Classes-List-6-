package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, count, maior, menor;

        count = 0;
        maior = 0;
        menor = 0;

        System.out.println("Digite números, e eu mostrarei quantos deles são maiores que 50 e menores do que 20");

        do {
            numb = sc.nextInt();
            if (numb > 50) {
                maior = maior + 1;
            }

            if (numb < 20) {
                menor = menor + 1;
            }

            count = count + 1;

        } while (count < 10);

        System.out.println("Os números maiores que 50: "+maior);
        System.out.println("Os números menores que 20: "+menor);
    }
}
