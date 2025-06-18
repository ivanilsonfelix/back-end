package Encapsulamento;

// class ModeloTelogio est� implementando a interface InterRelogio
public class ModeloRelogio implements InterRelogio{
//	Atributos do modelo
	private int hora;
	private int minuto;
	private boolean despertador;
	
	@Override
	public void ajustarHora(int h) {
		if(h>=0 && h<=23)
			this.hora=h;
		else
			System.out.println("Erro! Hora inv�lida!");
	}
	@Override
	public void ajustarMin(int m) {
		if(m>=0 && m<=59)
			this.minuto=m;
		else
			System.out.println("Erro! Minutos inv�lidos!");
		
	}
	@Override
	public void despertar() {
		if(this.despertador==true) {
			this.despertador=false;
		}else {
			this.despertador=true;
		}
		
	}
	
//	M�todo get, pois n�o ser� necess�rio o usuario alterar as informa��es dos m�todos j� passadas.
	
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public boolean getDespertador() {
		return despertador;
	}
	
	
}
