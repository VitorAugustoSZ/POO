package ads.poo;

import java.time.LocalDate;
import java.util.Random;

public class Locacao {
    private int id;
    private Livro livro;
    private Usuario locador;
    private LocalDate coleta;
    private LocalDate prazo;
    private boolean ativo;

    public Locacao(Livro livro, Usuario locador, LocalDate coleta, LocalDate prazo) {
        Random r = new Random();
        this.id = r.nextInt();
        this.livro = livro;
        this.locador = locador;
        this.coleta = coleta;
        this.prazo = prazo;
        this.ativo = true;
        locador.pegarEmprestado(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getLocador() {
        return locador;
    }

    public void setLocador(Usuario locador) {
        this.locador = locador;
    }

    public LocalDate getColeta() {
        return coleta;
    }

    public void setColeta(LocalDate coleta) {
        this.coleta = coleta;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean pago) {
        this.ativo = pago;
    }
}
