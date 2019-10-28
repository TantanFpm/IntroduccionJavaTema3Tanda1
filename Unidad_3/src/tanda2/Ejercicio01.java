package tanda2;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Calcular la suma y el producto de los numeros impares comprendidos entre dos
		// constantes
		final int LIMINF = 20, LIMSUP = 40;
		int totalSuma, iteradorImpar;
		long totalProducto;

		/**
		 * En vez de limitarme a sumar uno para que sea impar, ya que conozco el valor,
		 * hago este bucle por si se cambiase el valor de la constante
		 **/
		iteradorImpar = LIMINF;
		do {
			iteradorImpar += 1;
		} while (iteradorImpar % 2 == 0);
		totalProducto = 1;
		totalSuma = 0;
		while (iteradorImpar < LIMSUP) {
			totalSuma += iteradorImpar;
			totalProducto *= iteradorImpar;
			iteradorImpar += 2;

		}

		System.out.println("El total de la suma es " + totalSuma + "\n El producto es " + totalProducto);

	}

}
