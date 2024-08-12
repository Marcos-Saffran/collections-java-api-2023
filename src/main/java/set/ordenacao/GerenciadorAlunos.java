package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        alunoSet.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Aluno 5", 1L, 9.0);
        gerenciadorAlunos.adicionarAluno("Aluno 0", 2L, 5.0);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 3L, 7.0);
        gerenciadorAlunos.adicionarAluno("Aluno 9", 4L, 3.0);
        gerenciadorAlunos.adicionarAluno("Aluno 5", 5L, 8.0);

        System.out.println("Exibir Alunos ...");
        System.out.println(gerenciadorAlunos.alunoSet);

        System.out.println("Alunos por nome:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("\nAlunos por nota:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
