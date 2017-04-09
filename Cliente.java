
public class Cliente {
   private int codTransicao;
   private int tempoDeChegada;
   private int tempoDeSaida;
   
   public Cliente (int codTransicao, int tempoDeChegada){
       this.codTransicao = codTransicao;
       this.tempoDeChegada = tempoDeChegada;
       this.tempoDeSaida = 0;
   }
   
   public int getCodTransicao(){
       return this.codTransicao;
   }
           
   public void setTempoDeSaida(int tempoDeSaida){
       this.tempoDeSaida = tempoDeSaida;
   }
   
   public int getTempoDeSaida(){
       return this.tempoDeSaida;
   }
   
   public int retornaTempoDeEspera(){
       return this.tempoDeChegada - this.tempoDeSaida;
   }
   
   @Override
   public String toString(){
       return "Operação: " + codTransicao + "\nTempo de espera: "
               + retornaTempoDeEspera();
   }  
}
