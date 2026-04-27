package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota, count;

        count = 0;

        System.out.println("Digite uma nota (se a nota for 0 ou maior do que 10 eu encerrei o programa)");

        do {
            nota = sc.nextInt();
            count = count + 1;
        } while (nota > 0 && nota < 10);

        System.out.println("A sua nota é: "+nota);
        sc.close();
    }
}

