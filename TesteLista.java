
public class TesteLista {
    public static void main(String[] args) {
        ListaChar lista = new ListaChar(6);
        
        lista.inserir('t');
        lista.inserir('h');
        lista.inserir('i');
        lista.inserir('a');
        lista.inserir('g');
        
        System.out.println("Removido: " + lista.remover(4));
        System.out.println("Removido: " + lista.remover(3));
        System.out.println("Removido: " + lista.remover(2));
        System.out.println("Removido: " + lista.remover(1));
        
        
        System.out.println("Substituido: " + lista.substituir('Z', 0));
        lista.inserir('W');
       
        System.out.println("\nVazio? : " + lista.listaVazia());
        System.out.println("Cheia? : " + lista.listaCheia());
        
        System.out.println("Lista:\n" + lista.mostrar());
    }
}
