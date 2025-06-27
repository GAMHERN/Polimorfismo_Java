public class TestingPolimorfismo {
    public static void main(String[] args) {
        FiguraGeometrica unafiguraGeometrica = new FiguraGeometrica("Rombo");
        System.out.println();
        unafiguraGeometrica.setArea(12.45);

        // Ejemplo de polimorfismo estatico:
        // el porgramador indica cual metodo usar segun los parametros que envie
        System.out.println(unafiguraGeometrica.toString());
        System.out.println("\nArea de la figura: " + unafiguraGeometrica.toString());

        Circulo circulo1 = new Circulo("\nCirculo", 10.5);

        // Ejemplo de polimorfismo dinamico:
        // Java detecta que objeto es para llamar al metodo apropiado
        double a = circulo1.getArea();
        circulo1.setArea(a);
        System.out.println("\nInfo del circulo1 : " + circulo1 );

        Triangulo triangulo1 = new Triangulo("\nTriangulo isosceles" , 10, 5);
        triangulo1.setLadoA(15);
        triangulo1.setLadoB(15);
        double b = triangulo1.getArea();
        triangulo1.setArea(b);
        double c = triangulo1.getPerimetro();
        triangulo1.setPerimetro(c);
        System.out.println("\nInfo del triangulo: " + triangulo1.toString() );

        //Triangulo triangulo2 = new Triangulo("Triangulo equilatero" , 20, 10);
        Triangulo triangulo2 = new Triangulo("\nTriangulo equilatero", 20,20, 20);
        triangulo2.setAltura(10);
        double d = triangulo2.getArea();
        triangulo2.setArea(d);
        double e = triangulo2.getPerimetro();
        triangulo2.setPerimetro(e);
        System.out.println("\nInfo del triangulo: " + triangulo2.toString() );
    }
}
