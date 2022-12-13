package padroescomportamentais.templatemethod;

public class BebidaQuente extends Bebida {

    public String verificarTemperaturaMedia() {
        if (this.calcularTemperaturaMedia() >= 70.0f) {
            return "Quente";
        }
        else {
            return "Fria";
        }
    }

}
