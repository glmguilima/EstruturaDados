package Marco3.Atividade15;


public class ABB {
    private Noh raiz;

    public boolean isEmpty(){
        return this.raiz ==null;
    }

    public void  add(int element){
        if (isEmpty()){
            this.raiz = new Noh(element);
        }else {
            Noh aux = this.raiz;
            while (aux!=null){
                if (element<aux.valor){
                    if (aux.esq == null){
                        Noh newNoh = new Noh(element);
                        aux.esq= newNoh;
                        newNoh.pai=aux;
                        return;
                    }
                    aux=aux.esq;
                }else {
                    if (aux.dir == null){
                        Noh newNoh = new Noh(element);
                        aux.dir= newNoh;
                        newNoh.pai=aux;
                        return;
                    }
                    aux =aux.dir;
                }
            }
        }
    }

    public void recursiveAdd (int element){
        if (isEmpty()){
            this.raiz = new Noh(element);
        }else {
            recursiveAdd(this.raiz,element);
        }
    }

    private void recursiveAdd(Noh node, int element){
        if (element<node.valor){
            if (node.esq==null){
                Noh newNoh = new Noh(element);
                node.esq = newNoh;
                newNoh.pai= node;
                return;
            }
            recursiveAdd(node.esq,element);
        }else {
            if (node.dir==null){
                Noh newNoh = new Noh(element);
                node.dir = newNoh;
                newNoh.pai= node;
                return;
            }
            recursiveAdd(node.dir,element);
        }
    }


    public int busca(int element) {
        return busca(this.raiz, element).getValor();
    }

    private Noh busca(Noh node, int element) {
        if (node == null)
            return null;
        if (element == node.getValor())
            return node;
        if (element < node.getValor())
            return busca(node.getEsq(), element);
        else
            return busca(node.getDir(), element);
    }

    public void imprime() {
        imprime(this.raiz);
    }

    private void imprime(Noh node) {
        if (node != null) {
            imprime(node.getEsq());
            System.out.println(node.getValor());
            imprime(node.getDir());
        }
    }


}
