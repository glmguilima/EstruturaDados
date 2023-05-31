package Marco1.ExerPraticosP1;
//Exercicio 5
public class LDE {
    private Node primeiro;
    private int size;

    private class Node {
        int info;
        Node ant;
        Node prox;

        public Node(int inf) {
            this.info = inf;
            this.ant = null;
            this.prox = null;
        }
    }

    public LDE() {
        this.primeiro = null;
        this.size = 0;
    }

    public void add(int inf) {
        Node newNode = new Node(inf);
        if (primeiro == null) {
            primeiro = newNode;
        } else {
            Node atual = primeiro;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = newNode;
            newNode.ant = atual;
        }
        size++;
    }

    public int numeroPares() {
        Node atual = primeiro;
        int count = 0;

        while (atual != null) {
            if (atual.info % 2 == 0) {
                count++;
            }
            atual = atual.prox;
        }

        return count;
    }
//Exercicio 6
    public void addOrdenado(int inf) {
        Node newNode = new Node(inf);

        if (primeiro == null) {
            primeiro = newNode;
        } else if (inf <= primeiro.info) {
            newNode.prox = primeiro;
            primeiro.ant = newNode;
            primeiro = newNode;
        } else {
            Node atual = primeiro;
            while (atual.prox != null && inf > atual.prox.info) {
                atual = atual.prox;
            }
            newNode.prox = atual.prox;
            newNode.ant = atual;
            if (atual.prox != null) {
                atual.prox.ant = newNode;
            }
            atual.prox = newNode;
        }
        size++;
    }

    public void printList() {
        Node atual = primeiro;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

}
