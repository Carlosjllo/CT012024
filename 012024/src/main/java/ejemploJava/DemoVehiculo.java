package ejemploJava;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de"
				+ rango + " kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);
		
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo(8);
		
		System.out.println("# Pasaajeros V1: " + v1.pasajeros);
		System.out.println("# Pasaajeros V2: " + v2.pasajeros);

	}

}
