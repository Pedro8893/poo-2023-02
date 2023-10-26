abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Quadrado extends Figura {
    private double lado;

    public Quadrado() {
        this.lado = 0;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Triangulo extends Figura {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.lado1 = 0;
        this.lado2 = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }
}

class Circulo extends Figura {
    private double raio;

    public Circulo() {
        this.raio = 0;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends Quadrado {
    private double altura;

    public Retangulo() {
        super();
        this.altura = 0;
    }

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getLado() * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (getLado() + altura);
    }
}

public class CalculadoraArea {
    public static double calcularAreaTotal(Figura[] formas) {
        double areaTotal = 0;
        for (Figura forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(2, 3);
        Circulo circulo = new Circulo(4);
        Triangulo triangulo = new Triangulo(1, 4, 2, 7);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());

        Figura[] figuras = {quadrado, retangulo, circulo, triangulo};
        System.out.println("Área Total das Figuras: " + calcularAreaTotal(figuras));
    }
}