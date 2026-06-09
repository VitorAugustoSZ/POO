package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;


public class App implements DrawListener {

    private Draw draw;
    private ArrayList<Carta> baralho = new ArrayList<>();

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
        this.criarBaralho();
    }

    @Override
    public void mouseClicked(double x, double y) {

        String valores = "123456789qjk";
        this.draw.picture(x,y, "cartas/1p.png");
        this.draw.show();
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
                    System.out.println(nomeArquivo);
                    this.draw.picture(10+k+j,20+j+k*2,nomeArquivo);

                }
            }





        System.out.println(baralho);
        System.out.println(baralho.size());
    }
    
    static void main() {
        App app = new App();


    }
}
