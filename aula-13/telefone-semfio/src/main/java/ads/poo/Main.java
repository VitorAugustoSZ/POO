package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {

        Telefone t = new Telefone(32,"123abc","TCF 2000",42, new Dimensao(12,12,12));

        Telefone a = new SemFio(1,"1234abc","TS 3110",40, new Dimensao(10,20,30), 5,5,43.5);


        SemFio sf = new SemFio(1,"1234abc","TDVMI400",40, new Dimensao(10,20,30), 2.4,5,43.5);

        Telefone[] vetor = new Telefone[3];
        vetor[0] = t;
        vetor[1] = sf;
        vetor[2] = a;

        for(Telefone item : vetor){
            if (item instanceof SemFio novo){
                System.out.println(novo.getFrequencia());
            } else {
                System.out.println(
                        item.getModelo()
                );
            }
        }



    }
}
