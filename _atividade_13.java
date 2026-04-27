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
            count =count + 1;
            media = (numb + count) / 2.0;
            plus = plus + numb;
        } while (numb != 0);
        
        System.out.println("Foram digitados "+count+" números!");
        System.out.println("o resultado da soma dos números é "+plus);
        System.out.println("o resultado da média dos resultados é: "+media);
        sc.close();
    }
}
