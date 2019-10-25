package tanda1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Realizar un programa que pida un número y visualice el número de dígitos que
		// tiene.

		int numero, aux, contDigitos;

		System.out.println("Introduce un número");
		numero = Consola.leeInt();

		aux = numero;
		if (numero < 0)
			aux *= -1;
		contDigitos = 0;
		while (aux > 0) {
			aux /= 10;
			contDigitos += 1;
		}

		System.out.println("El número tiene " + contDigitos +" cifras");

	}

}
