package view;

public class OutputJogadas {
	public void roboJogando(int i) {
		System.out.println("Robo [" + i + "] - Jogando\n");
	}
	
	public void roboProspectando(int i) {
		System.out.println("Robo [" + i + "] - Prospectando\n");
	}
	
	public void roboTerminouProspectar(int i) {
		System.out.println("Robo [" + i + "] - Terminou de prospectar\n");
	}
}
