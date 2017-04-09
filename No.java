
public class No {
    private Cliente dado;
    private No next;
    
    public No(Cliente dado){
        this.dado = dado;
        this. next = null;
    }
    
     public void setNext(No next) {
        this.next = next;
    }

    public void setDado(Cliente dado) {
        this.dado = dado;
    }

    public No getNext() {
        return next;
    }

    public Cliente getDado() {
        return dado;
    }
       
}
