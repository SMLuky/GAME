package utils;
import model.Celula;
import java.util.Random;

public class RandomUtil {

    public static Celula gerarCelulaRandomica(int posicaoI, int posicaoJ) {
        Random random = new Random();

        double concentracaoH3 = Math.round(random.nextDouble() * 100.0) / 100.0; 
        double limiteInferiorErro = Math.round(random.nextDouble() * 0.1 * 100.0) / 100.0; 
        double limiteSuperiorErro = Math.round((limiteInferiorErro + 0.02) * 100.0) / 100.0;
        float rugosidadeTerreno = random.nextFloat() * 1.0f; 

        return new Celula(posicaoI, posicaoJ, concentracaoH3, rugosidadeTerreno, limiteInferiorErro, limiteSuperiorErro);
    }
}
