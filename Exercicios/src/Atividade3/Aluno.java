package Atividade3;

/* Criar uma classe Atividade2.Aluno. Sobre um aluno devem ser guardados:
 Nome  Idade  Nota 
Utilize o TAD Vetor, adaptando o para armazenar Alunos;
Adapte os métodos “adiciona”, “tamanho” e “contem” para o contexto de Alunos;
 Poste no seu repositório do Github
*/
public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota){
       this.nome= nome;
       this.idade=idade;
       this.nota=nota;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}
