package execao.personalizadaB.personalizadaA;

import execao.Aluno;

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
