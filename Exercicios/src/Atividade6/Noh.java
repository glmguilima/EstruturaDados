package Atividade6;

public class Noh {
    private int info;
    private Noh prox;
    private Noh ant;

    public Noh(int info2) {
        this.info = info2;
        this.prox = null;
        this.ant = null;
    }

    public int getInfo() {
        return info;
    }

    public Noh getProximo() {
        return prox;
    }

    public void setAnterior(Noh novo) {
        this.ant = novo;
    }

    public Noh getAnterior() {
        return ant;
    }

    public void setProximo(Noh novo) {
        this.prox = novo;
    }

    public String toString() {
        return String.valueOf(info);
    }
}
