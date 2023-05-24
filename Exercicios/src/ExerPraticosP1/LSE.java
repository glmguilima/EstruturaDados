package ExerPraticosP1;

//Exercicio 9
public class LSE {
    private Noh primeiro;

    private class Noh {
        int info;
        Noh prox;

        public Noh(int inf) {
            this.info = inf;
            this.prox = null;
        }
    }

    public void add(int data) {
        Noh novoNoh = new Noh(data);
        if (primeiro == null) {
            primeiro = novoNoh;
        } else {
            Noh atual = primeiro;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = novoNoh;
        }
    }

    public void bubbleSort() {
        if (primeiro == null || primeiro.prox == null) {
            return;
        }

        boolean trocar;
        Noh atual;
        Noh ant = null;

        do {
            trocar = false;
            atual = primeiro;

            while (atual.prox != ant) {
                if (atual.info > atual.prox.info) {

                    int temp = atual.info;
                    atual.info = atual.prox.info;
                    atual.prox.info = temp;
                    trocar = true;
                }
                atual = atual.prox;
            }
            ant = atual;

        } while (trocar);
    }

    public void printList() {
        Noh atual = primeiro;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }


}
