package tanda2;

public class Ejercicio02 {

	public static void main(String[] args) {
		/**
		 * Programa que muestre un men� continuamente hasta que se introduzca la opci�n
		 * E y realice las diferentes acciones
		 */
		char opcion;
		int numero, sumatorio,factorial;
		double radicando, raiz, potencia, base;
		do {
			
		
		do {
			System.out.println(
					" Elige una opcion: \n A: Calcular ra�z cuadrada \n B: Calcular cubo \n C: Calcular sumatorio \n D: Calcular factorial \n E: Salir");
			opcion = Consola.leeChar();
		} while ((opcion < 'A' || opcion > 'E') && (opcion < 'a' || opcion > 'e'));

		switch (opcion) {
		case 'a':
		case 'A':
			do {
				System.out.println("Vamos a calcular la ra�z cuadrada de un n�mero. \nIntroduce un numero positivo");
				radicando=Consola.leeInt();
			} while (radicando<0);
			raiz=Math.sqrt(radicando);
			System.out.println("El resultado es " + raiz + " y " + raiz*-1);
			
			break;
			
		case 'b':
		case 'B':
			System.out.println("Vamos a elevar un n�mero al cubo, introduce un n�mero.");
			base=Consola.leeInt();
			potencia= Math.pow(base, 3);
			System.out.println(base + " elevado al cubo es " + potencia);
			break;
		case 'c':

			
		case 'C':
			//No estoy segura del tratamiento que se le dar�a a los n�meros negativos, as� que voy a forzar que sea positivo.
			do {
				System.out.println("Calculemos el sumatorio del n�mero que introduzcas");
				numero=Consola.leeInt();
			} while (numero<0);
			
			sumatorio=0;
			for(int i=1; i<=numero; i++) {
				sumatorio+=i;
			}
			System.out.println("El sumatorio de " + numero + " es " + sumatorio);

			break;
		case 'd':

			
		case'D':
			
			do {
				System.out.println("Introduce un n�mero para calcular su factorial");
				numero=Consola.leeInt();
			} while (numero<0);
			factorial=1;
			for(int i=1; i<=numero; i++) {
				factorial*=i;
			}
			System.out.println("El factorial de " + numero + " es " + factorial);
			break;

		
		}
		} while (opcion!='e' && opcion!='E');

	}

}
