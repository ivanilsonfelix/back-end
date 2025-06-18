package IntroducaoPOO;

public class ModeloCaneta {
//	CARACTERISTICAS -> ATRIBUTOS
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
//	M�TODO CONSTRUTOR
	public ModeloCaneta(String cor, double ponta) 
	{
		this.carga=100;
		this.tampada=true;
		this.cor=cor;
		this.ponta=ponta;
	}

	
//	COMPORTAMENTOS -> M�TODOS
	public void tampar() 
	{
		if(this.tampada==true)
			System.out.println("Erro...Caneta j� est� destampada!");
		else
			this.tampada=true;
	}
	
	public void destampar()
	{
		if(this.tampada==false)
			System.out.println("Erro...Caneta j� est� tampada!");
		else
			this.tampada=false;
	}
	
	public void estado()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}
	
	public void escrever() 
	{
		if(tampada == true)
			System.out.println("Erro...Caneta tampada");
		else
		{
			System.out.println("Escrevendo...");
			this.carga-=5;
		}
	}
	
	
//	void-> � um m�todo sem retorno, ele executa a fun��o e finaliza
//	interger->retorna numeros inteiros
//	double->retorna numeros decimais
//	String-> retorna string
	
	
}
