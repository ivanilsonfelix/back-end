package Condicional;

import java.util.Scanner;

public class Exercicio2IfElse {

	public static void main(String[] args) {
		int n;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		n = ler.nextInt();
		
//		if(n != n%2)
		if(n % 2 == 0)
			System.out.println("O n�mero � Par");
		else
			System.out.println("O n�mero � Impar");

	}

}

// n % 2 == 0
