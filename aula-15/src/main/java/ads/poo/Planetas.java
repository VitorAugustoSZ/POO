package ads.poo;

public enum Planetas {

    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    private final int posicao;
    private String nome;

    Planetas(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static Planetas getByPosition(int posicao){
        for(Planetas planeta : Planetas.values()){
            if (planeta.posicao == posicao){
                return planeta;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }

    @Override
    public String toString() {
        return nome;
    }
}
