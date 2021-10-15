package execao.personalizadaA;

import execao.Aluno;
import execao.personalizadaA.NumeroForaIntervaloException;
import execao.personalizadaA.StringVaziaException;
import execao.personalizadaA.Validar;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7.0);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
