package tanda3;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Visualizar un paralelogramo con 4x por fila y tantas filas como pida el usuario
		int filas, columnasBlanco;
		final int columnasX=4;
		do {
			System.out.println("Cuantas filas quieres que tenga la figura");
			filas=Consola.leeInt();
		} while (filas<=0);
		columnasBlanco=filas;
		
		for(int i=1; i<=filas; i++) {
			columnasBlanco-=1;
			for(int j=1; j<=columnasBlanco; j++) {
				System.out.print(" \t");
			}
			for(int j=1; j<=columnasX; j++) {
				System.out.print("X \t");
			}
			System.out.println();
			
		}

	}

}
