package Condicional;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		int op;
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite 1 - Para Somar \nDigite 2 - Para Subtrair");
		System.out.println("Digite 3 - Para Dividir \nDigite 4 - Para Multiplicar");
		
		op = ler.nextInt();
		
		switch (op) 
		{
			case 1:
				System.out.println("A soma � : "+(10+5));
				break;
			case 2:
				System.out.println("A subtra��o � : "+(10-5));
				break;
			case 3:
				System.out.println("A multiplica��o � : "+(10*5));
				break;
			case 4:
				System.out.println("A divis�o � : "+(10/5));
				break;
		}
	}

}
