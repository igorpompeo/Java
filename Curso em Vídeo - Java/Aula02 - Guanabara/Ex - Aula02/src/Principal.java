
public class Principal {
	public static void main (String[] args) {
		//declarando objeto
		L�pis l1 = new L�pis();
		//atribuindo valores
		l1.modelo = "De cor";
		l1.cor = "Azul";
		l1.grafite = 0.7f;
		l1.ponta = true;
		//chamando met�dos
		l1.status();
		l1.escrever();
	}
}
