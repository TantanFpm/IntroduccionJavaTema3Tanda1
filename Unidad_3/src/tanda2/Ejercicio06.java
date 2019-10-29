package tanda2;

import java.awt.PageAttributes.MediaType;

public class Ejercicio06 {
	/**
	 * Programa que pida los datos de N(constante) familias, solicitando, por cada
	 * una, el número de hijos y salario, Este programa calculará las tasa a pagar
	 * al ayuntamiento 10% de sueldo. Si hay uno o dos hijos se aplicará un 5% de
	 * descuento sobre la tasa y si hay tres o más hijos, un 10%. Además visualiza
	 * la media de sueldo de las familias numerosas, el sueldo máximo de las
	 * familias sin hijos y el sueldo mínimo.
	 * 
	 */
	public static void main(String[] args) {
		final int N = 5;
		double sueldo, sueldoMinimo = Double.MAX_VALUE, totalSueldoFamiliaNumerosa = 0, mediaSueldoFamNumerosa,
				maxSueldoFamSinHijos = Double.MIN_VALUE, descuento, tasa;
		int numHijos, contFamiliaNumerosa = 0, contFamSinHijos = 0;

		System.out.println("Vamos a pedir los datos de " + N
				+ " familias para calcular las tasas correspondientes y otros datos de interés");

		for (int i = 1; i <= N; i++) {
			do {
				System.out.println("¿Cuál es el salario familiar?");
				sueldo = Consola.leeDouble();
			} while (sueldo <= 0);
			do {
				System.out.println("Introduzca el número de hijos");
				numHijos = Consola.leeInt();
			} while (numHijos < 0);

			// Calculamos las tasas
			if (numHijos == 0) {
				tasa = sueldo * 0.10;
				contFamSinHijos += 1;
				// Buscamos el sueldo máximo de las familias sin hijos
				if (sueldo > maxSueldoFamSinHijos)
					maxSueldoFamSinHijos = sueldo;
			} else if (numHijos < 3)
				tasa = (sueldo * 0.10) * 0.95;
			else {
				tasa = (sueldo * 0.10) * 0.90;
				// guardamos datos para calcular la media salarial de las familias numerosas
				contFamiliaNumerosa += 1;
				totalSueldoFamiliaNumerosa += sueldo;
			}

			System.out.println("La tasa a pagar será " + tasa + "€");

			// Calculamos el sueldo mínimo
			if (sueldo < sueldoMinimo)
				sueldoMinimo = sueldo;

		}
		
		System.out.println("\n");

		if (contFamiliaNumerosa != 0) {
			mediaSueldoFamNumerosa = totalSueldoFamiliaNumerosa / contFamiliaNumerosa;
			System.out.println("El salario medio de las familias numerosas es " + mediaSueldoFamNumerosa);
		} else {
			System.out.println(
					"No hay familias numerosas, de tres hijos o más, por lo que no podemos calcular la media.");
		}
		if (contFamSinHijos != 0)
			System.out.println("El sueldo máximo de las familias sin hijos es " + maxSueldoFamSinHijos);
		else
			System.out.println("No hay familias sin hijos");
		System.out.println("El sueldo mínimo es " + sueldoMinimo + "€");

	}

}
