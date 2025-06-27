public class Circulo extends FiguraGeometrica {
    private double radio;
    private final double PI = 3.1416;  //Constante 

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //se gneera un getter para consultar el valor constante de PI
    //public void setPI(double PI) {
    //    this.PI = PI;
    //}

    // Este metodo sobre-escribe el heredado de FiguraGeometrica
    // Conserva la misma firma, pero su comportamiento es dieferente
    @Override
    public double getArea(){
        double area = this.PI * this.radio * this.radio;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo [radio=" + radio + "]";
    }
    
}
