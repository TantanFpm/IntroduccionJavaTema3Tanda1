package tanda1;


public class Ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Programa que calcule la factorización de un numero
		 */
		int num, aux, cont;
		boolean primerNumero=true;
		
		do{
			System.out.println("Introduce un número");
			num=Consola.leeInt();
		}while(num<0);
		aux=num;
		cont=2;
		System.out.print(num + "=");
		while(cont<=aux) {
			if(aux%cont==0) {
				while(aux%cont==0) {
					if(primerNumero==true) {
						System.out.print(cont);
						primerNumero=false;
						aux=aux/cont;
						
					}else {
						System.out.print("*");
						System.out.print(cont);
						aux=aux/cont;
					}
					
					
						
				}
			}else {
					cont++;
					
				}
			}
			
		}
	}


