package view;

import model.Celula;
import model.Terreno;

public class OutputTerreno {

    public static void imprimirTerreno(Terreno terreno) {
        int altura = terreno.getAltura();
        int largura = terreno.getLargura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                Celula celula = terreno.getCelula(i, j);
                String representacao = formatarCelula(celula);
                System.out.print(representacao);
            }
            System.out.println();
        }
    }

    private static String formatarCelula(Celula celula) {
        String representacao = "|CH3:" + String.format("%.2f", celula.getConcentracaoH3()) +
                "  RUG:" + String.format("%.2f", celula.getRugosidadeTerreno()) + "|";

        if (celula.isOcupada()) {
            // ANSI escape code para cor vermelha
            representacao = "\u001B[31m" + representacao + " [R]" + "\u001B[0m"; 
        } else {
            // ANSI escape code para cor verde
            representacao = "\u001B[32m" + representacao + "     " + "\u001B[0m";  
        }

        return representacao + "\t\t\t\t";
    }
    
    public void opcaoProspectar() {
    	System.out.print("Você deseja prospectar? (s - sim, n - não): ");
    }
    
    public void prospectou() {
        System.out.printf("Você prospectou Hélio-3\n");
    }
}
