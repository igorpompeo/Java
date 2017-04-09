
public class FilaDinamica {
    private No inicio,fim;
    private int qtd;
    
    public FilaDinamica(){
        inicio = null;
        fim = null;
        qtd = 0;
    }
    
    public boolean isEmpty(){
        return (inicio == null);
    }
    
    public void enqueue(Cliente c){
        No novoNo = new No(c);
        
        if(isEmpty()){
            inicio = novoNo;
            fim = inicio;
        }
        else{
            fim.setNext(novoNo);
            fim = novoNo;
        }
        qtd++;
    }
    
    public Cliente dequeue(){
        if(isEmpty()){
            fim = null;
            return null;
        }
        No retorno = inicio;
        inicio = inicio.getNext();
        
        qtd--;
        return retorno.getDado();
    }
    
    public int retornaQtdDaFila(){
        return this.qtd;
    }
    
    @Override
    public String toString(){
      String retorno = "";
      if(isEmpty())
          retorno += "Fila Vazia";
      else{
          No atual = inicio;
          
          while(atual != null){
            retorno += atual.getDado().toString() + "\n\n";
            atual = atual.getNext();
          }
      }
      return retorno;
    }
}
