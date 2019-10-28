 package tanda2;

public class Ejercicio03 {
	/**
	 * Programa que calcula los n primeros numeros (n se pide por teclado) de una
	 * serie a(1)=0, a(2)=1, a(n)=3*a(n-1)+2*a(n-2)
	 */
	public static void main(String[] args) {
		int numero1, numero2, numero3, totalNumeros;
		do {
			System.out.println("Vamos a hacer una serie, introduce la cantidad de números que quieres visualizar");
			totalNumeros = Consola.leeInt();
		} while (totalNumeros < 0);

		numero1 = 0;
		numero2 = 1;
		System.out.print(numero1 + "\t" + numero2 + "\t");
		for (int i = 3; i <= totalNumeros; i++) {
			numero3 = 3 * numero2 + 2 * numero1;

			numero1 = numero2;
			numero2 = numero3;
			System.out.print(numero3 + "\t");
		}
		System.out.println();
	}

}
