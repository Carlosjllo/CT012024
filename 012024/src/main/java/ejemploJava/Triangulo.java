package ejemploJava;

public class Triangulo extends DosDimensiones{
	String estilo;
	
	Triangulo(double base, double altura){
		super(base, altura);
	}
	
	double area() { 
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + this.estilo);
	}
}
