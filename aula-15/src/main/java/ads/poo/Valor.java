package ads.poo;

public enum Valor {

    ÁS(1,"Ás"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "seis"),
    SETE(7, "sete"),
    OITO(8, "oito"),
    NOVE(9, "nove"),
    DEZ(10, "dez"),
    VALETE(11, "valete"),
    DAMA(12, "dama"),
    REI(13, "rei");

    private final int valor;
    private final String extenso;

    Valor(int valor, String extenso) {
        this.valor = valor;
        this.extenso = extenso;
    }
}
