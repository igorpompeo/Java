/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subrotinaboolean;

import java.util.*;

/**
 *
 * @author igor
 */
public class SubRotinaBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //verificar se o valor é positivo ou negativo
        int n1 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        System.out.println("O número é positovo? " + Verifica(n1));
    }

    static boolean Verifica(int n) {
        if (n >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
