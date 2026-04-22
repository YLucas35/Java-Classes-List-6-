package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, plus, limit;

        plus = 0;

        System.out.println("Digite um número limite:");
        limit = sc.nextInt();

        do {
            System.out.println("Digite números até alcançar esse limite");
            numb = sc.nextInt();
            plus = plus + numb;
        } while (plus <= limit);

        System.out.println("Você ultrapassou o limite imposto por você mesmo e a soma dos números é: "+plus);
        sc.close();
    }
}
