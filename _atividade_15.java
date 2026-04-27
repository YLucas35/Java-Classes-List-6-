package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("digite sua senha");

        do {
            senha = sc.nextInt();
            System.out.println("digite sua senha novamente");
        }while (senha != 1234);

        System.out.println("bem vindo admin!");
        sc.close();
    }
}
