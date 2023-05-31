package Marco2.Trabalho2;

public class Palindrome {
    private char[] pilha;
    private int top;

    public Palindrome() {
        pilha = new char[100];
        top = -1;
    }

    public boolean isPalindrome(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            push(c);
        }

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            char stackTop = pop();
            if (c != stackTop) {
                return false;
            }
        }

        return true;
    }

    public void push(char c) {
        pilha[++top] = c;
    }

    public char pop() {
        return pilha[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printPilha() {
        for (int i = 0; i <= top; i++) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
