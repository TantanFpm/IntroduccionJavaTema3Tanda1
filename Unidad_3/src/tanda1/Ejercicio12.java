package tanda1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Realizar un programa que pida un n�mero y visualice el n�mero de d�gitos que
		// tiene.

		int numero, aux, contDigitos;

		System.out.println("Introduce un n�mero");
		numero = Consola.leeInt();

		aux = numero;
		if (numero < 0)
			aux *= -1;
		contDigitos = 0;
		while (aux > 0) {
			aux /= 10;
			contDigitos += 1;
		}

		System.out.println("El n�mero tiene " + contDigitos +" cifras");

	}

}
