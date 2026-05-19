package ads.poo.produtos;

public class SemFio extends Telefone {

    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    // TIP jorge
    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append(super.toString());
        sb.append('\n');
        sb.append("frequencia=").append(frequencia);
        sb.append('\n');
        sb.append("canais=").append(canais);
        sb.append('\n');
        sb.append("distanciaOperacao=").append(distanciaOperacao);
        sb.append('\n');
        sb.append('}');
        return sb.toString();
    }


}
