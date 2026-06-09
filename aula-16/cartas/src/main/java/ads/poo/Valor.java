package ads.poo;

import java.security.cert.CertificateNotYetValidException;

public enum Valor {
    AS(1, "ás"),
    DOIS(2, "dois"),
    TRES(3, "tres"),
    QUATRO(4, "quatro"),
    CINCO(5, "cinco"),
    SEIS(6, "seis"),
    SETE(7, "sete"),
    OITO(8, "oito"),
    NOVE(9, "nove"),
    DEZ(10, "dez"),
    VALETE(11, "valete"),
    DAMA(12, "dama"),
    REI(13, "rei");

    private final int valorNum;
    private String nome;

    Valor(int valorNum, String nome) {
        this.valorNum = valorNum;
        this.nome = nome;
    }

    public static Valor getByValue(int valorNum){
        for(Valor valor : Valor.values()){
            if (valor.valorNum == valorNum){
                return valor;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }
}
