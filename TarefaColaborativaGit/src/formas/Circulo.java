package formas;

public class Circulo extends Forma{
	
	Circulo(double diametro){
		super(diametro);
	}
	
	double calcularPerimetro() {
		double perimetro = (2* Math.PI * (diametro/2));
	return perimetro;
	}
	
	double calcularArea(){
		double area = Math.PI * Math.pow((diametro/2), 2);
	return area;
	}

}
