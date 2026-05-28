package ads.poo;

import java.util.Arrays;

public class Disciplina {


    private String sigla;
    private DiaDaSemana[] aulas;

    public Disciplina(String sigla, DiaDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sigla: ");
        sb.append(sigla).append('\n');
        sb.append("Dia com aulas: ").append(Arrays.toString(aulas));
        return sb.toString();
    }
}