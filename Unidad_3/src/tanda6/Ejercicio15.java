package tanda6;

public class Ejercicio15 {

	public static void main(String[] args) {
		// letras mayusculas ascii del 65 al 90 incluidos 25
		int num, espacioBlanco, espacioEscrito, espacioBlancoBorde, espacioBlancoCentro, valor;
		char a = 65;
		do {
			System.out.println("Introduce un numero");
			num = Consola.leeInt();
		} while (num <= 0 || num > 25);

		System.out.println("\nFigura 1 \n");

		espacioBlancoCentro = 1;
		for (int i = 1; i <= num; i++) {
			espacioBlancoBorde = num - i;
			if (i == 1) {
				for (int j = 1; j <= espacioBlancoBorde; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
			} else {
				for (int j = 1; j <= espacioBlancoBorde; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
				for (int j = 1; j <= espacioBlancoCentro; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
				espacioBlancoCentro += 2;
			}

			System.out.println();

		}
		espacioBlancoCentro -= 4;
		for (int i = 1; i < num; i++) {
			espacioBlancoBorde = i;
			if (i == num - 1) {
				for (int j = 1; j <= espacioBlancoBorde; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
			} else {
				for (int j = 1; j <= espacioBlancoBorde; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
				for (int j = 1; j <= espacioBlancoCentro; j++) {
					System.out.print("  ");
				}
				System.out.print("X ");
				espacioBlancoCentro -= 2;
			}

			System.out.println();
		}

		System.out.println("\nFigura 2 \n");
		espacioEscrito = 1;
		for (int i = 1; i <= num; i++) {
			espacioBlanco = num - i;
			for (int j = 1; j <= espacioBlanco; j++) {
				System.out.print(" \t");
			}
			for (int j = 1; j <= espacioEscrito; j++) {

				System.out.print(a + "\t");
				if (j < espacioEscrito / 2 + 1)
					a += 1;
				else
					a -= 1;
			}
			System.out.println();
			espacioEscrito += 2;
			a = 65;

		}

		System.out.println("\nFigura 3 \n");
		espacioEscrito = num - 1;
		espacioBlancoCentro = 1;
		valor = 1;
		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				for (int j = 1; j <= espacioEscrito; j++) {
					System.out.print(valor + " ");
					valor += 1;

				}
				System.out.print(valor + " ");
				valor -= 1;
				for (int j = 1; j <= espacioEscrito; j++) {
					System.out.print(valor + " ");

					valor -= 1;

				}
				System.out.println();
			} else {
				valor = 1;
				for (int j = 1; j <= espacioEscrito; j++) {
					System.out.print(valor + " ");
					valor += 1;

				}
				if (i == 1)
					System.out.print(valor + " ");
				valor -= 1;
				if (i != 1) {

					for (int j = 1; j <= espacioBlancoCentro; j++) {
						System.out.print("  ");
					}
				}
				for (int j = 1; j <= espacioEscrito; j++) {
					System.out.print(valor + " ");

					valor -= 1;

				}
				System.out.println();
				espacioBlancoCentro += 2;
				espacioEscrito -= 1;
				valor = 1;
			}

		}

		System.out.println("\nFigura 4 \n");
		espacioBlanco = 0;
		espacioEscrito = num * 2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < espacioBlanco; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < espacioEscrito; j++) {
				if (j % 2 != 0)
					System.out.print("  ");
				else
					System.out.print("# ");
			}
			espacioEscrito -= 2;
			espacioBlanco += 1;
			System.out.println();
		}

	}
	
}
