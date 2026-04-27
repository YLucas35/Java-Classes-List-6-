package Java_Lista_6_Faca_Enquanto;

import java.util.Scanner;

public class _atividade_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price, total;

        total = 0;

        System.out.println("Digite o valor do produto em numeros decimais e então eu irei ler em reais: (para fechar o programa, digite 0)");

        do {
            price = sc.nextDouble();
            total = total + price;
        } while (price != 0);

        System.out.printf("O valor total da sua compra foi de: R$%.2f%n", total);

        total = (total > 500.0) ? total * 0.90 : total;

        System.out.printf("O valor final a pagar (com possíveis descontos) é: R$%.2f%n", total);
        System.out.println("Nota: Compras acima de R$ 500,00 recebem 10% de desconto automáticamente.");
    }
}
