package Atividade5;

public class Noh {
    private Object info;
    private Noh proximo;

    public Noh(Object info){
        this.info = info;
        this.proximo = null;
    }

    public void mostraNoh(){
      //  System.out.println(info + " ");
    }
    public Object getInfo() {
        return info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

}
