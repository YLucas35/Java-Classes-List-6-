package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb, plus, media;
        int count;

        plus = 0;
        count = 0;

        do {
            System.out.println("Digite números, e eu farei a média apenas dos números positivos. (até você digitar o número 0)");
            numb = sc.nextInt();
            
            if (numb > 0) {
                plus = plus + numb;
                count = count + 1;
            }
        } while (numb != 0);

        if (count > 0) {
            media = plus / count;
            System.out.println("A média dos números positivos é: "+media);
        }
        else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
        sc.close();
    }
}
