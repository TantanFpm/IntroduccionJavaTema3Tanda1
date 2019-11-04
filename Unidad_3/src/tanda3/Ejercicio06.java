package tanda3;

public class Ejercicio06 {

	public static void main(String[] args) {
		/**
		 * Dado el mes y el día de la semana en que comienza (1:lunes, 2:martes...)
		 * visualizaremos un calendario
		 */
		int mes, diaInicio, totalDias, totalSemana, iteradorDias=1;
		char nombreDia=' ';
		do {
			System.out.println("Introduce el número de mes");
			mes = Consola.leeInt();
			do {
				System.out.println("Introduce el día de la semana en el que empieza el mes");
				diaInicio = Consola.leeInt();
			} while (diaInicio < 1 || diaInicio > 7);
			switch (mes) {
			case 1:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Enero");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}
				break;
			case 2:
				totalDias = 28;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Febrero");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 3:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Marzo");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 4:
				totalDias = 30;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Abril");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 5:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Mayo");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 6:
				totalDias = 30;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Junio");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 7:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Julio");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 8:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Agosto");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 9:
				totalDias = 30;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Septiembre");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 10:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Octubre");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 11:
				totalDias = 30;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Noviembre");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			case 12:
				totalDias = 31;
				for (int filas = 1; filas <= 8; filas++) {
					if(filas==1)
						System.out.println("\t \t Diciembre");
					for (int i = 1; i <= 7 && filas == 2; i++) {
						switch (i) {
						case 1:
							nombreDia='L';
							break;
						case 2:
							nombreDia='M';
							break;
						case 3:
							nombreDia='X';
							break;
						case 4:
							nombreDia='J';
							break;
						case 5:
							nombreDia='V';
							break;
						case 6:
							nombreDia='S';
							break;
						case 7:
							nombreDia='D';
							break;

						}
						System.out.print( nombreDia + "\t");
					}
					System.out.println();
					for (int columnas = 1; columnas <= 7 && filas>2; columnas++) {
						if(filas == 3 && columnas<diaInicio)
							System.out.print("  \t");
						else if(iteradorDias<=totalDias) {
							System.out.print(iteradorDias + "\t");
							iteradorDias+=1;
						}
					}
				}

				break;
			default:
				System.out.println("El numero de mes debe estar comprendido entre 1 y 12 porque sólo hay doce meses");
				break;
			}
		} while (mes < 1 || mes > 12);

	}

}
