package tanda1;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Programa que visualice las calorías consumidas de una persona dormida o en reposo
		char estado;
		int minutos, horas;
		double caloriasConsumidas=0;
		final double CALORIAS_DORMIDO=1.08, CALORIAS_SENTADO=1.66;
		
		do {
			System.out.println("Escribe R para el estado sentado en reposo o D para estado: dormido");
			estado=Consola.leeChar();
			
		} while (estado!='R' && estado!='r' && estado!='D' && estado!='d');
		
		do {
			System.out.println("Introduce el número de horas que hayas permanecido en ese estado");
			horas=Consola.leeInt();
			System.out.println("Introduce el número de minutos");
			minutos=Consola.leeInt();
			minutos= minutos+(horas*60);
		} while (minutos<=0);
		
		switch (estado) {
		case 'R':
		case 'r':
			
			caloriasConsumidas=minutos*CALORIAS_SENTADO;
					
			break;
		case 'D':
		case 'd':
			caloriasConsumidas=minutos*CALORIAS_DORMIDO;
			
			break;
		}
		System.out.println("Ha consumido " + caloriasConsumidas + " calorias");

	}

}
