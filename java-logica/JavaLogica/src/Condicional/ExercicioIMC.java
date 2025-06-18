package Condicional;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
		double peso;
		double altura;
				
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Digite sua altura: ");
		altura = ler.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu imc � : " + imc + ".");
		
		if (imc < 17 || imc == 17) {
			System.out.println("Voc� est� muito abaixo do peso!");
		} else if (imc > 17 && imc < 18.5){
			System.out.println("Voc� est� abaixo do peso!");
		} else if (imc > 18.5 && imc < 25) {
			System.out.println("Parab�ns! Voc� est� no peso ideal!");
		} else if (imc > 25 && imc < 30) {
			System.out.println("Voc� est� acima do peso!");
		} else if (imc > 30 && imc < 35) {
			System.out.println("Voc� est� com obesidade 1� Grau!");
		} else if (imc > 35 && imc < 40) {
			System.out.println("Voc� est� com obesidade 2� Grau! (Severa)");
		} else {
			System.out.println("Voc� est� com obesidade 3� Grau! (M�rbida)");
		}

	}

}
