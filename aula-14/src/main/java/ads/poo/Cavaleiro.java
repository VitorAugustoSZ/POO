package ads.poo;

public class Cavaleiro extends Personagem{

    public Cavaleiro(String nome) {
        super(nome, "Cavaleiro", 50, 3,2);
    }

    @Override
    public String mover() {
        return "O " + this.getClasse() + " está se movendo " + this.getVelocidade() + " para frente";
    }
}
