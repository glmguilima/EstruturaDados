package Marco1.Atividade7;

public class LdeGen implements Lista{
    private Noh inicio;
    private Noh fim;
    public LdeGen (){
        this.inicio = null;
        this.fim=null;
    }

    @Override
    public boolean remove(Object info) {
        while(inicio!=null){
          if (inicio.getInfo().equals(info)){
              if (fim==null){
                  inicio=inicio.getProx();
              }else {
                  fim.setProx(inicio.getProx());
              }
              return true;
          }
          fim = inicio;
          inicio = inicio.getProx();

        }
    return false;
    }

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    @Override
    public boolean estahVazia() {
        return inicio == null;
    }


    @Override
    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProx())
            cont++;
        return cont;
    }


    @Override
    public void imprimeInicioAFim() {
        for (Noh i = inicio; i != null; i = i.getProx())
            System.out.println(i.toString() + "\n");
    }

    @Override
    public void imprimeFimAInicio() {
        for (Noh i = fim; i != null; i = i.getAnt())
            System.out.println(i.toString() + "\n");
    }
}
