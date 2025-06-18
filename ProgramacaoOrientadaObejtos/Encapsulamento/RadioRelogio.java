package Encapsulamento;

import java.util.Scanner;

public class RadioRelogio {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
//		5� Instanciar o objeto
//		nomeDaClasseDoModelo + nomeDoObjeto = new + MetodoConstrutor(Mesmo nomeDaClasse)
		ModeloRadioRelogio rr = new ModeloRadioRelogio();
		
//		6� Imprimindo estado inicial do objeto
		System.out.println("\tEstado inicial do Radio Relogio");
		System.out.println("Esta ligado? " + rr.getLigado());
		System.out.println("Volume atual: "+ rr.getVol());
		System.out.println("Esta��o atual: "+ rr.getEstacao());
		System.out.println("Frequencia atual: "+ rr.getFrequencia());
		System.out.println("Hora atual: "+ rr.getHora()+ ":" + rr.getMin());
		System.out.println("Despertador: "+rr.getDespertador());
		
//	7� Adicionando valores ao objeto
		rr.ligar();
		System.out.println("\n\nAtualize as horas: ");
		rr.ajustarHora(ler.nextInt());
		System.out.println("\n\nAtualize os minutos: ");
		rr.ajustarMin(ler.nextInt());
		rr.volMais();
		rr.estacao();
		rr.frequencia();
		
//	8� Impriminto novo estado do rel�gio
		System.out.println("\tEstado atual do Radio Rel�gio");
		System.out.println("Esta ligado? " + rr.getLigado());
		System.out.println("Volume atual: "+ rr.getVol());
		System.out.println("Esta��o atual: "+ rr.getEstacao());
		System.out.println("Frequencia atual: "+ rr.getFrequencia());
		System.out.println("Hora atual: "+ rr.getHora()+ ":" + rr.getMin());
		System.out.println("Despertador: "+rr.getDespertador());
		
	}
	

}
