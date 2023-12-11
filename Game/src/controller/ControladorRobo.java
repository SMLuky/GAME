package controller;
import java.util.ArrayList;
import model.Robo;
import model.Terreno;

public class ControladorRobo {

    public static ArrayList<Robo> criarListaDeRobos(Terreno terreno) {
        ArrayList<Robo> listaDeRobos = new ArrayList<>();
        listaDeRobos.add(new Robo(0.0, 0, 0));
        listaDeRobos.add(new Robo(0.0, 1, 1));

        terreno.getCelulas()[0][0].setOcupada(true);
        terreno.getCelulas()[1][1].setOcupada(true);

        return listaDeRobos;
    }
}
