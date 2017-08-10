import java.util.Scanner;

public class processoIterativo {

    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        numero = scan.nextInt();
        System.out.println("Soma: " + somar(numero));
    }

    public static int somar(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma = i + soma;
        }
        return soma;
    }
    public static int somaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }
}
