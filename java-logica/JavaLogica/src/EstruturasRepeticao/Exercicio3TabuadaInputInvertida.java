package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio3TabuadaInputInvertida {

	public static void main(String[] args) {
		int x;
		System.out.println("Digite o n�mero que deseja obter a tabuada invertida: ");
		Scanner ler = new Scanner(System.in);
		x = ler.nextInt();
		System.out.println("Tabuada do n�mero " + x + ":");
		
		for(int i = 10; i >=1 ; i--)
			System.out.println(x + " * " + i + " = " + x * i);

	}

}
