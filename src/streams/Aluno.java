package streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final Double nota;
    final Boolean bomComportamento;

    public Aluno(String nome, Double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, Double nota, Boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", bomComportamento=" + bomComportamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(nota, aluno.nota) && Objects.equals(bomComportamento, aluno.bomComportamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
