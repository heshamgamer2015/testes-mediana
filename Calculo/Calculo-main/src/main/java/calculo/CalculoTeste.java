package calculo;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class CalculoTeste {

    @Autowired
    private CalculoService calculoService;

    @Test
    public void testCalcularMedia() {
        Calculo calculo = calculoService.calcularMedia(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(10.5, calculo.getMedia());
    }

    @Test
    public void testCalcularMinimo() {
        Calculo calculo = calculoService.calcularMinimo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(1, calculo.getMinimo());
    }

    @Test
    public void testCalcularMaximo() {
        Calculo calculo = calculoService.calcularMaximo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(20, calculo.getMaximo());
    }

    @Test
    public void testCalcularMediana() {
        Calculo calculo = calculoService.calcularMediana(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(10.5, calculo.getMediana());
    }

    @Test
    public void testCalcularDesvioPadrao() {
        Calculo calculo = calculoService.calcularDesvioPadrao(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(5.766, calculo.getDesvioPadrao(), 0.001);
    }
}
