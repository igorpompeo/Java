
public class ListaChar implements IListaChar{
    private char lista [];
    private int primeiro,ultimo,qtd;
    
    ListaChar(int tamanho){
        lista = new char[tamanho];
        primeiro = ultimo = -1;
        qtd = 0;
    }

    @Override
    public boolean inserir(char valor) {
        if(!listaCheia()){
            if(listaVazia()){
                lista[primeiro = ultimo = 0] = valor;
                qtd++;
            }
            else{
                lista[++ultimo] = valor;
                qtd++;
            }
            return true;
        }
        else{
            System.out.println("Lista Cheia!");
            return false;
        }
            
    }

    @Override
    public char remover(int indice) {
        char temp = '\0';
        
        if(!listaVazia()){
            if(indice < qtd){
            temp =  lista[indice];
            reorganizar(indice);
            qtd--;
            }
            else{
                System.out.println("posição não existe!");
            }
        }
        else{
            System.out.println("Lista Vazia!");
        }
        return temp;
    }

    @Override
    public char substituir(char valor, int posicao) {
       char temp = '\0';
        if(!listaVazia()){
            if(posicao < qtd){
                temp = lista[posicao];
                lista[posicao] = valor;
            }
            else{
                System.out.println("posição não existe!");
            }   
        }
        else{
            System.out.println("lista Vazia!");
        }
        return temp;
    }

    @Override
    public int tamanho() {
        return lista.length;
    }

    @Override
    public boolean listaVazia() {
        return qtd == 0;    
    }

    @Override
    public boolean listaCheia() {
        return lista.length == qtd;
    }
    
    public String mostrar(){
        String lista = "";
        if(listaVazia())
            lista += "Lista Vazia!";
        else
            for(int i = 0; i < qtd; i++)
                lista += this.lista[i] + "\n";
        return lista;
    }
    
    void reorganizar(int indice){
        for (int i = indice; i < qtd-1; i++)
            lista[i] = lista[i+1];
        ultimo--;
    }
    
}
