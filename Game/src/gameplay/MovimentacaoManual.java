package gameplay;

import model.Robo;
import model.Terreno;
import view.OutputTerreno;
import java.util.Scanner;
import view.OutputMovimentacao;


public class MovimentacaoManual {

    public static void movimentarRobo(Terreno terreno, Robo robo) {
        Scanner scanner = new Scanner(System.in);
        OutputMovimentacao output = new OutputMovimentacao();
        OutputTerreno outputT = new OutputTerreno();
        

        char opcao;
        char vaiProspectar;

        OutputTerreno.imprimirTerreno(terreno);
            output.posicaoDesejada();
            opcao = scanner.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'R':
                    moverParaDireita(terreno, robo);
                    break;
                case 'L':
                    moverParaEsquerda(terreno, robo);
                    break;
                case 'U':
                    moverParaCima(terreno, robo);
                    break;
                case 'D':
                    moverParaBaixo(terreno, robo);
                    break;
                case 'M':
                    output.permaneceNoLugar();
                    break;
                default:
                    output.movimentoInvalido();
            }
            
	
	            outputT.opcaoProspectar();
	            vaiProspectar = scanner.next().toLowerCase().charAt(0);
	            
	            if (vaiProspectar == 's') {
	            	robo.setProspectando(true);
	            	outputT.prospectou();
	            	robo.capturarHelio3(terreno.getCelula(robo.getX(), robo.getY()));
					robo.setTempoProspectando((int) (Math.floor(terreno.getCelula(robo.getX(), robo.getY()).getRugosidadeTerreno() * 10)));
	            }

        
    }

    private static void moverParaDireita(Terreno terreno, Robo robo) {
        OutputMovimentacao output = new OutputMovimentacao();
        int novaPosicaoX = robo.getX();
        int novaPosicaoY = robo.getY() + 1;

        if (novaPosicaoY < terreno.getLargura() && !terreno.getCelula(novaPosicaoX, novaPosicaoY).isOcupada()) {
            desocuparCelulaAnterior(terreno, robo);
            ocuparNovaCelula(terreno, robo, novaPosicaoX, novaPosicaoY);
            output.movimentouDireita();
        } else {
        	output.impossivelMovimentarDireita();
        }
    }

    private static void moverParaEsquerda(Terreno terreno, Robo robo) {
        OutputMovimentacao output = new OutputMovimentacao();
        int novaPosicaoX = robo.getX();
        int novaPosicaoY = robo.getY() - 1;

        if (novaPosicaoY >= 0 && !terreno.getCelula(novaPosicaoX, novaPosicaoY).isOcupada()) {
            desocuparCelulaAnterior(terreno, robo);
            ocuparNovaCelula(terreno, robo, robo.getX(), novaPosicaoY);
            output.movimentouEsquerda();
        } else {
            output.impossivelMovimentarEsquerda();
        }
    }

    private static void moverParaCima(Terreno terreno, Robo robo) {
        OutputMovimentacao output = new OutputMovimentacao();
        int novaPosicaoX = robo.getX() - 1;
        int novaPosicaoY = robo.getY();

        if (novaPosicaoX >= 0 && novaPosicaoX <= terreno.getAltura() && !terreno.getCelula(novaPosicaoX, novaPosicaoY).isOcupada()) {
            desocuparCelulaAnterior(terreno, robo);
            ocuparNovaCelula(terreno, robo, novaPosicaoX, robo.getY());
            output.movimentouCima();
        } else {
        	output.impossivelMovimentarCima();
        }
    }

    private static void moverParaBaixo(Terreno terreno, Robo robo) {
        OutputMovimentacao output = new OutputMovimentacao();
    	int novaPosicaoX = robo.getX() + 1;
        int novaPosicaoY = robo.getY();

        if (novaPosicaoX < terreno.getAltura() && !terreno.getCelula(novaPosicaoX, novaPosicaoY).isOcupada()) {
            desocuparCelulaAnterior(terreno, robo);
            ocuparNovaCelula(terreno, robo, novaPosicaoX, robo.getY());
            output.movimentouBaixo();
        } else {
            output.impossivelMovimentarBaixo();
        }
    }

    private static void desocuparCelulaAnterior(Terreno terreno, Robo robo) {
        int xAnterior = robo.getX();
        int yAnterior = robo.getY();
        terreno.getCelula(xAnterior, yAnterior).setOcupada(false);
    }

    private static void ocuparNovaCelula(Terreno terreno, Robo robo, int x, int y) {
        robo.setPosicao(x, y);
        terreno.getCelula(x, y).setOcupada(true);
    }
}




