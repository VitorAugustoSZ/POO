package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Aldeao revolver = new Aldeao("revolver_anexo");
        Arqueiro carapicu = new Arqueiro("Carapicu88");
        Cavaleiro pedepano = new Cavaleiro("PeDePano2342");
        Aldeao npc = new Aldeao("npc");

        Personagem[] vetor = new Personagem[3];

        vetor[0] = revolver;
        vetor[1] = carapicu;
        vetor[2] = pedepano;

        for (Personagem p : vetor){
            if (p instanceof Guerreiro m){
                System.out.println(m.atacar(npc));
            }

            System.out.println(p.mover());
            System.out.println(npc.getVida());
            System.out.println(" ");
        }


    }
}
