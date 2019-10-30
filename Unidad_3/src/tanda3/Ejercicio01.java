package tanda3;

public class Ejercicio01 {
	/**
	 * Programa que pide datos de familias y visualiza comparaciones y estadistica.
	 */
	public static void main(String[] args) {
		int n, codigoFamilia, numHijo, edad, contHijoVaronPreadolescente = 0, edadMinimaFamilia = Integer.MAX_VALUE,
				maxHijos = Integer.MIN_VALUE, codigoMaxHijos = 0;
		double salario, salarioMedioFamNumerosa, totalSalarioFamNumerosa = 0, contFamNumerosa = 0;
		char sexo;

		do {
			System.out.println("¿Cuantas familias vamos a evaluar?");
			n = Consola.leeInt();

		} while (n < 0);

		for (int i = 1; i <= n; i++) {
			do {
				System.out.println("Introduce el código de la familia");
				codigoFamilia = Consola.leeInt();
			} while (codigoFamilia <= 0);
			do {
				System.out.println("Introduce salario");
				salario = Consola.leeDouble();
			} while (salario < 0);
			do {
				System.out.println("Introduce el número de hijos");
				numHijo = Consola.leeInt();
			} while (numHijo<0);
			for (int j = 1; j <= numHijo; j++) {
				do {
					System.out.println("Introduce la edad");
					edad = Consola.leeInt();
				} while (edad < 0 || edad > 100);

				do {
					System.out.println("Introduce el sexo");
					sexo = Consola.leeChar();
				} while (sexo != 'M' && sexo != 'm' && sexo != 'H' && sexo != 'h');
				if ((sexo == 'h' || sexo == 'H') && (edad >= 10 && edad <= 15))
					contHijoVaronPreadolescente += 1;
				if (edad < edadMinimaFamilia)
					edadMinimaFamilia = edad;

			}
			if (numHijo >= 3) {
				totalSalarioFamNumerosa += salario;
				contFamNumerosa += 1;
			}
			if (numHijo!=0 && numHijo > maxHijos) {
				maxHijos = numHijo;
				codigoMaxHijos = codigoFamilia;
			}

			System.out.println("La familia con codigo " + codigoFamilia + " tiene " + contHijoVaronPreadolescente
					+ " hijos varones de entre 10 y 15 años. \n");
			contHijoVaronPreadolescente = 0;
			if (numHijo!=0) {
				System.out.println("La edad mínima de los hijos de esta familia es " + edadMinimaFamilia + "\n");
				edadMinimaFamilia = Integer.MAX_VALUE;
			}
		}

		if (contFamNumerosa > 0) {
			salarioMedioFamNumerosa = totalSalarioFamNumerosa / contFamNumerosa;
			System.out.println("El salario medio de las familias numerosas es " + salarioMedioFamNumerosa);
		} else
			System.out.println("No hay familias numerosas, de tres hijos o más");

		if (codigoMaxHijos!=0) {
			System.out.println(
					"La familia con más hijos es la familia numero " + codigoMaxHijos + ", con " + maxHijos + " hijos");
		}else
			System.out.println("Ninguna familia tiene hijos");

	}

}
