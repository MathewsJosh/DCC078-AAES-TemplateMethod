package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaFriaTest {

    @Test
    void deveRetonarBebidaFria() {
        BebidaFria bebida = new BebidaFria();
        bebida.setTemperaturaInicial(18.21f);
        bebida.setTemperaturaAposPreparo(21.18f);
        assertEquals("Fria", bebida.verificarTemperaturaMedia());
    }

    @Test
    void deveRetonarBebidaQuente() {
        BebidaFria bebida = new BebidaFria();
        bebida.setTemperaturaInicial(71.019f);
        bebida.setTemperaturaAposPreparo(76.69f);
        assertEquals("Quente", bebida.verificarTemperaturaMedia());
    }

    @Test
    void deveRetornarDadosDaBebida() {
        BebidaFria bebida = new BebidaFria();
        bebida.setTemperaturaInicial(22.0f);
        bebida.setTemperaturaAposPreparo(25.0f);
        bebida.setNome("Manga com leite");
        bebida.setQuantidade(1);
        assertEquals("Bebida Fria{quantidade=1, nome='Manga com leite', resultado=Fria}", bebida.getInfo());
    }
}