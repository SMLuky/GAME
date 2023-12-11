package view;

public class OutputMovimentacao {
	public void impossivelMovimentarEsquerda(){
		System.out.println("Movimento para a esquerda não é possível. Limite do terreno alcançado ou posição adjacente ocupada.");
	}
		
	public void impossivelMovimentarDireita(){
		System.out.println("Movimento para a direita não é possível. Limite do terreno alcançado ou posição adjacente ocupada.");
	}
	
	public void impossivelMovimentarBaixo(){
		System.out.println("Movimento para baixo não é possível. Limite do terreno alcançado ou posição adjacente ocupada.");
	}
	
	public void impossivelMovimentarCima(){
		System.out.println("Movimento para cima não é possível. Limite do terreno alcançado ou posição adjacente ocupada.");
	}
	
	public void movimentouDireita() {
		System.out.println("Robô movido para a direita.");
	}
	
	public void movimentouEsquerda() {
		System.out.println("Robô movido para a esquerda.");
	}
	
	public void movimentouBaixo() {
		System.out.println("Robô movido para baixo.");
	}
	
	public void movimentouCima() {
		System.out.println("Robô movido para cima.");
	}
	
	public void permaneceNoLugar() {
		System.out.println("Robô permanece no lugar.");
	}
	
	public void movimentoInvalido() {
		System.out.println("Movimento invalido. Tente novamente.");
	}
	
	public void posicaoDesejada() {
		System.out.print("Digite a direção desejada (R - Direita, L - Esquerda, U - Cima, D - Baixo, M - Manter): ");
	}
}

