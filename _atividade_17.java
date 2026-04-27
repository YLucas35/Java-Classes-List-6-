package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, count, par;

        count = 0;
        par = 0;

        System.out.println("Digite números, e eu somarei apenas aqueles que são pares (até você digitar 0)");

        do {
            numb = sc.nextInt();
            if (numb % 2 == 0) {
                par = par + numb;
                count = count + 1;
            }
        } while (numb != 0);

        System.out.println("A soma dos números pares é: "+par);
        sc.close();
    }
}
