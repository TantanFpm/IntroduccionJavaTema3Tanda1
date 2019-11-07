package tanda6;

public class Ejercicio14 {

	public static void main(String[] args) {
	int numFilas, espacioBlanco, espacioZ;
	do {
		System.out.println("Introduce el numero de filas");
		numFilas=Consola.leeInt();
	} while (numFilas<=0);
	for (int i = 1; i <= numFilas; i++) {
		if (i==1 || i==numFilas) {
			for (int j = 1; j <= numFilas; j++) {
				System.out.print("Z ");
			}
		}else {
			espacioBlanco=numFilas-i;
			for (int j = 1; j <=espacioBlanco; j++) {
				System.out.print("  ");
			}
			System.out.print("Z ");
		}
		System.out.println();
		
		
		
	}
	

	}

}
