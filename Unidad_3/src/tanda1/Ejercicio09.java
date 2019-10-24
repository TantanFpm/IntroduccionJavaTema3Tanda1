package tanda1;

public class Ejercicio09 {

	/**
	 * Programa que determine si alguien es apto para un campeonato. Numero de
	 * pruebas es una constante (10) debe cumplir al menos una de estas condiciones:
	 * Ninguna prueba puede superar los 16 minutos, en al menos una el tiempo sera
	 * menor a 10 minutos, el promedio de todas será menor o igual que 15
	 * 
	 */
	public static void main(String[] args) {

		final int DIAS = 10;
		boolean esApto = false;
		double tiempoCarrera, promedioTiempos, totalTiempos = 0;
		int contCarrera, contTiempoAlto = 0, contTiempoBajo = 0;

		for (contCarrera = 1; contCarrera <= DIAS; contCarrera++) {
			do {
				System.out.println("Introduce el tiempo que te ha costado la carrera " + contCarrera);
				tiempoCarrera = Consola.leeDouble();
			} while (tiempoCarrera < 0);

			if (tiempoCarrera > 16)
				contTiempoAlto += 1;
			if (tiempoCarrera < 10)
				contTiempoBajo += 1;

			totalTiempos += tiempoCarrera;

		}
		promedioTiempos=totalTiempos/DIAS;
		
		if(contTiempoAlto==0 || contTiempoBajo>0 || promedioTiempos<=15)
			esApto=true;
		if(esApto)
			System.out.println("Puedes participar en el campeonato");
		else
			System.out.println("Este año no estás preparado para el campeonato, ánimo! sigue entrenando!");

	}

}
