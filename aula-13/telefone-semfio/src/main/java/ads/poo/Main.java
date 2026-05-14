package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {
        SemFio j = new SemFio(1,"1234abc","TDVMI400",40, new Dimensao(10,20,30), 2.4,5,43.5);

        Telefone k = new Telefone(1,"456def","jorge",45,new Dimensao(12,12,23));



        System.out.println(j);
    }
}
