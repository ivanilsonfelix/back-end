package Polimorfismo;

public class ExemploSobrecarga {
	private double n1;
	
	public void soma() {
		this.n1=3;
		System.out.println("A soma �: "+(n1+12));
	}
	
	public void soma(int x) {
		this.n1=3;
		System.out.println("A soma �: "+(n1+x));
	}
	
	public void soma(int x,double y) {
		this.n1=y;
		System.out.println("A soma �: "+(n1+x));
	}
	
	public void soma(int x,int y) {
		this.n1=y;
		System.out.println("A soma �: "+(n1+x));
	}
	
	public void soma(double y, int x) {
		this.n1=y;
		System.out.println("A soma �: "+(n1+x));
	}
}

// H� v�rios m�todos com o mesmo nome "Soma" na mesma classe, e s� foi possivel ser criada pelo fato das assinaturas serem diferentes
