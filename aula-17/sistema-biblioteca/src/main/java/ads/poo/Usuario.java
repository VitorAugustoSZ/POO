package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int cpf;
    private ArrayList<Locacao> locacoes = new ArrayList<>();

    public Usuario(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void pegarEmprestado(Locacao locacao){
        this.locacoes.add(locacao);
    }

    public Locacao getLocacaoByLivro(Livro livro){

        locacoes.forEach(e -> {
            if (e.getLivro() == livro){
                return e;
            }
        });
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
