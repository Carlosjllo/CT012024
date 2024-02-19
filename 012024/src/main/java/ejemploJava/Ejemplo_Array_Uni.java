package ejemploJava;

import java.util.Scanner;

public class Ejemplo_Array_Uni {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String arr[] = new String[2];
		
		arr[0] = "ABC";
		arr[1] = "DEF";
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Posición: " + i + " valor: " + arr[i]);
		}
		
		int arreglo[] = new int[3];
		
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println("Numero: " + i);
			
			
		}

	}

}
