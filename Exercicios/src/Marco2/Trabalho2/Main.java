package Marco2.Trabalho2;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String verifica = "arara";

        System.out.println(palindrome.isPalindrome(verifica));

        System.out.println(palindrome.isPalindrome("AbAbbA"));

        palindrome.printPilha();


        PilhaAluno pilha = new PilhaAluno();
        FilaAluno fila = new FilaAluno();

        fila.emFila(new Aluno("Ana"));
        fila.emFila(new Aluno("Bruno"));
        fila.emFila(new Aluno("Carlos"));
        fila.emFila(new Aluno("Daniel"));

        System.out.println("Fila original:");
        fila.printFila();

        while (!fila.isEmpty()) {
            pilha.Push(fila.desfazerFila());
        }
        System.out.println("Fila invertida:");
        while (!pilha.isEmpty()) {
            fila.emFila(pilha.Pop());
        }

        fila.printFila();
    }
}
