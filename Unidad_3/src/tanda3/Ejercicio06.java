package tanda3;

public class Ejercicio06 {

	public static void main(String[] args) {
		/**
		 * Dado el mes y el día de la semana en que comienza (1:lunes, 2:martes...)
		 * visualizaremos un calendario
		 */
		int mes, diaInicio, totalDias, iteradorDias = 1;
		do {
			System.out.println("Introduce el número de mes");
			mes = Consola.leeInt();
		} while (mes < 1 || mes > 12);
		do {
			System.out.println("Introduce el día de la semana en el que empieza el mes");
			diaInicio = Consola.leeInt();
		} while (diaInicio < 1 || diaInicio > 7);
		switch (mes) {
		case 1:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Enero");

				if (filas == 2)
					System.out.println("L\tM\tX\tJ\tV\tS\tD\t");

				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
				System.out.println();
			}
			break;
		case 2:
			totalDias = 28;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Febrero");
				if (filas == 2)
					System.out.println("L\tM\tX\tJ\tV\tS\tD\t");
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
				System.out.println();
			}

			break;
		case 3:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Marzo");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");

				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 4:
			totalDias = 30;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Abril");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");

				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 5:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Mayo");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");

				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 6:
			totalDias = 30;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Junio");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 7:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Julio");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 8:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Agosto");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 9:
			totalDias = 30;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Septiembre");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 10:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Octubre");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 11:
			totalDias = 30;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Noviembre");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		case 12:
			totalDias = 31;
			for (int filas = 1; filas <= 8; filas++) {
				if (filas == 1)
					System.out.println("\t \t Diciembre");
				if (filas == 2)
					System.out.print("L\tM\tX\tJ\tV\tS\tD\t");
				System.out.println();
				for (int columnas = 1; columnas <= 7 && filas > 2; columnas++) {
					if (filas == 3 && columnas < diaInicio)
						System.out.print("  \t");
					else if (iteradorDias <= totalDias) {
						System.out.print(iteradorDias + "\t");
						iteradorDias += 1;
					}
				}
			}

			break;
		default:
			System.out.println("El numero de mes debe estar comprendido entre 1 y 12 porque sólo hay doce meses");
			break;
		}

	}

}
