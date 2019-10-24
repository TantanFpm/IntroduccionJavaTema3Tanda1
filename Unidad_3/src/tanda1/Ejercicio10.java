package tanda1;

public class Ejercicio10 {

	public static void main(String[] args) {
		/**
		 * Programa que obtenga el máximo comun divisor de dos números enteros
		 * utilizando el algoritmo de Euclides
		 */
		double numerador, divisor, resto, aux, mcd=1;
		
		do {
			System.out.println("Introduce el primer numero");
			numerador = Consola.leeDouble();
		} while (numerador < 0);

		do {
			System.out.println("Introduce el segundo numero, el divisor no puede ser 0");
			divisor = Consola.leeDouble();
		} while (divisor < 0);

		resto = numerador % divisor;
		if (resto == 0)
			mcd = divisor;
		else {

			while (resto != 0) {
				aux = resto;
				resto = divisor % aux;
				if (resto == 0)
					mcd = aux;
				
			}

		}
		System.out.println(mcd);

	}

}
