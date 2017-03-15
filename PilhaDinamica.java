
public class PilhaDinamica {
    private No topo;
    
    PilhaDinamica(){
        this.topo = null; //Pilha Vazia
    }
    public boolean isEmpty(){
        return topo == null;
    }
    
    public void push (int dd){
            No no = new No(dd);
        if (isEmpty())
            topo = no;
        else
            no.next = topo; 
    }
    
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            No noAux = topo;
            topo = topo.next; // Alterando endereço de memoria
            //topo = noAux.next;
            return noAux.dado;
        }
    }
    
    public void display(){
        do{
            topo.mostrar();
        }while(topo.next == null);
    }
    
}
