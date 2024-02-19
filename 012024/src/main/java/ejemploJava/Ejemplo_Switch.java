package ejemploJava;

public class Ejemplo_Switch {

	public static void main(String[] args) {
		int i = 25;
		
		switch(i) {
		case 1:
			System.out.println("i es 1");
			break;
		
		case 2:
			System.out.println("i es 2");
			break;
			
		case 3:
			System.out.println("i es 3");
			break;
			
		default:
			System.out.println("Valor por defecto padre... si sae");
			break;
		
		}
	}

}
