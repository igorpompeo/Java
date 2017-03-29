/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class Porta {
    
    private boolean aberta;
    private String cor;
    private int dimensaoX,dimensaoY,dimensaoZ;
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;
    }
    
    public boolean estaAberta(){
        return aberta;
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public String estaPintada(){
        return cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
}
