package ExerPraticosP1;

//Exercício 12
public class SomaInteiros {
    public static int somaint(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + somaint(n - 1);
        }
    }

}