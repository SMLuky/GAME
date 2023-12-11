package controller;

import java.util.Scanner;

import model.Celula;
import model.Terreno;
import utils.RandomUtil;

public class ControladorTerreno {
    public static Terreno criarTerreno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura desejada: ");
        int largura = scanner.nextInt();

        System.out.print("Digite a altura desejada: ");
        int altura = scanner.nextInt();

        Celula[][] celulas = new Celula[altura][largura];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                celulas[i][j] = RandomUtil.gerarCelulaRandomica(i, j);
            }
        }

        return new Terreno(altura, largura, celulas);
    }
}
