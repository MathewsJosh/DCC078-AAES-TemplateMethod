package padroescomportamentais.templatemethod;

public class BebidaFria extends Bebida {

    public String verificarTemperaturaMedia() {
        if (this.calcularTemperaturaMedia() < 70.0f) {
            return "Fria";
        }
        else {
            return "Quente";
        }
    }

    @Override
    public String getTipo() {
        return "Bebida Fria";
    }
}
