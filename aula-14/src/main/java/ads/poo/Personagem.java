package ads.poo;

public abstract class Personagem {

    private String nome;
    private double vida;
    private double ataque;
    private double velocidade;
    private String classe;

    public Personagem(String nome, String classe, double vida, double ataque, double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.vida = vida;
        this.classe = classe;
    }



    protected void tomarDano(double dano){
        this.vida = this.vida - dano;
    }

    public abstract String mover ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
