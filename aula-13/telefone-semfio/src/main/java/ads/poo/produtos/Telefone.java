package ads.poo.produtos;


public class Telefone {
    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefone {");
        sb.append('\n');
        sb.append("codigo: ").append(codigo);
        sb.append('\n');
        sb.append("numSerie: '").append(numSerie).append('\'');
        sb.append('\n');
        sb.append("modelo: '").append(modelo).append('\'');
        sb.append('\n');
        sb.append("peso: ").append(peso);
        sb.append('\n');
        sb.append("dimensão (AxLxP): ").append(dimensao.getAltura()).append("x").append(dimensao.getLargura()).append("x").append(dimensao.getLargura());
        sb.append('\n');
        sb.append('}');
        return sb.toString();
    }


}