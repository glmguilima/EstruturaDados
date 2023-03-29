public class DistanciaPontosCartesianos {
    private double xi,xf,yi,yf;

    public DistanciaPontosCartesianos(double xi, double xf, double yi, double yf){
        this.xi=xi;
        this.xf=xf;
        this.yi=yi;
        this.yf=yf;
    }
    public double distanciaX(){
        double distX= getXf()-getXi();
        return distX;
    }
    public double distanciaY(){
        double distY= getYf()-getYi();
        return distY;
    }


    public double calculaDistancia(){
        return Math.sqrt(Math.pow(distanciaX(),2)+Math.pow(distanciaY(),2));

    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXf() {
        return xf;
    }

    public void setXf(double xf) {
        this.xf = xf;
    }

    public double getYi() {
        return yi;
    }

    public void setYi(double yi) {
        this.yi = yi;
    }

    public double getYf() {
        return yf;
    }

    public void setYf(double yf) {
        this.yf = yf;
    }
}
