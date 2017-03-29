/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class Contador {
    private int cont;
    
    public void Zerar(){
        this.cont = 0;
    }
    
    public void Incrementar(){
        this.cont++;
    }
    
    public int Retorna(){
        return cont;
    }
}
