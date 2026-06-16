package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    private HashMap<Integer, Livro> acervo = new HashMap<>();
    private ArrayList<Locacao> locacoes = new ArrayList<>();


    public void emprestar(Livro livro, Usuario usuario, int qtdDias){
        if (!livro.isLocado()){
            livro.setLocado(true);
            LocalDate hoje = LocalDate.now();
            LocalDate prazoFinal = hoje.plusDays(qtdDias);
            Locacao locacao = new Locacao(livro, usuario, hoje, prazoFinal);
            // o usuario recebe a locacao no construtor da locacao, associado-o diretamente

            this.locacoes.add(locacao);
        } else {
            throw new JaLocadoException("Esse livro não está disponível");
        }
    }

    public void devolver(Usuario usuario, Livro livro) {

        usuario.getLocacaoByLivro(livro);

    }
}
