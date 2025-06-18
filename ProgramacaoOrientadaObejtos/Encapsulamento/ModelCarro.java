package Encapsulamento;

public class ModelCarro implements InterCarro,InterRadio {
	
	private boolean ligado;
	private int vol;
	private double estacao;
	private String frequencia;
	private int velocidade;
	private int marchaAtual;
//	private int qtdMarcha;
//	private String posicao;
	

	@Override
	public void volMais() {
		if(ligado == true && vol ==0 && vol<=20) {
			vol++;
		}else {
			System.out.println("Verifique se o r�dio est� ligado e o volume est� abaixo de 20!");
		}
		
	}

	@Override
	public void volMenos() {
		if(ligado == true && vol>0) {
			vol--;
		}else {
			System.out.println("Verifique se o r�dio est� ligado e se o volume est� acima de 0!");
		}
		
	}

	@Override
	public void estacao() {
		this.estacao+=0.10;
		
	}

	@Override
	public void frequencia() {
		if(this.frequencia=="AM")
			this.frequencia="FM";
		else
			this.frequencia="AM";
		
	}

	@Override
	public void ligar() {
		if(this.marchaAtual==0 && this.velocidade==0 && this.ligado==false) {
			System.out.println("Carro est� ligado, pode acelerar se quiser!");
			this.ligado=true;
		}else {
			System.out.println("Verifique se a marcha est� engatada, a velocidade ou se j� est� ligado!");
		}
		
	}

	@Override
	public void desligar() {
		if(this.ligado == true && this.velocidade==0) {
			this.ligado = false;
		}else {
			System.out.println("Verifique se o carro j� est� desligado, ou pare o carro antes, para desligar!");
		}
		
	}

	@Override
	public void acelerar() {
		if(this.ligado==true && this.marchaAtual>0 && this.velocidade<=190) {
			System.out.println("Voc� est� acelerando!");
			this.velocidade+=10;
		}else {
			System.out.println("� necess�rio ligar o carro e engatar a marcha para poder acelerar!");
		}
		
	}

	@Override
	public void frear() {
		if(this.ligado==true && this.velocidade > 0) {
			System.out.println("Voc� est� freiando!");
			this.velocidade-=10;
		}else {
			System.out.println("Verifique se o carro est� ligado ou em movimento para que possa freiar!");
		}
		
	}
	
//	@Override
//	public void trocarMarcha() {
//		if(this.ligado==true && this.marchaAtual==0 && this.posicao=="R") {
//			this.marchaAtual=-1;
//		}else if(this.ligado==true && this.marchaAtual==-1 && this.posicao=="N" && this.velocidade==0) {
//			this.marchaAtual=0;
//		}else if(this.ligado==true && this.marchaAtual==0 && this.posicao=="D" && this.velocidade) {
//			
//		}
//	}

	public boolean getLigado() {
		return ligado;
	}

	public int getVol() {
		return vol;
	}

	public double getEstacao() {
		return estacao;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	
}


// 1� criar interface para o objeto e implementar na classe;
// 2� criar atribuitos para o objeto;
// 3� adicionar a��o aos m�todos da interface;
// 4� Criar os getter e setters;
// 5� Instanciar o objeto;
// 6� Imprimir estado atual do objeto instanciado
// 7� Acrescentar valores ao objeto
// 8� Imprimir novo estado do objeto
