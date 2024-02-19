package ejemploJava;

public class Lados {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(4.0, 4.0);
		
		t1.estilo = "Estilo 1";
		
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su área es de: " + t1.area() + "\n");
		
		Triangulo t2 = new Triangulo(8.0, 12.0);
		
		t2.estilo = "Estilo 2";
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su área es de: " + t2.area());

	}

}
