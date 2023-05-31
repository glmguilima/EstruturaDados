package Marco2.Atividade11;


public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    private Object [] vetFila;

    public FilaVet(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) {
        if (this.nElemFila== vetFila.length){
            System.out.println("Capacidade fila esgotou");
            return false;
        }
        int fim = (this.inicio +this.nElemFila)%this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    @Override
    public boolean remove() {
        if(this.isEmpty()){
            System.out.println("Fila estahvazia");
            return false;
        }
        this.inicio= (this.inicio+ 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (nElemFila!=0){
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return nElemFila;
    }

    public void imprimir(){
        int aux = inicio;
        if (isEmpty()){
            System.out.println("Fila Vazia");
        }else {
            for (int i=0; i < nElemFila ; i++) {
                System.out.println("Posição "+ (i + 1) + ": " + vetFila[aux].toString());
                aux = (aux+1) % this.vetFila.length;
            }
            System.out.println("impresso");
        }

    }

}



