package Matrizes;

import java.util.Scanner;

public class Exercicio2Matrizes {

	public static void main(String[] args) {
//		Crie duas matrizes de 3 por 4 onde o usu�rio ir� preencher
//		a primeira matriz com valores inteiros e a segunda matriz ser� preenchida com
//		os valores da primeira matriz dobrados, no final mostre os valores das duas
//		matrizes
		int mat1[][]=new int [3][4];
		int mat2[][]=new int [3][4];
		Scanner ler=new Scanner(System.in);

//		Alimenta��o da primeira matriz pelo usuario
		for(int linha =0;linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.println("Digite o valor para matriz-> Linha: "+linha +"coluna:"+coluna);
				mat1[linha][coluna]= ler.nextInt();	
			}
		}
		
//		Alimentando a segunda matriz com multiplica��o
		for(int linha = 0; linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				mat2[linha][coluna]=mat1[linha][coluna]*mat1[linha][coluna];
			}
		}
		
//		Impress�o da primeira matriz
		System.out.println("\tPrimeira Matriz");
		for(int linha =0; linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.print(mat1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println();
//		Impress�o da segunda matriz
		System.out.println("\tSegunda Matriz");
		for(int linha =0; linha<3;linha++)
		{
			for(int coluna=0; coluna<4;coluna++)
			{
				System.out.print(mat2[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}

}
