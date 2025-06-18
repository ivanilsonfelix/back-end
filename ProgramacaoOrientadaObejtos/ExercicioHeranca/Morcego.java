package ExercicioHeranca;

public class Morcego extends Mamiferos{
	private String especie;
	private String dieta;
	private boolean ecolocalizacao;
	
	
	public void voar() {
		if(this.ecolocalizacao==true) {
			System.out.println("Morcego est� voando...");
		}else {
			System.out.println("Morcego n�o obteve retorno na ecolocaliza��o...");
		}
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getDieta() {
		return dieta;
	}


	public void setDieta(String dieta) {
		this.dieta = dieta;
	}


	public boolean getEcolocalizacao() {
		return ecolocalizacao;
	}


	public void setEcolocalizacao(boolean ecolocalizacao) {
		this.ecolocalizacao = ecolocalizacao;
	}
	
	
}
