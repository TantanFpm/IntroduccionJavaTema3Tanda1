package tanda6;

import tanda3.Consola;

public class Ejercicio02 {

	public static void main(String[] args) {
		// serie
		int n, inicio=10, multiplicando=1;
		long valor;
		do {
			System.out.println("Cuantos números quieres que tenga la serie");
			n=Consola.leeInt();
		} while (n<=0);
		valor=inicio;
		for(int i=1; i<=n; i++) {
			System.out.print(valor + "\t");
			valor*=multiplicando;
			multiplicando*=2;
		}

	}

}
