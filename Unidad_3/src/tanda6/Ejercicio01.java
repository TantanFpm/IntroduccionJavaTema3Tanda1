package tanda6;

import tanda3.Consola;

public class Ejercicio01 {

	public static void main(String[] args) {
		// serie
		int n, valor, inicio=1;
		do {
			System.out.println("Cuantos números quieres que tenga la serie");
			n=Consola.leeInt();
		} while (n<=0);
		valor=inicio;
		for(int i=1; i<=n; i++) {
			System.out.print(valor + "\t");
			valor*=i;
		}

	}

}
