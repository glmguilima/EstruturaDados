package Marco2.Trabalho2;

class PilhaAluno implements IPilha {
    private class Noh {
        Object info;
        Noh next;

        public Noh(Object info) {
            this.info = info;
            this.next = null;
        }
    }

    private Noh top;
    private int size;

    public PilhaAluno() {
        top = null;
        size = 0;
    }

    @Override
    public boolean Push(Object info) {
        Noh newNoh = new Noh(info);
        newNoh.next = top;
        top = newNoh;
        size++;
        return true;
    }

    @Override
    public Object Pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha Vazia");
        }
        Object info = top.info;
        top = top.next;
        size--;
        return info;
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
        }
        return top.info;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void printPilha() {

        Noh current = top;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
        System.out.println();
    }
}

