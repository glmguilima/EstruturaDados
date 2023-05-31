package Marco2.Atividade11;

public class App {
    public static void main(String[] args) {
    FilaVet fila = new FilaVet(4);
    fila.imprimir();
    fila.add("oi");
    fila.add(2);
    fila.add(3);
    fila.imprimir();
    fila.remove();
    fila.remove();
    fila.imprimir();
    }
}
