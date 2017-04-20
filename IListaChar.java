
public interface IListaChar {
    boolean inserir(char valor);
    char remover(int indice);
    char substituir(char valor, int posicao);
    int tamanho();
    boolean listaVazia();
    boolean listaCheia();
}
