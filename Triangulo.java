public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;

    public Triangulo (String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String nombre, double ladoA,double ladoB, double base) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea(){
        double area = (this.base * this.altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = ladoA + ladoB + base;
        return perimetro;
    }
    

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + ", lado1=" + ladoA + ", lado2=" + ladoB + "]";
    }

    
}
