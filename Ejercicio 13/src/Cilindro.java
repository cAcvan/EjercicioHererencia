public class Cilindro extends Circulo {
    private double alt;

    public Cilindro(double radio, double alt) {
        super(radio);
        this.alt = (alt < 0) ? 0 : alt;
    }

    public double getAltura() {
        return alt;
    }

    public double getVolumen() {
        double areaCirculo = super.getArea();
        return areaCirculo * alt;
    }
}