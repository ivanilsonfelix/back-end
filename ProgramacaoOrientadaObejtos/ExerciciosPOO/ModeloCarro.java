package ExerciciosPOO;

public class ModeloCarro {
//	Atributos
	String cor;
	int portas;
	String carroceria;
	double kmRodado;
	boolean movimento;
	boolean som;
	boolean ligado;
	
	
//	M�todo construtor
	public void ModeloCarro(){
		this.carroceria="Sedan";
		this.portas=4;
		
	}
	
//	Metodo movimento
	public void movimento() {
		if(movimento == true) {
			System.out.println("Carro esta em movimento");
		}else {
			System.out.println("Carro est� parado");
			this.movimento=false;
		}

	}
	
//	metodo tocando
	
	public void tocando() {
		if(som == true) {
			System.out.println("Carro est� tocando...");
		}else {
			System.out.println("Carro est� silenciado");
			this.som=false;
		}
	}
	
//	Metodo Ligar
	public void ligar() {
		this.ligado=true;
	}
	
//	metodo desligar
	public void desligar() {
		this.ligado=false;
	}

//	Metodo estado
	public void estado() {
		System.out.println("Cor: "+ this.cor);
		System.out.println("Portas: "+this.portas);
		System.out.println("Carroceria: "+this.carroceria);
		System.out.println("Km rodados: "+this.kmRodado);
		System.out.println("Carro esta em movimento? " + this.movimento);
		System.out.println("Carro est� emitindo som? "+this.som);
		System.out.println("Carro est� ligado? "+this.ligado);
	}
}
