package ads.poo;

public enum Naipe {
    COPAS(1,'c', "copas"),
    ESPADAS(2, 'e', "espadas"),
    OUROS(3,'o', "ouros"),
    PAUS(4,'p', "paus");

    private final int valorNum;
    public char abreviacao;
    private String nome;

    Naipe(int valorNum, char abreviacao, String nome){
        this.valorNum = valorNum;
        this.abreviacao = abreviacao;
        this.nome = nome;
    }

    public static Naipe getByValue(int valorNum){
        for(Naipe naipe : Naipe.values()){
            if (naipe.valorNum == valorNum){
                return naipe;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }
}
