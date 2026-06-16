package ads.poo;

public class Livro {
    private int isbn;
    private String nome;
    private boolean locado;

    public Livro(String nome, int isbn) {
        this.locado = false;
        this.nome = nome;
        this.isbn = isbn;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", nome='" + nome + '\'' +
                ", locado=" + locado +
                '}';
    }
}
