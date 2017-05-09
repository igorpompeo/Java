
public class ListaCircular implements IlistaCircular{
    
    public class No{
        public No prox; // próximo nó na lista
        public String valor; // elemento (valor) armazenado na lista 
        
        public No (String val){ //construtor do nó da lista
            valor = val; 
            prox = null;
        }
        
       
        public String exibe(){
            return "Valor: " + valor;
        }
    }
    
    public No fim; //atributo que representa o início da lista
    private int size; // tamanho da lista circular
    
    public ListaCircular(){   // construtor da lista
        fim = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty(){
        return fim == null;
    }

    @Override
    public String search( String elem){
        if(isEmpty())
            return "não foi possivel buscar: Lista vazia! ";
        
        No nodo = fim.prox;
        for(int i = 0; i < size; i++){
            if (elem.equalsIgnoreCase(nodo.valor)) 
                return nodo.valor; //encontrou o elemento
            
            nodo = nodo.prox;
        }
        return "Não encontrado na lista!"; // não encontrou o elemento
    }

    @Override
    public void insereInicio(String elem){ //insere no início da lista
        No novoNo = new No(elem);
     
        if(isEmpty()) // lista vazia
             fim = novoNo; // o fim e o início da lista são o novo nó.
        else // a lista já possui elementos
            novoNo.prox = fim.prox; // o novo nó aponta para o antigo início
     
        fim.prox = novoNo; // o nó final aponta para o novo início
        
        size++;
    }
    
    @Override
    public String removeInicio(){ //elimina o primeiro item da lista
        No del;

        if(isEmpty())
            return "Não foi possilvel remover: Lista Vazia!";
        
        del = fim.prox; // del aponta para o primeiro elemento
     
        if(del == fim) {// a lista só tem um elemento
            fim = null;
            return del.valor;
        }
        else
            fim.prox = del.prox; // atualiza o início da lista
     
        size--;
        return del.valor;
    }
    
    @Override
    public String mostrar(){
        if(isEmpty()) 
            return "Lista vazia\n"; //teste de lista vazia
        
        String str = "Lista Encadeada: ";
        No nodo = fim.prox;
        
        for (int i=0; i < size; i++){
            str+= " "+ nodo.valor;
            nodo = nodo.prox;
        }
        return str + "\n";
    }
    
}
