package application;

import java.util.ArrayList;
import java.util.Scanner;
import controller.ControladorRobo;
import controller.ControladorTerreno;
import model.Robo;
import model.Terreno;
import gameplay.MovimentacaoManual;
import view.OutputJogadas;
import view.OutputVencedor;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutputJogadas output = new OutputJogadas();
        Terreno terreno = ControladorTerreno.criarTerreno();
        ArrayList<Robo> listaDeRobos = ControladorRobo.criarListaDeRobos(terreno);

        /* ----------------------- Jogo ----------------------- */
        do { 
            for(int i = 0; i < listaDeRobos.size(); i++) {
                if(!listaDeRobos.get(i).isProspectando()) { 
                	output.roboJogando(i);
                    MovimentacaoManual.movimentarRobo(terreno, listaDeRobos.get(i));
                }else {
                	listaDeRobos.get(i).setTempoProspectando(listaDeRobos.get(i).getTempoProspectando() - 1);
                	output.roboProspectando(i);
                	if(listaDeRobos.get(i).getTempoProspectando() <= 0) {
                		output.roboTerminouProspectar(i);
                		listaDeRobos.get(i).setProspectando(false);
                	}
                }
            }
        } while(terreno.isConcentracaoZerada());
        
        OutputVencedor.imprimirRoboVencedor(listaDeRobos);
        
        scanner.close();
    }
}

 