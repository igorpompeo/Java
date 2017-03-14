/*
 Elabore um programa contendo uma sub-rotina que
receba as três notas de um aluno como parâmetros e
uma letra. Se a letra for A, a sub-rotina deverá calcular a
média aritmética das notas do aluno; se for P, deverá
calcular a média ponderada, com peso 5, 3 e 2. A média
calculada deverá ser devolvida ao programa principal
para, então, ser mostrada.
 */
package subrotinamedia;

/**
 *
 * @author igor
 */
import java.util.*;
public class SubRotinaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2, n3;
        char escolha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        n2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        n3 = entrada.nextDouble();
        entrada = new Scanner(System.in);
        System.out.println("Escolha qual media quer: A - aritmetica "
                + "/ P ponderada: ");
        escolha = entrada.nextLine().charAt(0);
        
        System.out.println("Sua média é: " + Media(escolha, n1, n2, n3));
    }
    static double Media(char c, double n1, double n2, double n3){
        double media;
        if (c == 'a'){
            return media = (n1 + n2 + n3)/3;
        }else{
            return media = ((n1 * 5) + (n2 * 3) + (n3 * 2))/10;
        }
    }
    
}
