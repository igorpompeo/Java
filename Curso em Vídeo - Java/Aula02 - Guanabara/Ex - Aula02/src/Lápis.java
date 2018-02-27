
public class Lápis {
	String modelo,cor;
	float grafite;
	boolean ponta;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Grafite: "+this.grafite);
		System.out.println("Está apontado: "+this.ponta);
	}
	
	void escrever() {
		if(this.ponta == false) {
			System.out.println("Erro, não tenho ponta!");
		} else {
			System.out.println("Escrevendo...");
		}
	}
	
	void apontar() {
		if(this.ponta == true) {
			System.out.println("Não posso apontar, você já tem ponta!");
		} else {
			System.out.println("Apontando...");
		}
	}
	
}
