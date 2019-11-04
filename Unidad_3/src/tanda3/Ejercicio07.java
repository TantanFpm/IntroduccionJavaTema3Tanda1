package tanda3;

public class Ejercicio07 {

	public static void main(String[] args) {
		/**
		 * Programa que indique si el numero de una tarjeta de credito es correcto segun
		 * unas claces dadas en el enunciado
		 */
		int numero, sumaDigitosPorPeso=0, digito, aux;
		boolean peso = false;
		System.out.println("Introduce el número de la tarjeta de credito");
		numero = Consola.leeInt();
		aux = numero;

		while (aux >= 1) {
			digito = aux % 10;
			if (peso == false)
				digito *= 1;
			else
				digito *= 2;
			if (digito > 9)
				digito -= 9;
			sumaDigitosPorPeso+=digito;
			
			if(peso==false)
				peso=true;
			else
				peso=false;
			aux = aux / 10;
		}
		if(sumaDigitosPorPeso%10==0)
			System.out.println("El número de la tarjeta " + numero + " es correcto");
		else
			System.out.println("El número de la tarjeta " + numero + " no es correcto");

	}

}
