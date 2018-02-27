/*aula do curso em vídeo, para voltar a prática em java
 * na aula será desenvolvida uma classe chamada caneta*/
public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.modelo = "BIC";
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.modelo = "FaberCastel";
		c2.carga = 100;
		c2.ponta = 0.7f;
		
		c2.destampar();
		c2.rabiscar();
		c2.status();
	}
}
