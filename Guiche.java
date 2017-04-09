
public class Guiche {
    private int tempoOperando;
    private int saquesAtendidos;
    private int depositosAtendidos;
    private int pagamentosAtendidos;
    
    public Guiche(){
    this.tempoOperando = 0;
    this.saquesAtendidos = 0;
    this.depositosAtendidos = 0;
    this.pagamentosAtendidos = 0;
    }

    public int getSaquesAtendidos() {
        return saquesAtendidos;
    }

    public int getDepositosAtendidos() {
        return depositosAtendidos;
    }
    
    public int getPagamentosAtendidos() {
        return pagamentosAtendidos;
    }
    
    public int getTempoOperando() {
        return tempoOperando;
    }
    public void operando(){
        if (this.tempoOperando > 0)
        this.tempoOperando--;
    }
    
    public void setCodTransicao(int t){
        if(t == 0){
            this.tempoOperando = 60;
            this.saquesAtendidos++;
        }    
        if(t == 1){
            this.tempoOperando = 90;
            this.depositosAtendidos++;
        }
        if(t == 2){
            this.tempoOperando = 120;
            this.pagamentosAtendidos++;
        }
    }
    public boolean isFree(){
        return this.tempoOperando == 0;
    }
    
    @Override
    public String toString(){
        return "Saques atendidos: " + saquesAtendidos + "\nDepositos "
                + "atendidos: " + depositosAtendidos + "\nPagamentos "
                + "atendidos: " + pagamentosAtendidos;
    }
}
