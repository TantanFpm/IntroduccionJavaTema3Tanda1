package tanda3;

public class Ejercicio05 {

	/**
	 * Programa que calcula el pago mensual de una hipoteca, así como el total que
	 * se ha pagado al liquidar la hipoteca
	 */
	public static void main(String[] args) {
		double cuota, totalPagado, dineroPrestado, interes, interesConvertido, numerador, divisor, potencia=1;
		int meses, anyos;
		System.out.println(
				"Vamos a calcular las cuotas del prestamo y el total a pagar. \nCuanto dinero vas a necesitar");
		dineroPrestado = Consola.leeDouble();
		do {
			System.out.println("a que tipo de interes");
			interes = Consola.leeDouble();
			interesConvertido = interes / 100;
		} while (interes <= 0 || interes > 100);
		do {
			System.out.println("A cuantos años deseas financiarlo");
			anyos = Consola.leeInt();
			meses = anyos * 12;
		} while (anyos <= 0);
		
		
		numerador=dineroPrestado*interesConvertido;
		for(int i=1; i<=meses; i++) {
			potencia*=(1/(1+interesConvertido));
		}
		divisor=1-potencia;
		cuota=numerador/divisor;
		totalPagado=cuota*meses;
		
		System.out.println("la cuota mensual a pagar sera: " + (int)cuota + "€ \nEl total que se va a pagar seran: " + (int)totalPagado + "€");
	}

}
