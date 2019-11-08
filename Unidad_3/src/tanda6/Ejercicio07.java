package tanda6;

public class Ejercicio07 {

	public static void main(String[] args) {
		// series
		int inicio, valor, operador;

		do {
			System.out.println("Introduce el número de inicio, tambien sera el numero de valores");
			inicio = Consola.leeInt();
		} while (inicio <= 0);
		valor = inicio;
		operador = 1;

		System.out.print(valor + "\t");
		valor -= operador;
		operador += 1;
		while (valor > 0) {
			System.out.print(valor + "\t");
			valor -= operador;
			operador += 1;
		}
		if(valor>=0)
			System.out.print(valor+"\t");
		else {
			operador -= 1;
			valor += operador;
		}
		operador -= 1;
		valor += operador;
		
		while (valor < inicio) {
			System.out.print(valor + "\t");

			operador -= 1;
			valor += operador;

		}
		System.out.print(valor +"\t");

	}

}
