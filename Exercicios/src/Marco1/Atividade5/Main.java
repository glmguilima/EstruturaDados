package Marco1.Atividade5;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1= new Aluno("jorge",18,7.5);
        Aluno aluno2= new Aluno("ana",17,9);
        Aluno aluno3= new Aluno("mario",16,5.5);
        Lista l = new LSE();
        System.out.println(l.tamanho());
        l.insereInicio(aluno1);
        l.insereInicio(aluno2);
        l.mostraSE();
        l.remove(aluno2);
        System.out.println(l.estahVazia());
        l.insereFim(aluno3);
        System.out.println(l.tamanho());



    }
}
