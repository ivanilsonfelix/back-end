package Encapsulamento;

// 1� implementar a interface
public class ModeloRadioRelogio implements InterRelogio, InterRadio{
//	2� cria��o dos atributos
	private int vol;
	private int hora;
	private int min;
	private boolean ligado;
	private double estacao;
	private String frequencia;
	private boolean despertador;
	
//	3� Adicionar m�todos para a interface implementada
	
// interface implementada do 1� passo
	
	@Override
	public void ajustarHora(int h) {
		if(this.ligado==false||h<0 || h>23)
			System.out.println("Erro! Verifique se o relogio est� ligado e se a hora est� correta");
		else
			this.hora=h;
		
	}

	@Override
	public void ajustarMin(int m) {
		if(this.ligado==false||m<00 || m>59)
			System.out.println("Erro! Verifique se o relogio est� ligado, e se o valor para minutos est� correto!");
		else
			this.min=m;
			
		
	}

	@Override
	public void despertar() {
		if(this.despertador==true) {
			this.despertador=false;
		}else {
			this.despertador=true;
		}
		
	}

	@Override
	public void ligar() {
		if(this.ligado==false)
			this.ligado=true;
		else
			System.out.println("Erro! R�dio j� est� ligado!");
		
	}

	@Override
	public void desligar() {
		if(this.ligado==false)
			System.out.println("Erro! R�dio j� est� desligado!");
		else
			this.ligado=false;
		
	}

	@Override
	public void volMais() {
		if(this.ligado==false||vol<=100)
			System.out.println("Erro! Verifique o volume e se o r�dio j� esta ligado!");
		else
			this.vol++;
	}

	@Override
	public void volMenos() {
		if(this.ligado==false||this.vol<=0)
			System.out.println("Erro! Verifique o volume e se o r�dio j� esta desligado");
		else
			this.vol--;
		
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
	
//	4� Criando o getters e setters

	public int getVol() {
		return vol;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public boolean getLigado() {
		return ligado;
	}

	public double getEstacao() {
		return estacao;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public boolean getDespertador() {
		return despertador;
	}
	
//	4� Instanciar o objeto
	
}
