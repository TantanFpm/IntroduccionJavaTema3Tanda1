package tanda1;

import java.util.Calendar;

public class Ejercicio07 {
//esta mal
	public static void main(String[] args) {
		// Programa que calcule cuántos días ha vivido una persona (sin considerar los
		// años bisiestos)
		int diaNacimiento, mesNacimiento, anioNacimiento, diasVividos, diaActual, mesActual, anioActual, contadorMeses,
				contadorAnios, aniosIntervalo;
		// Calcularlo (después)con bisisestos con el algoritmo que creamos en
		// pseudocodigo, dos bucles.

		System.out.println("Introduce el dia de nacimiento");
		diaNacimiento = Consola.leeInt();
		System.out.println("Introduce el mes de nacimiento");
		mesNacimiento = Consola.leeInt();
		System.out.println("Introduce el año de nacimiento");
		anioNacimiento = Consola.leeInt();
		diasVividos = 0;

		/*
		 * Importamos la clase Calendar y creamos una instancia para poder obtener el
		 * día, mes y año actual por separado.
		 */

		Calendar c1 = Calendar.getInstance();
		diaActual = (c1.get(Calendar.DATE));
		mesActual = (c1.get(Calendar.MONTH)) + 1;
		anioActual = (c1.get(Calendar.YEAR));

		// Ahora acumulamos los días de los años intermedios
		aniosIntervalo = anioActual - anioNacimiento - 1;
		for (contadorAnios = 1; contadorAnios <= aniosIntervalo; contadorAnios++) {
			for (contadorMeses = 1; contadorMeses <= 12; contadorMeses++) {
				if (contadorMeses % 2 != 0) {
					if (contadorMeses <= 7) {
						diasVividos = diasVividos + 31;
					} else {
						diasVividos = diasVividos + 30;
					}

				} else if (contadorMeses % 2 == 0) {
					if (contadorMeses == 2) {
						diasVividos = diasVividos + 28;
					} else if (contadorMeses <= 6) {
						diasVividos = diasVividos + 30;
					} else {
						diasVividos = diasVividos + 31;
					}

				}

			}
			if ((contadorAnios % 400 == 0) || (contadorAnios % 4 == 0 && !(contadorAnios % 100 == 0))) {
				diasVividos = diasVividos + 1;
			}
		}
		// Acumular los días que ha vivido en el año actual
		if (anioNacimiento != anioActual) {
			diasVividos += diaActual;
			for (contadorMeses = 1; contadorMeses < mesActual; contadorMeses++) {
				if (contadorMeses % 2 != 0) {
					if (contadorMeses <= 7) {
						diasVividos = diasVividos + 31;
					} else {
						diasVividos = diasVividos + 30;
					}

				} else if (contadorMeses % 2 == 0) {
					if (contadorMeses == 2) {
						diasVividos = diasVividos + 28;
					} else if (contadorMeses <= 6) {
						diasVividos = diasVividos + 30;
					} else {
						diasVividos = diasVividos + 31;
					}

				}

			}
			if ((anioActual % 400 == 0) || (anioActual % 4 == 0 && !(anioActual % 100 == 0)) && (mesActual > 2)) {
				diasVividos = diasVividos + 1;
			}

			// Acumular los días vividos en el año de nacimiento

			for (contadorMeses = 12; contadorMeses > mesNacimiento; contadorMeses--) {
				if (contadorMeses % 2 != 0) {
					if (contadorMeses <= 7) {
						diasVividos = diasVividos + 31;
					} else {
						diasVividos = diasVividos + 30;
					}

				} else if (contadorMeses % 2 == 0) {
					if (contadorMeses == 2) {
						diasVividos = diasVividos + 28;
					} else if (contadorMeses <= 6) {
						diasVividos = diasVividos + 30;
					} else {
						diasVividos = diasVividos + 31;
					}

				}

			}
			switch (mesNacimiento) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasVividos = diasVividos + (31 - diaNacimiento) + 1;
				break;
			case 2:
				diasVividos = diasVividos + (28 - diaNacimiento) + 1;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				diasVividos = diasVividos + (30 - diaNacimiento) + 1;
				break;

			}
			if (mesNacimiento < 3) {
				if ((anioNacimiento % 400 == 0)
						|| (anioNacimiento % 4 == 0 && !(anioNacimiento % 100 == 0)) && (mesNacimiento <= 2)) {
					diasVividos = diasVividos + 1;
				}
			}

		} else {
			if (mesNacimiento == mesActual)
				diasVividos = diaActual - diaNacimiento;
			else {
				for (contadorMeses = mesNacimiento; contadorMeses <= mesActual; contadorMeses++) {
					switch (contadorMeses) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						diasVividos = diasVividos + (31 - diaNacimiento) + 1;
						break;
					case 2:
						diasVividos = diasVividos + (28 - diaNacimiento) + 1;
						break;

					case 4:
					case 6:
					case 9:
					case 11:
						diasVividos = diasVividos + (30 - diaNacimiento) + 1;
						break;

					}
				}
			}
		}
		System.out.println(diasVividos);

	}
}
	    
	    
	   

