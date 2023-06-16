package Marco2.Atividade13_14;

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private double nota;

    public Aluno(int matricula, String nome, int idade, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
