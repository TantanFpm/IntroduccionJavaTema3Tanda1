package tanda4;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Rombo
		int filas, columnasBlanco = 1, columnasEscritas = 1;
		do {
			System.out.println(
					"Vamos a hacer un rombo, introduce el n�mero de filas que quieres que tenga, debe ser impar");
			filas = Consola.leeInt();
		} while (filas % 2 == 0 || filas <= 0);

		for (int i = 1; i <= filas; i++) {

			if (i <= filas / 2 + 1) {
				columnasBlanco = (filas / 2 + 1) - i;
				for (int j = 1; j <= columnasBlanco; j++) {
					System.out.print(" \t");

				}
				if (i % 2 != 0) {
					for (int j = 1; j <= columnasEscritas; j++) {
						if (j % 2 != 0)
							System.out.print("Y\t");
						else
							System.out.print("X\t");
					}
				} else {
					for (int j = 1; j <= columnasEscritas; j++) {
						if (j % 2 != 0)
							System.out.print("X\t");
						else
							System.out.print("Y\t");
					}
				}
				columnasEscritas += 2;

			} else {
				if ((i == (filas / 2) + 2)) {
					columnasBlanco = 1;
					columnasEscritas-=4;
				}else {
					columnasEscritas-=2;
				}
					
				
				for (int j = 1; j <= columnasBlanco; j++) {
					System.out.print(" \t");

				}
				if (i % 2 != 0) {
					for (int j = 1; j <= columnasEscritas; j++) {
						if (j % 2 != 0)
							System.out.print("Y\t");
						else
							System.out.print("X\t");
					}
				} else {
					for (int j = 1; j <= columnasEscritas; j++) {
						if (j % 2 != 0)
							System.out.print("X\t");
						else
							System.out.print("Y\t");
					}
				}
				
				columnasBlanco+=1;

			}
			System.out.print("\n");
		}

	}

}
