package Heranca;

//Abstract pode ser utilizado para identificar a classe "M�E", a classe abstrata pode ser usada em interface e na classe -> n�o gera objeto pois n�o possui m�todo construtor;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public void aniversario() 
	{
		this.idade++;
	}
	
//	Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
