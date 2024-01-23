public class Circulo {
    private double r;

    public Circulo(double radio) {
        this.r = (radio < 0) ? 0 : radio;
    }

    public double getRadio() {
        return r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

}


