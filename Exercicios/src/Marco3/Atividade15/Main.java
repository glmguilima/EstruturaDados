package Marco3.Atividade15;

public class Main {
    public static void main(String[] args) {

        ABB arv = new ABB();
        for (int i = 0; i < 11; i++) {
            arv.add(i + 2);
            arv.add((i * i) % (i + 1));
        }
        arv.imprime();

        System.out.println("Removido!");
        arv.imprime();
    }
}
