package ads.poo;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome) {
        super(nome, "Arqueiro", 35,2,1);
    }

    @Override
    public String mover() {
        return "O " + this.getClasse() + " está se movendo " + this.getVelocidade() + " para frente";
    }
}
