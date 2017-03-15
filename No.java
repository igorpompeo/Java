
public class No {
   public  int dado;
   public  No next;
   
   No(int dd){
       this.dado = dd;
       this.next = null;
   }
   
   public void mostrar(){
       System.out.println("Dado = " + this.dado + "\nNext = " + this.next);
   }
   
}