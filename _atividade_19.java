package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, plus, count;
        double media;

        plus = 0;
        count = 0;

        System.out.println("Digite números, e eu mostrarei a media apenas daqueles que forem maiores do que 100 (até você digitar 0)");

        do {
            numb = sc.nextInt();
            if (numb > 100) {
                plus = plus + numb;
                count = count + 1;
            }
        } while (numb != 0);

        if (count > 0) {
            media = (plus * 1.0) / count;
            System.out.println("A média dos números maiores que 100 é: "+media);
        }
        else {
            System.out.println("Nenhum número maior que 100 foi digitado.");
        }
    }
}
