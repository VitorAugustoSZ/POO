package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Caixa<String> livro = new Caixa<>("OI");

        Pessoa p = new Pessoa("Pedro", 17);

        System.out.println(livro.get());

        Caixa<Pessoa> c = new Caixa<>(p);

        System.out.println(c.get());

        ArrayList<String> minhaArray = new ArrayList<>();

        HashMap<String, Pessoa> meuDicio = new HashMap<>();

        String s1 = "Paraclorobenzilpirrolidenonetilbenzimidazol";
        String s2 = "Pneumoultramiscrodososseilaporra";

        System.out.println(s1.compareTo(s2));

    }
}
