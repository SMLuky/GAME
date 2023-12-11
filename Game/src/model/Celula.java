package model;

public class Celula {
    private int posicaoI;
    private int posicaoJ;
    private double concentracaoHelio3;
    private float rugosidadeTerreno;
    private boolean isOcupada;
    private double limiteInferiorErro;
    private double limiteSuperiorErro;

    public Celula(int posicaoI, int posicaoJ, double concentracaoHelio3, float rugosidadeTerreno, double limiteInferiorErro, double limiteSuperiorErro) {
        this.posicaoI = posicaoI;
        this.posicaoJ = posicaoJ;
        this.concentracaoHelio3 = concentracaoHelio3;
        this.rugosidadeTerreno = rugosidadeTerreno;
        this.isOcupada = false;
        this.limiteInferiorErro = limiteInferiorErro;
        this.limiteSuperiorErro = limiteSuperiorErro;
    }

    public Celula() {
	}

	public int getPosicaoI() {
        return posicaoI;
    }

    public void setPosicaoI(int posicaoI) {
        this.posicaoI = posicaoI;
    }

    public int getPosicaoJ() {
        return posicaoJ;
    }

    public void setPosicaoJ(int posicaoJ) {
        this.posicaoJ = posicaoJ;
    }

    public double getConcentracaoH3() {
        return concentracaoHelio3;
    }

    public void setConcentracaoH3(double d) {
        this.concentracaoHelio3 = d;
    }

    public float getRugosidadeTerreno() {
        return rugosidadeTerreno;
    }

    public void setRugosidadeTerreno(float rugosidadeTerreno) {
        this.rugosidadeTerreno = rugosidadeTerreno;
    }

    public double getLimiteInferiorErro() {
        return limiteInferiorErro;
    }

    public void setLimiteInferiorErro(double limiteInferiorErro) {
        this.limiteInferiorErro = limiteInferiorErro;
    }

    public double getLimiteSuperiorErro() {
        return limiteSuperiorErro;
    }

    public void setLimiteSuperiorErro(double limiteSuperiorErro) {
        this.limiteSuperiorErro = limiteSuperiorErro;
    }

    public boolean isOcupada() {
        return isOcupada;
    }

    public void setOcupada(boolean ocupada) {
        this.isOcupada = ocupada;
    }
    
}
    
    


