package tanda3;

public class Ejercicio03 {
	/**
	 * Programa que calcula la media de los número primos comprendidos entre dos
	 * numeros introducidos por teclado. Ambos números son enteros mayores que ceros
	 * y deben estar en orden, el primero menor que el segundo
	 * 
	 */
	public static void main(String[] args) {
		int num1, num2, totalPrimos = 0, contPrimos = 0;
		double mediaPrimos;
		boolean esPrimo = true;
		do {
			System.out.println(
					"Vamos a calcular la media de los numeros primos comprendidos entre dos números. \n Introduce un número");
			num1 = Consola.leeInt();
			do {
				System.out.println("Introduce el segundo número, recuerda que debe ser mayor que el anterior");
				num2 = Consola.leeInt();
			} while (num2 <= num1);
		} while (num1 <= 0);

		for (int i = num1; i <= num2; i++) {
			int j = 2;
			while (i > 2 && j < i && esPrimo == true) {
				if (i % j == 0)
					esPrimo = false;
				j++;
			}
			if (esPrimo) {
				totalPrimos += i;
				contPrimos += 1;
			}
			esPrimo = true;
		}

		mediaPrimos = totalPrimos / (double) contPrimos;
		System.out.println(
				"La media de los números primos comprendidos entre " + num1 + " y " + num2 + " es: " + mediaPrimos);

	}

}
