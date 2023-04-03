package Atividade3;

public class Main {
    public static void main(String[] args) {
        Vetor alunos = new Vetor();
        alunos.adiciona(new Aluno("Renato", 40, 8));
        alunos.adiciona(new Aluno("Portallupi", 48, 10));
        alunos.adiciona(new Aluno("Homem", 54 ,7.8));
        Aluno alunoTest = new Aluno("Gol", 60, 9.9);
        alunos.adiciona(alunoTest);
        System.out.println(alunos.cheio());
        System.out.println(alunos.tamanho());
        System.out.println(alunos.contem(alunoTest));
        alunos.remove(alunoTest);
        System.out.println(alunos.cheio());
        System.out.println(alunos.tamanho());
        System.out.println(alunos.contem(alunoTest));

    }
}
