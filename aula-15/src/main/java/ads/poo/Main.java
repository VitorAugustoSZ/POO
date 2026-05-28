package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
//        String nome = IO.readln("Digite o nome da disciplina");
//        int diaUm = Integer.parseInt(IO.readln("Entre com o primeior dia da semana de aula em números (sendo domingo 1, segunda 2...)"));
//        int diaDois = Integer.parseInt(IO.readln("Entre com o segundo dia, se houver"));
//
//        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(diaUm);
//        DiaDaSemana segundo = DiaDaSemana.getByCodigo(diaDois);


        int posicao = Integer.parseInt(IO.readln("Qual posição do planeta desejado?"));
        Planetas planeta = Planetas.getByPosition(posicao);
        System.out.println(planeta);

    }
}
