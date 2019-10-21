package tanda3;

public class Ejercicio02 {

	public static void main(String[] args) {
		char opcion;
		int filas, contFila, contColumna, inicioFila, numero, posiblePrimo, cont, diferencia, inicioDiferencia,
				incremento;
		final int COLUMNA = 5;
		boolean esPrimo;

		do {
			System.out
					.println("Introduce una opción:" + "\n A:serie \n B:Averiguar si un número es primo \n C:Salir \n");
			opcion = Consola.leeChar();
		} while (opcion != 'A' && opcion != 'a' && opcion != 'B' && opcion != 'b' && opcion != 'C' && opcion != 'c');

		while (opcion != 'C' && opcion != 'c') {
			if (opcion == 'A' || opcion == 'a') {
				System.out.println("Introduce el numero de filas que quieres que tenga la serie");
				filas = Consola.leeInt();
				contFila = 1;
				inicioFila = 10;
				inicioDiferencia = 2;
				incremento = 10;
				while (contFila <= filas) {
					numero = inicioFila;
					inicioFila = inicioFila + incremento;
					incremento = incremento + 10;
					contColumna = 1;
					diferencia = inicioDiferencia;
					while (contColumna <= COLUMNA) {
						System.out.print(numero + "\t");

						if (contFila % 2 != 0) {
							numero = numero - contFila;
							contColumna = contColumna + 1;
						} else {
							numero = numero - diferencia;
							diferencia = diferencia * 2;
							contColumna = contColumna + 1;
						}

					}
					if (contFila % 2 == 0)
						inicioDiferencia = inicioDiferencia + 1;
					contFila = contFila + 1;
					System.out.println();
				}
			}else {
				do {
					System.out.println("Introduce un número positivo");
					posiblePrimo=Consola.leeInt();
				} while (posiblePrimo<0);
				esPrimo=true;
				cont=2;
				while((esPrimo)&& (cont<posiblePrimo)){
					if(posiblePrimo%cont==0) 
						esPrimo=false;
					cont=cont+1;
				}
				if(esPrimo)
					System.out.println("El número es primo");
				else
					System.out.println("El numero no es primo");
				
			}

			do {
				System.out.println(
						"Introduce una opción:" + "\n A:serie \n B:Averiguar si un número es primo \n C:Salir \n");
				opcion = Consola.leeChar();
			} while (opcion != 'A' && opcion != 'a' && opcion != 'B' && opcion != 'b' && opcion != 'C'
					&& opcion != 'c');
		}

	}
}
