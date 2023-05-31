package Marco1.Atividade5;


public class LSE implements Lista {
    private Noh inicio;
    private Noh calda;
    public LSE (){
        this.inicio = null;
    }

    public void mostraSE(){
        System.out.println("Lista: ");
        Noh novo = inicio;
        while (novo!= null){
            novo.mostraNoh();
            System.out.println(novo.getInfo()+ " ");
            novo = novo.getProximo();
        }
        System.out.println(" ");
    }

    @Override
    public void insereInicio(Object info) {
        Noh novoNoh = new Noh(info);
        if (inicio == null){
            inicio = novoNoh;
        }else {
            novoNoh.setProximo(inicio);
            inicio=novoNoh;
        }
    }

    @Override
    public void insereFim(Object info) {
        Noh novoNoh = new Noh(info);
        if (inicio == null){
            inicio = novoNoh;
        }else {
            Noh ultimo=null;
            for (Noh i = inicio; i !=null ; i=i.getProximo())
                ultimo = i;
                ultimo.setProximo(novoNoh);

        }
    }

    @Override
    public boolean estahVazia() {
        return inicio == null;
    }

    @Override
    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }
        if (p == null)
            return false;
        if (ant == null)
            inicio = p.getProximo();
        else
            ant.setProximo(p.getProximo());
        return true;
    }

    @Override
    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProximo())
            cont ++;
        return cont;
    }


}
