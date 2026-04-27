package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota (se a nota estiver entre 0 e 10 a nota será inválida.)");

        do {
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota válida digitada é: "+nota);
        sc.close();
    }
}
