package Marco1.Atividade6;
public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    @Override
    public boolean estahVazia() {

        return inicio == null;
    }


    @Override
    public boolean remove(int info) {
        Noh p = busca(info);
        if (p == null)
            return false;
        if (p.getAnterior() == null) {
            inicio = p.getProximo();
            inicio.setAnterior(null);
        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

    public Noh busca(int info) {
        Noh resultado = null;
        for(Noh i = inicio; i != null && i.getInfo() != info; i = i.getProximo()) {
            if(i.getInfo() == info)
                resultado = i;
        }
        return resultado;

    }

    @Override
    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProximo())
            cont++;
        return cont;
    }

    @Override
    public void imprimeInicioAFim() {
        for (Noh i = inicio; i != null; i = i.getProximo())
            System.out.println(i.toString());
    }

    @Override
    public void imprimeFimAInicio() {
        for (Noh i = fim; i != null; i = i.getAnterior())
            System.out.println(i.toString() );
    }

}
