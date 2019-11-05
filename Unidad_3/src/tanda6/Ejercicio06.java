package tanda6;

import tanda3.Consola;

public class Ejercicio06 {

	public static void main(String[] args) {
		// series
		int n, valorImpar=1, valorPar=1, sustraendo=1, multiplicando=5;
		do {
			System.out.println("Cuantos números quieres que tenga la serie");
			n=Consola.leeInt();
		} while (n<=0);
		
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				System.out.print(valorImpar + "\t");
				valorImpar*=multiplicando;
			}else {
				System.out.print(valorPar +"\t");
				valorPar-=sustraendo;
				sustraendo+=1;
			}
			
		}


	}

}
