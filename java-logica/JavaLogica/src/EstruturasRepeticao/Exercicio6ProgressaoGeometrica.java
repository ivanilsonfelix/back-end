package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio6ProgressaoGeometrica {

	public static void main(String[] args) {
		int init,raz,fim;
		
		System.out.println("Digite o n�mero para a progress�o:");
		Scanner ler = new Scanner(System.in);
		init = ler.nextInt();
		System.out.println("Digite o n�mero para a finaliza��o da progress�o:");
		fim = ler.nextInt();
		System.out.println("Digite o n�mero para a raz�o:");
		raz = ler.nextInt();
		
		for(int x=init; x<=fim; x*=raz/*x=x*raz*/) {
			System.out.println(x);
		}
	}
}