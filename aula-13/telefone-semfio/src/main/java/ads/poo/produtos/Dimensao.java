package ads.poo.produtos;

public class Dimensao {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensao(double a, double profundidade, double l) {
        this.altura = a;
        this.profundidade = profundidade;
        this.largura = l;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimensao{");
        sb.append("altura=").append(altura);
        sb.append(", largura=").append(largura);
        sb.append(", profundidade=").append(profundidade);
        sb.append('}');
        return sb.toString();
    }
}
