package ExercicioHeranca;

public class Mamiferos extends Animal{
//	terrestre; aquatico; voador
	private String habitat;
	private boolean pelagem;
	private String alimenta��o;
	
	
	public void crescer(int idade) 
	{
		
		for(int i = 0; i<idade; i++) {
			this.altura+=0.5;
		}
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public boolean getPelagem() {
		return pelagem;
	}


	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}

	
}
