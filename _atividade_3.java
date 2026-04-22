package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, plus;

        plus = 0;

        do {
            System.out.println("Digite números, e eu somarei apenas aqueles que são múltiplos de 3. (até você digitar o número 0)");
            numb = sc.nextInt();

            if (numb % 3 == 0) {
                plus = plus + numb;
            }
        } while (numb != 0);

        System.out.println("A soma do números múltiplos de 3 é "+plus);
        sc.close();
    }
}
