package padroescomportamentais.templatemethod;

public abstract class Bebida {

    private int quantidade;
    protected String nome;
    private float temperatura_inicial;
    private float temperatura_apos_preparo;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTemperaturaInicial() {
        return temperatura_inicial;
    }

    public void setTemperaturaInicial(float temperatura_inicial) {
        this.temperatura_inicial = temperatura_inicial;
    }

    public float getTemperaturaAposPreparo() {
        return temperatura_apos_preparo;
    }

    public void setTemperaturaAposPreparo(float temperatura_apos_preparo) {
        this.temperatura_apos_preparo = temperatura_apos_preparo;
    }

    public float calcularTemperaturaMedia() {
        return (this.temperatura_inicial + this.temperatura_apos_preparo) / 2;
    }

    public abstract String verificarTemperaturaMedia();

    public String getTipo() {
        return "Bebida";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "quantidade=" + this.quantidade +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarTemperaturaMedia() +
                '}';
    }
}
