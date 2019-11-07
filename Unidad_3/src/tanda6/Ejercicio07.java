package tanda6;

public class Ejercicio07 {

	public static void main(String[] args) {
		// series
		int inicio, valor, operador;
		boolean operacion = true;
		do {
			System.out.println("Introduce el número de inicio, tambien sera el numero de valores");
			inicio = Consola.leeInt();
		} while (inicio <= 0);
		valor = inicio;
		operador = 1;

		System.out.print(valor + "\t");
		valor -= operador;
		operador += 1;
		while (valor < inicio) {
			if (valor >= 0)
				System.out.print(valor + "\t");

			if (operacion) {
				valor -= operador;
				operador += 1;
			}

			else {
				valor += operador;
				operador -= 1;
			}
			if (valor <= 0) {
				operacion = false;
				operador -= 1;

			}

		}
		System.out.print(valor + "\t");

	}

}
