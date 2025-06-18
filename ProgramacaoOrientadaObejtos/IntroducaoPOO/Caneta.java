package IntroducaoPOO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {
//		Para criar um objeto � necess�rio uma sequencia
//		Criar um objeto -> Instanciar um objeto
		
		Scanner ler = new Scanner(System.in);
		double ponta;
		System.out.println("Escolha a espessura da ponta da caneta: ");
		ponta=ler.nextDouble();
		
		
//				METODO CONSTRUTOR
//		M�todo respons�vel pela cria��o de objetos;
//		�nico m�todo que come�a com a letra maiuscula;
//		Seu nome necess�riamente deve ser o mesmo da classe;
//		Se for omitido ir� construir o objeto com valores padr�o;
//		M�todo construtor n�o tem tipo;
		
		
//		Classe nomeObejeto = new MetodoConstrutor()
		ModeloCaneta bic = new ModeloCaneta("azul", ponta);
		ModeloCaneta montblanc = new ModeloCaneta("preta",ponta);
		
		System.out.println("Estado da caneta bic: ");
		bic.destampar();
		bic.destampar();
		bic.estado();
		
		System.out.println();
		
		System.out.println("Estado da caneta montblanc: ");
		montblanc.destampar();
		montblanc.escrever();
		montblanc.estado();

	}

}
