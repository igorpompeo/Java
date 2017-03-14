/*
Crie um programa para retornar o maior valor entre dois
números inteiros.
 */
package subrotinamaior;

/**
 *
 * @author igor
 */
import java.util.*;
public class SubRotinaMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextInt();
        
        System.out.println("O maior número é: " + Verifica(n1, n2));
    }
    static int Verifica(int n, int n1){
        if(n > n1){
            return n;
        }else{
            return n1;
        }
    }
    
}
