package view;

import java.util.ArrayList;

import model.Robo;

public class OutputVencedor {
    public static void imprimirRoboVencedor(ArrayList<Robo> listaDeRobos) {
        Robo roboVencedor = encontrarRoboVencedor(listaDeRobos);

        System.out.println("Robô vencedor (ID: " + roboVencedor.getId() + ")");
        System.out.println("Quantidade de Hélio-3 prospectado: " + String.format("%.3f", roboVencedor.getTanqueH3()));
    }

    private static Robo encontrarRoboVencedor(ArrayList<Robo> listaDeRobos) {
        Robo roboVencedor = listaDeRobos.get(0);

        for (Robo robo : listaDeRobos) {
            if (robo.getTanqueH3() > roboVencedor.getTanqueH3()) {
                roboVencedor = robo;
            }
        }

        return roboVencedor;
    }
}

