
public class ListaDinChar implements IlistaDinChar{
    
    private No inicio;
    private int size;
    
    public ListaDinChar(){
        inicio = null;
        size = 0;
    }

    @Override
    public void insirirNoInicio(char valor) {
        No novoNo = new No(valor);
        
        if(isEmpty())
            inicio.next = inicio = novoNo; //inicio e prox aponta para o mesmo item
        else{
            novoNo.next = inicio; //o prox do novo item aponta para o antigo inicio
            inicio = novoNo; // inicio agora aponta para o novo item
        }
        size++;    
    }

    @Override
    public void inseirirNoFim(char valor) {
        No novoNo = new No (valor);
        
        if(isEmpty()){
            inicio = novoNo; //inicio aponta para o 1° item
        }
        else{
            No aux = inicio;//No aux para não perder as referencias
            
            while(true){  
               if(aux.next == null){ // se o penultimo for nulo
                   aux.next = novoNo; //adciona o item
                    break; // para...senão da looping infinito
               }
                   
                aux = aux.next; // aux atualiza para o proximo item
            }
        }
        size++;
    }


    @Override
    public char removerNoFim() {
        if(isEmpty())
            return '\0';
        else{
            char ret = '\0';
            if(inicio.next == null){
                ret = inicio.dado;
                inicio = null;
            }  else{
                    No aux = inicio;//No aux para não perder as referencias
                    No anterior = null;     
                    while(true){ 
                        if(aux.next == null){ // se o penultimo for nulo
                            ret = aux.dado; // coleta o dado
                            anterior.next = null; //remove o item
                            break; // para...senão da looping infinito
                        }
                        anterior = aux;
                        aux = aux.next; //atualiza o aux
                    }  
                }   
            return ret;  
        } 
    }

    @Override
    public char substituir(char referencia, char valor) {
        if(isEmpty())
            return '\0';
        else{
            char ret = '\0';
            No aux = inicio;
            while(aux != null){
                
                if(aux.dado == referencia){
                    ret =  aux.dado;
                    aux.dado = valor;
                }    
                aux = aux.next; 
            }
            return ret;
        }
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public char remover(char referencia) {
        if (isEmpty())
            return '\0';
        else{
            char ret = '\0';
            if (inicio.dado == referencia){
                ret = inicio.dado;
                inicio = inicio.next;
            }
            else{
                No aux = inicio;
                No anterior = null;
                while(aux != null){
                    
                    if(aux.dado == referencia){
                        ret = aux.dado;
                        anterior.next = aux.next;
                    }
                    anterior = aux;    
                    aux = aux.next;
                }
            }
            return ret;
        }        
    }

    @Override
    public String mostrar() {
        if(isEmpty())
            return "Lista vazia! ";
        else{
            No aux = inicio; // No aux para não perder as referencias
            String saida = "";
            
            while(aux != null){
                saida += aux.dado + " . ";
                aux = aux.next; // aux atualiza para o proximo item
            }
            return saida;
        }
    }
    
    
}
