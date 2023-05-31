package Marco1.Atividade3;

public class Vetor implements IVetor{
    private Aluno alunos[] = new Aluno[4];
    private int ultPos = 0;
    public Vetor(){

    }

    @Override
    public void adiciona(Aluno aluno) {
        if (!cheio()) {
            this.alunos[ultPos] = aluno;
            this.ultPos++;
        } else {
            aumentaTam();
            adiciona(aluno);
        }

    }

    private void aumentaTam() {
        if (cheio()) {
            Aluno newVet[] = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                newVet[i] = this.alunos[i];
            }
            this.alunos = newVet;
        }
    }

    @Override
    public int tamanho() {
        return ultPos;
    }

    @Override
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < ultPos; i++) {
            if (alunos[i] != null) {
                if (this.alunos[i].getNome().equals(aluno.getNome())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {
        if (ultPos == alunos.length)
            return true;
        return false;
    }

    @Override
    public boolean remove(Aluno aluno) {
        int ind = -1;
        Aluno al[] = new Aluno[alunos.length];
        for (int i = 0; i < ultPos; i++) {
            if (aluno == alunos[i]) {
                ind = i;
                break;
            } else {
                al[i] = alunos[i];
            }
        }
        if (ind != -1) {
            for (int i = ind + 1; i < alunos.length; i++) {
                al[i - 1] = alunos[i];
            }
            alunos = al;
            ultPos--;
            alunos[ultPos] = null;
            return true;
        } else
            System.out.println("Aluno não localizado!");
        return false;
    }


}
