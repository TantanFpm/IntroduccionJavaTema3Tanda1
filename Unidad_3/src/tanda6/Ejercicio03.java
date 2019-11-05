package tanda6;

import tanda3.Consola;

public class Ejercicio03 {

	public static void main(String[] args) {
		// serie
		int n, valorImpar=0, valorPar=1, multiplicando=1;
		do {
			System.out.println("Cuantos números quieres que tenga la serie");
			n=Consola.leeInt();
		} while (n<=0);
		
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				System.out.print(valorImpar + "\t");
				valorImpar-=2;
			}else {
				System.out.print(valorPar +"\t");
				valorPar+=2;
			}
			
		}

	}

}
