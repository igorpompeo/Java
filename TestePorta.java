/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class TestePorta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porta teste = new Porta();
        
        teste.setDimensaoX(2);
        teste.setDimensaoY(3);
        teste.setDimensaoZ(5);
        
        System.out.println(teste.estaAberta());
        System.out.println(teste.getDimensaoX()+"\n"
                +teste.getDimensaoY()+"\n"+
                teste.getDimensaoZ());
        String cor = "Preto";
        teste.pinta(cor);
        teste.abre();
        System.out.println(teste.estaAberta());
        teste.fecha();
        System.out.println(teste.estaAberta());
        System.out.println(teste.estaPintada());
    }
    
}
