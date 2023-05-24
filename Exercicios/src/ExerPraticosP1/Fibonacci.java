package ExerPraticosP1;

//Exercicio 3
public class Fibonacci {
    public static int calcularFibonacci(int n) {
        n=n-1; // isso foi feito pq o java considera o primeiro termo como posicao 0
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            n++;
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);

        }
    }
}
