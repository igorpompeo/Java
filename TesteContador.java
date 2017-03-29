/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class TesteContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador cont = new Contador();
        
        System.out.println(cont.Retorna());
        cont.Incrementar();
        cont.Incrementar();
        cont.Incrementar();
        cont.Incrementar();
        System.out.println(cont.Retorna());
        cont.Zerar();
        System.out.println(cont.Retorna());
    }
    
}
