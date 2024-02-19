package ejemploJava;

public class DosDimensiones {
	double base;
	double altura;
	
	public DosDimensiones(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	void mostrarDimension() {
		System.out.println("La base es: " + this.base + " y la altura es: " + this.altura);
	}
}
