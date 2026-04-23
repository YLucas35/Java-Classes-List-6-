package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, result;

        System.out.println("Digite números, e eu mostrarei o dobro deles no final (até você digitar 0)");

        do {
            numb = sc.nextInt();
            result = numb*2;
            System.out.println("o dobro do seu numero é "+result);
        } while (numb != 0);


        System.out.println("Os dobro dos números são: "+result);
        sc.close();
    }
}
