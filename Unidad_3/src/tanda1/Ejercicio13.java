package tanda1;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Programa que diga el valor de un digito, comenzando por la izquierda.

		int numero, aux, contDigitos, posicion, cifrasSobranDerecha, cifra;

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
		do {
			System.out.println("Introduce la posicion de la cifra que quieres saber, empezando por la izquierda");
			posicion = Consola.leeInt();
		} while ((posicion > contDigitos) || posicion < 0);

		cifra = numero;
		if (numero < 0)
			cifra *= -1;
		cifrasSobranDerecha = contDigitos - posicion;

		for (int i = 1; i <= cifrasSobranDerecha; i++) {
			cifra /= 10;
		}
		cifra %= 10;

		System.out.println("El dígito en la posición " + posicion + " del numero " + numero + " es " + cifra);

	}

}
