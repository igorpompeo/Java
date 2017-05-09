
public class TesteListaChar {
    public static void main(String[] args) {
        ListaDinChar lista = new ListaDinChar();
        
        lista.inseirirNoFim('a');
        lista.inseirirNoFim('b');
        lista.inseirirNoFim('c');
        lista.inseirirNoFim('d');
        
        System.out.println("lista vazia? " + lista.isEmpty());
        
        System.out.println("removido: "+ lista.remover('a'));
        System.out.println("removido: "+ lista.remover('c'));
        
        System.out.println("\nDados: " + lista.mostrar());
        
        System.out.println("\nSubstituido o: " + lista.substituir('b', 'Z'));
        System.out.println("Substituido o: " + lista.substituir('d', 'X'));
        
        System.out.println("\nDados: " + lista.mostrar());
        
        System.out.println("\nSubstituido o: " + lista.substituir('k', 'M'));
        
         System.out.println("\nDados: " + lista.mostrar());
    }
   
}
