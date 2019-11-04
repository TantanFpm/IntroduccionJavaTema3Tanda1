package tanda3;

public class Ejercicio02 {
		/**
		 * Programa capaz de realizar la formula (n!)/(i!*(n-i)!) donde n e i se piden por teclado.
		 * Ambos deben ser positivos y n debe ser mayor que i.
		 */
	public static void main(String[] args) {
		double n, i,  dividendo, resultado;
		long factorialN=1, factorialI=1, factorialNMenosi=1;
		do {
			System.out.println("Introduce un número");
			n=Consola.leeDouble();
		} while (n<=0);
		do {
			System.out.println("Introduce un número menor que el anterior");
			i=Consola.leeDouble();
		} while (i>=n || i<=0);
		
		for (int j=1; j<=n; j++) {
			factorialN*=j;
			if(j==n-i)
				factorialNMenosi=factorialN;
			if(j==i)
				factorialI=factorialN;
		}
		
		
		dividendo=factorialI*factorialNMenosi;
		resultado=factorialN/dividendo;
		//System.out.println(factorialN + "\t" + factorialI + "\t" + factorialNMenosi + "\t" + dividendo);
		System.out.println("El resultado es: " + resultado);
	}

}
