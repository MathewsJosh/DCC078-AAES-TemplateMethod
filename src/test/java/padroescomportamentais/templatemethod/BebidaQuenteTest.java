package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaQuenteTest {

    @Test
    void deveRetonarBebidaQuente() {
        BebidaQuente bebida = new BebidaQuente();
        bebida.setTemperaturaInicial(98.0f);
        bebida.setTemperaturaAposPreparo(89.0f);
        assertEquals("Quente", bebida.verificarTemperaturaMedia());
    }

    @Test
    void deveRetonarBebidaFria() {
        BebidaQuente bebida = new BebidaQuente();
        bebida.setTemperaturaInicial(-5.0f);
        bebida.setTemperaturaAposPreparo(3.9f);
        assertEquals("Fria", bebida.verificarTemperaturaMedia());
    }

    @Test
    void deveRetornarDadosDaBebida() {
        BebidaQuente bebida = new BebidaQuente();
        bebida.setTemperaturaInicial(30.0f);
        bebida.setTemperaturaAposPreparo(111.9f);
        bebida.setNome("Chá de Hortelã");
        bebida.setQuantidade(2);
        assertEquals("Bebida{quantidade=2, nome='Chá de Hortelã', resultado=Quente}", bebida.getInfo());
    }
}