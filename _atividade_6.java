package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, maior, menor;

        System.out.println("Digite números e eu mostrarei qual é o maior e o menor entre eles. (até você digitar 0):");
        numb = sc.nextInt();
        
        maior = numb;
        menor = numb;

        if (numb != 0) {
            do {
                numb = sc.nextInt();
                if (numb != 0) {
                    if (numb > maior) {
                        maior = numb;
                    }

                    if (numb < menor) {
                        menor = numb;
                    }
                }
            } while (numb != 0);
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        sc.close();
    }
}
