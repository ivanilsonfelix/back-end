package Encapsulamento;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
//		Modelo do rel�gio
		ModeloRelogio rolex= new ModeloRelogio();
		int minuto, hora;
		
		
//		Imprimindo o estado atual
		System.out.println("Estado inicial do rel�gio: ");
		System.out.println("Horario atual: "+rolex.getHora()+":"+rolex.getMinuto());
		System.out.println("O despertador est� ativado? "+rolex.getDespertador());
		

//		Adicionando valores ao rel�gio
		System.out.println("\n\nDigite a nova hora: ");
		hora = ler.nextInt();
		
		System.out.println("Digite o valor dos minutos: ");
		minuto= ler.nextInt();
		
		rolex.ajustarHora(hora);
		rolex.ajustarMin(minuto);
		rolex.despertar();
		
//		Imprimindo novo hor�rio
		System.out.println("Estado atual do rel�gio: ");
		System.out.println("Horario atual: "+rolex.getHora()+":"+rolex.getMinuto());
		System.out.println("O despertador est� ativado? "+rolex.getDespertador());
		
	}

}
