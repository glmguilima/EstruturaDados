package Marco2.Trabalho2;

class FilaAluno {
    private class Noh {
        Aluno aluno;
        Noh next;

        public Noh(Aluno aluno) {
            this.aluno = aluno;
            this.next = null;
        }
    }

    private Noh front;
    private Noh rear;
    private int size;

    public FilaAluno() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void emFila(Object student) {
        Noh newNoh = new Noh((Aluno) student);
        if (isEmpty()) {
            front = newNoh;
            rear = newNoh;
        } else {
            rear.next = newNoh;
            rear = newNoh;
        }
        size++;
    }

    public Aluno desfazerFila() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila Vazia");
        }
        Aluno aluno = front.aluno;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return aluno;
    }

    public void printFila() {
        Noh current = front;
        while (current != null) {
            System.out.print(current.aluno.getName() + " ");
            current = current.next;
        }
        System.out.println();
    }
}