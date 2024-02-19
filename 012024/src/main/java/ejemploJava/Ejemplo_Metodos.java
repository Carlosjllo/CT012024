package ejemploJava;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		 int resul1 = suma(10,20,45);
		 
		 System.out.println(resul1);
		 
		 System.out.println(carros(1));
		 
	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		
		return d;
	}
	
	public static String carros(int a) {
		String[] cars = {"Ford", "Mazda", "BMW"};
		
		return cars[a];
	}
}
