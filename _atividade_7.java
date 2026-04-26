public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, plus;
        
        count = 1;
        plus = 0;

        do {
            System.out.print("Digite o "+count+" número: ");
            int numb = sc.nextInt();

            if (numb > 50) {
                plus = plus + numb;
            }

            count = count + 1;
        } while (count <= 8);

        System.out.println("A soma dos valores maiores que 50 é: "+plus);

        sc.close();
    }
}
