package model;

public class Robo {
    private double tanqueH3;
    private int x;
    private int y;
    private boolean isProspectando;
    private int tempoProspectando;
    private int tipo; // tipo dos robos
    private int id;
	private Equipe equipe;
    
    public Robo(double tanqueH3, int x, int y) {
        this.tanqueH3 = tanqueH3;
        this.x = x;
        this.y = y;
        this.setProspectando(false);
        this.tempoProspectando = 0;
        this.id = id;
        this.equipe = equipe;
    }

    public double getTanqueH3() {
        return tanqueH3;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setTanqueH3(double tanqueH3) {
        this.tanqueH3 = tanqueH3;
    }

    public void setPosicao(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    
    public boolean isProspectando() {
    	return isProspectando;
    }
    
    public void setProspectando(boolean isProspectando) {
    	this.isProspectando = isProspectando;
    }
    
    public int getTempoProspectando() {
    	return tempoProspectando;
    }
    
    public void setTempoProspectando(int tempoProspectando) {
    	this.tempoProspectando = tempoProspectando;
    }
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    // metodo pra mover pra casa adjacente
    public void capturarHelio3(Celula celula) {
        double quantidadeCapturada = celula.getConcentracaoH3();
       
        tanqueH3 += quantidadeCapturada;
        
        celula.setConcentracaoH3(0.0);
    }
    
    public boolean verificarPosicaoAdjacenteOcupada(int x, int y, Terreno terreno) {
        // Verifica se a posição à direita está ocupada
        if (x + 1 < terreno.getLargura() && terreno.getCelula(x + 1, y).isOcupada()) {
            return true;
        }

        // Verifica se a posição à esquerda está ocupada
        if (x - 1 >= 0 && terreno.getCelula(x - 1, y).isOcupada()) {
            return true;
        }

        // Verifica se a posição abaixo está ocupada
        if (y + 1 < terreno.getAltura() && terreno.getCelula(x, y + 1).isOcupada()) {
            return true;
        }

        // Verifica se a posição acima está ocupada
        if (y - 1 >= 0 && terreno.getCelula(x, y - 1).isOcupada()) {
            return true;
        }

        return false;
    }

}
