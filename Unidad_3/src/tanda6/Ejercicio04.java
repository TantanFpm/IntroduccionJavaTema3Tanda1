package tanda6;

import tanda3.Consola;

public class Ejercicio04 {

	public static void main(String[] args) {
		// serie
		int n, valor=1, multiplicando=2;
		do {
			System.out.println("Cuantos números quieres que tenga la serie");
			n=Consola.leeInt();
		} while (n<=0);
		
		for(int i=1; i<=n; i++) {
			System.out.print(valor + "\t");
			if(i%2!=0) {
				
				valor*=multiplicando;
				multiplicando+=1;
			}else {
				
				valor-=1;
			}
			
		}

	}

}
