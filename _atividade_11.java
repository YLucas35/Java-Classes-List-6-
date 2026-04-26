package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb;
        int loop;

        loop = 0;

        System.out.println("Digite um número e eu aplicarei o um aumento de 5% repetidamente sem parar até esse valor ultrapassar 1000! (E eu mostrarei quantas vezes eu tive q fazer isso também).");
        numb = sc.nextInt();

        do {
            numb = numb * 1.05;
            loop = loop + 1;
        } while (numb <= 1000);

        System.out.println("Resultado da operação: "+numb);
        System.out.println("Repetições necessárias para ultrapassar o valor imposto: "+loop+" vezes!");
    }
}
