package Marco1.Atividade7;

public class Main {
    public static void main(String[] args) {
        Alunos al1 = new Alunos("Arnaldo", 3.5, 12);
        Alunos al2 = new Alunos("Bebeto", 4.8, 13);
        Alunos al3 = new Alunos("Carlos", 7.8, 15);
        Lista lista = new LdeGen();
        System.out.println(lista.estahVazia());
        lista.insereInicio(al1);
        lista.insereInicio(al2);
        lista.insereInicio(al3);
        lista.imprimeInicioAFim();
        lista.insereFim(al3);
        System.out.println(lista.tamanho());
        System.out.println(lista.remove(al2));
        System.out.println(lista.tamanho());
        lista.imprimeInicioAFim();
        lista.imprimeFimAInicio();
        System.out.println(lista.estahVazia());
        lista.imprimeInicioAFim();
        System.out.println(lista.tamanho());
        lista.imprimeFimAInicio();

    }

}
