
public class L�pis {
	String modelo,cor;
	float grafite;
	boolean ponta;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Grafite: "+this.grafite);
		System.out.println("Est� apontado: "+this.ponta);
	}
	
	void escrever() {
		if(this.ponta == false) {
			System.out.println("Erro, n�o tenho ponta!");
		} else {
			System.out.println("Escrevendo...");
		}
	}
	
	void apontar() {
		if(this.ponta == true) {
			System.out.println("N�o posso apontar, voc� j� tem ponta!");
		} else {
			System.out.println("Apontando...");
		}
	}
	
}
