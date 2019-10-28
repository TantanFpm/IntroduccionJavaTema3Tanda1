package tanda2;

public class Ejercicio04 {
	/**
	 * Se pide por teclado datos sobre n trayectos, n tambien se pide. Se pide una
	 * letra para la ciudad de origen otra para la de destino y los km comprendidos
	 * entre ellas. Visualizar las ciudades más cercanas y su trayecto.
	 **/
	public static void main(String[] args) {
		int totalTrayectos;
		double distancia, distanciaMinima = Double.MAX_VALUE;
		char origen, destino, origenMin=' ', destinoMin=' ';

		do {
			System.out.println("Introduce la cantidad de los trayectos a evaluar");
			totalTrayectos = Consola.leeInt();
		} while (totalTrayectos < 0);

		for (int i = 1; i <= totalTrayectos; i++) {
			System.out.println("Introduce la ciudad de origen");
			origen = Consola.leeChar();
			System.out.println("Introduce la ciudad de destino");
			destino = Consola.leeChar();
			System.out.println("Introduce la distancia entre ellas");
			distancia = Consola.leeDouble();
			if (distancia < distanciaMinima) {
				distanciaMinima = distancia;
				origenMin = origen;
				destinoMin = destino;
			}
		}
		
		System.out.println("El trayecto más corto es el que une " + origenMin + " con " + destinoMin
				+ " con una distancia de " + distanciaMinima + "km");
	}

}
