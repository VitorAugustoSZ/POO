package ads.poo;

import java.util.ArrayList;
import java.util.Random;

public class App {

    ArrayList<Carta> baralho = new ArrayList<>();

    public App(){
        this.criarBaralho();
    }

    public void criarBaralho(){

        Naipe naipe;
        Valor valor;
        int valorNaipe;
        int valorCarta;
        for (int j = 0; j < 4; j++) {//for naipes
            valorNaipe = j+1;
            naipe = Naipe.getByValue(valorNaipe); // <- valor do naipe

            for (int k = 0; k < 13; k++) {
                valorCarta = k+1;
                valor = Valor.getByValue(valorCarta);
                Carta c = new Carta(naipe, valor);
                baralho.add(c);
                String nomeArquivo = String.format("cartas/%d%c.png", valorCarta, naipe.abreviacao); //cria uma String do local do arquivo de acordo com o naipe



            }
        }

    }

    public String mostrarCarta(){
        Random r = new Random();

    }


    static void main() {
    App app = new App();

    }
}
