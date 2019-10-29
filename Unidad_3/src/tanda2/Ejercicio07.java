package tanda2;

public class Ejercicio07 {
	/**
	 * programa que pide datos para diez personas (sexo, edad, ciudad, coeficiente
	 * intelectual. Desúes comparará con la media de su ciudad y sexo. Además
	 * visualizará el coeficiente máximo de los hombres de Sheffield de entre 20 y
	 * 30 años y el coeficiente medio de las personas de Manchester
	 */
	public static void main(String[] args) {
		final int PERSONAS = 10;
		final int MEDIACIMUJERMANCHESTER = 102, MEDIACIMUJERSHEFFIELD = 106, MEDIACIHOMBREMANCHESTER = 101,
				MEDIACIHOMBRESHEFFIELD = 105;
		int edad, cI, cIMaxVeinteañerosHombSheffield = Integer.MIN_VALUE, ciMedioManchester, totalCIManchester = 0,
				contPersonasManchester = 0;
		char sexo, ciudad;

		System.out.println("Vamos a pedir datos de " + PERSONAS
				+ " personas para comparar su coeficiente intelectual a la media de sus ciudades");

		for (int i = 1; i <= PERSONAS; i++) {
			do {
				System.out.println("Introduce el sexo de la persona");
				sexo = Consola.leeChar();
			} while (sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm');

			do {
				System.out.println("¿Cuál es su edad?");
				edad = Consola.leeInt();
			} while (edad < 0 || edad > 150);

			do {
				System.out.println("Introduce la ciudad de procedencia");
				ciudad = Consola.leeChar();
			} while (ciudad != 'S' && ciudad != 's' && ciudad != 'M' && ciudad != 'm');

			do {
				System.out.println("Introduce el coeficiente intelectual");
				cI = Consola.leeInt();
			} while (cI < 50 || cI > 250);

			if (ciudad == 'M' || ciudad == 'm') {
				if (sexo == 'M' || sexo == 'm') {
					if (cI < MEDIACIMUJERMANCHESTER)
						System.out.println("Su coeficiente intelectual está por debajo de las mujeres de Manchester \n");
					else if (cI == MEDIACIMUJERMANCHESTER)
						System.out.println("Su coeficiente intelectual es el de la media \n");
					else
						System.out.println("Fu CI está por encima de la media de las mujeres de su ciudad \n");
				} else {
					if (cI < MEDIACIHOMBREMANCHESTER)
						System.out.println("Su coeficiente intelectual está por debajo de los hombres de Manchester \n");
					else if (cI == MEDIACIHOMBREMANCHESTER)
						System.out.println("Su coeficiente intelectual es el de la media \n");
					else
						System.out.println("Fu CI está por encima de la media de los hombres de su ciudad \n");

				}
				totalCIManchester += cI;
				contPersonasManchester += 1;
			} else {
				if (sexo == 'M' || sexo == 'm') {
					if (cI < MEDIACIMUJERSHEFFIELD)
						System.out.println("Su coeficiente intelectual está por debajo de las mujeres de Sheffield \n");
					else if (cI == MEDIACIMUJERSHEFFIELD)
						System.out.println("Su coeficiente intelectual es el de la media \n");
					else
						System.out.println("Fu CI está por encima de la media de las mujeres de su ciudad \n");
				} else {
					if (cI < MEDIACIHOMBRESHEFFIELD)
						System.out.println("Su coeficiente intelectual está por debajo de los hombres de Sheffield \n");
					else if (cI == MEDIACIHOMBRESHEFFIELD)
						System.out.println("Su coeficiente intelectual es el de la media \n");
					else
						System.out.println("Fu CI está por encima de la media de los hombres de su ciudad \n");
					if ((edad >= 20 && edad <= 30) && (cI > cIMaxVeinteañerosHombSheffield)) {
						cIMaxVeinteañerosHombSheffield = cI;
					}
				}
			}
			System.out.println("\n");

		}
		System.out.println("El CI máximo entre los hombres de veinte a treinta años de Sheffield es "
				+ cIMaxVeinteañerosHombSheffield);

		if (contPersonasManchester > 0) {
			ciMedioManchester = totalCIManchester / contPersonasManchester;
			System.out.println("El coeficiente medio de las personas auditadas de Manchester es " + ciMedioManchester);

		} else
			System.out.println("No hemos entrevistado a ninguna persona de Manchester");
	}

}
