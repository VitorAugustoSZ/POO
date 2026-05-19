package ads.poo;

public class Aldeao extends Personagem implements Guerreiro{


    public Aldeao(String nome) {
        super(nome, "Aldeão", 25, 1, 0.8);
    }

    public String atacar(Personagem alvo){
        alvo.tomarDano(this.getAtaque());

        return "O " + getClasse() + " está atacando " + alvo.getClasse() + " " + alvo.getNome() + " inferindo " + getAtaque() + " de dano";
    }

    @Override
    public String mover() {
        return "O " + this.getClasse() + " está se movendo " + this.getVelocidade() + " para frente";
    }
}
