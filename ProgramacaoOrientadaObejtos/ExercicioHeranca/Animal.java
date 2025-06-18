package ExercicioHeranca;

public abstract class Animal {
	private String nome;
	private String sexo;
	private String cor;
	protected int idade;
	private int peso;
	protected double altura;
	private String locomo��o;
	
	
	public void aniversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLocomo��o() {
		return locomo��o;
	}

	public void setLocomo��o(String locomo��o) {
		this.locomo��o = locomo��o;
	}
	
}
