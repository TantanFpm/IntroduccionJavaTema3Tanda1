import tanda2.Consola;

public class Ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Programa que calcule la factorización de un numero
		 */
		int num, aux, cont;
		
		System.out.println("Introduce un número");
		num=Consola.leeInt();
		aux=num;
		cont=2;
		System.out.print(num + "=");
		while(cont<=aux) {
			if(aux%cont==0) {
				while(aux%cont==0) {
					System.out.print(cont);
					aux=aux/cont;
					if(aux%cont==0)
						System.out.print("*");
				}
			}else {
					cont++;
					System.out.print("*");
				}
			}
			
		}
	}


