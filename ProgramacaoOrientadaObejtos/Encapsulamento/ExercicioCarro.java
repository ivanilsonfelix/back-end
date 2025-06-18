package Encapsulamento;

public class ExercicioCarro {

	public static void main(String[] args) {
//		nomeDaClasseDoModelo + nomeDoObjeto = new + MetodoConstrutor(Mesmo nomeDaClasse)
		ModelCarro fiesta = new ModelCarro();
		
//		6� Imprimindo estado inicial do objeto
		System.out.println("\tEstado inicial do Carro");
		System.out.println("Esta ligado? " + fiesta.getLigado());
		System.out.println("Volume atual: "+ fiesta.getVol());
		System.out.println("Esta��o atual: "+ fiesta.getEstacao());
		System.out.println("Frequencia atual: "+ fiesta.getFrequencia());
		System.out.println("Velocidade atual: "+ fiesta.getVelocidade()+" Km/h");
				
//	7� Adicionando valores ao objeto
		fiesta.ligar();
		fiesta.volMais();
		fiesta.estacao();
		fiesta.frequencia();
		fiesta.acelerar();
		
//		7� Imprimindo estado atual do objeto
		System.out.println("\tEstado atual do Carro");
		System.out.println("Esta ligado? " + fiesta.getLigado());
		System.out.println("Volume atual: "+ fiesta.getVol());
		System.out.println("Esta��o atual: "+ fiesta.getEstacao());
		System.out.println("Frequencia atual: "+ fiesta.getFrequencia());
		System.out.println("Velocidade atual: "+ fiesta.getVelocidade()+" Km/h");

	}

}
