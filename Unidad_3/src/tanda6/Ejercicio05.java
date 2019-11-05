package tanda6;

public class Ejercicio05 {

	public static void main(String[] args) {
		// series
		int inicio, valor, multiplicando, totalValores;
		do {
			System.out.println("Introduce el número de inicio, tambien sera el numero de valores");
			inicio=Consola.leeInt();
		} while (inicio<=0);
		valor=inicio;
		multiplicando=inicio;
		totalValores=inicio;
		for (int i=1; i<=totalValores;i++) {
			System.out.print(valor +"\t");
			valor*=multiplicando;
			multiplicando-=1;
		}
	}

}
