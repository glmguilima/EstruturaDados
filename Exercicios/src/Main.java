public class Main {
    public static void main(String[] args) {
        
       double Xa,Xb,Ya,Yb;
       Xa=0;
       Xb=Math.sqrt(2);
       Ya=0;
       Yb=Math.sqrt(2); //Lados iguais então a resposta tem que ser a diagonal do lado d= l * 2^1/2. logo a resposta esperada é 2.

       DistanciaPontosCartesianos distanciaPontosCartesianos = new DistanciaPontosCartesianos(Xa,Xb,Ya,Yb);

       double distancia = distanciaPontosCartesianos.calculaDistancia();
       System.out.println(distancia);




    }
}