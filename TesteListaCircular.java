
public class TesteListaCircular {
    public static void main(String[] args) {
        
        ListaCircular lista = new ListaCircular();
        
       
        
       
        System.out.println("Removido : " + lista.removeInicio());
        System.out.println("Removido : " + lista.removeInicio());
        
        
        System.out.println("Buscando... "+ lista.search("renato"));
         
        System.out.println("Lista vazia? " + lista.isEmpty());
        System.out.println("Removido : " + lista.removeInicio());
        
        //System.out.println(lista.mostrar());
        
        lista.insereInicio("Thiago");
       
        
        
      //  System.out.println("Listando.... " + lista.mostrar());
        
        System.out.println("\nvalor do primeiro item: \n" + lista.fim);
    }
    
}
