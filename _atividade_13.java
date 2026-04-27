package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb, plus, media;
        int count;

        count = 0;
        plus = 0;
      
        System.out.println("Digite números, (digite 0 para sair do programa)");

        do {
            numb = sc.nextInt();
            plus = plus + numb;
            count = count + 1;
        } while (numb != 0);

        if (count > 0) {
            media = plus / count;
            System.out.println("Foram digitados "+count+" números!");
            System.out.println("O resultado da soma dos números é "+plus);
            System.out.println("O resultado da média dos números é: "+media);
        } else {
            System.out.println("Nenhum número além do zero foi digitado.");
        }
        sc.close();
    }
}
