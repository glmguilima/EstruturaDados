package Atividade7;

public class Alunos {
    private String nome;
    private Double nota;
    private int idade;

    public Alunos(String nome, double nota, int idade){
        this.nome=nome;
        this.nota=nota;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", idade=" + idade +
                '}';
    }
}
