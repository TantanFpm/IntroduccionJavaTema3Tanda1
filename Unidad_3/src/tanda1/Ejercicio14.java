package tanda1;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Programa que divida sin usar la division
		int dividendo, divisor, contCociente, auxDividendo, auxDivisor;
		
		System.out.println("Introduce un número");
		dividendo = Consola.leeInt();

		do {
			System.out.println("¿Entre cuánto lo dividimos? Recuerda que no podemos dividir entre 0");
			divisor = Consola.leeInt();
		} while (divisor == 0);

		auxDividendo= dividendo;
		auxDivisor=divisor;
		if (dividendo < 0)
			auxDividendo *= -1;
		if (divisor < 0) 
			auxDivisor *= -1;
		
		contCociente = 0;
		while ((auxDividendo > 0) && (auxDividendo >= auxDivisor)) {
			auxDividendo -= auxDivisor;
			contCociente += 1;
		}

		if ((dividendo > 0 && divisor<0) || (dividendo < 0 && divisor>0))
			contCociente *= -1;

		System.out.println(dividendo + ":" + divisor + "= " + contCociente);

	}

}
