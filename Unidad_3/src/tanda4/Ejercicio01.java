package tanda4;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Triangulo rectangulo
		int filas;
		do {
			System.out.println("Cuantas filas quieres");
			filas=Consola.leeInt();
		} while (filas<=0);
		for(int i=1; i<filas; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("X \t");
				System.out.print("Y \t");
			}
			System.out.print("\n");
			
		}

	}

}
