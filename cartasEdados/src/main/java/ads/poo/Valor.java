package ads.poo;

import java.security.cert.CertificateNotYetValidException;

public enum Valor {
    AS(1, "1", "ás"),
    DOIS(2, "2", "dois"),
    TRES(3, "3","tres"),
    QUATRO(4, "4","quatro"),
    CINCO(5, "5","cinco"),
    SEIS(6, "6","seis"),
    SETE(7, "7","sete"),
    OITO(8,"8" ,"oito"),
    NOVE(9,"9" ,"nove"),
    DEZ(10, "10","dez"),
    VALETE(11, "j","valete"),
    DAMA(12, "q","dama"),
    REI(13,"k" ,"rei");

    private final int valorNum;
    private String valor;
    private String nome;

    Valor(int valorNum, String nome, String valor) {
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
