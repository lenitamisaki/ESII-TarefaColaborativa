package formas;

	public class Retangulo extends Forma {

		Retangulo(double base, double altura){
			super(base, altura);
		}
		
		double calcularPerimetro() {
			double perimetro = 2*(base+altura);
		return perimetro;	
		}
		
		double calcularArea() {
			double area = base*altura;
		return area;
		}

}
