package model;

public class Terreno {
    private int altura;
    private int largura;
    private Celula[][] celulas;

    public Terreno(int altura, int largura, Celula[][] celulas) {
        this.altura = altura;
        this.largura = largura;
        this.celulas = celulas;
    }

    
    public Celula[][] getCelulas() {
        return celulas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public Celula getCelula(int x, int y) {
        return celulas[x][y];
    }

    public void setCelula(Celula[][] celulas) {
        this.celulas = celulas;
    }
    
    public boolean isConcentracaoZerada() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (celulas[i][j].getConcentracaoH3() > 0) {
                    return true;  
                }
            }
        }
        return false; 
    }
}
