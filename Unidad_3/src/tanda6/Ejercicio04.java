package tanda6;

import tanda3.Consola;

public class Ejercicio04 {

	public static void main(String[] args) {
		// serie
		int n, valor=1, multiplicando=2;
		
		
		for(int i=1; valor<=100; i++) {
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
