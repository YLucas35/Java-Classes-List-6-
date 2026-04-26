package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb;
        int count;

        count = 0;

        do {
            System.out.println("Digite um número maior que 1:");
            numb = sc.nextDouble();

            if (numb <= 1) {
                System.out.println("Número inválido!");
            }
        } while (numb <= 1);

        do {
            numb = numb / 2;
            count = count + 1;
        } while (numb > 1);

        System.out.println("Foram realizadas: "+count+" divisões.");
        sc.close();
    }
}
