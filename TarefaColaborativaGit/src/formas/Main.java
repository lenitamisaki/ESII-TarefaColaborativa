package formas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Retangulo r1 = new Retangulo(10, 15);
		System.out.println("Area: " + r1.calcularArea() + "\nPerimetro " + r1.calcularPerimetro());

		Circulo c1 = new Circulo(10);
		System.out.println("Area: " + c1.calcularArea() + "\nPerimetro " + c1.calcularPerimetro());
	}

}


