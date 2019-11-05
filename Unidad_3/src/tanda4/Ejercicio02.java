package tanda4;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Piramide alternando X, Y en las filas
		int filas, columnasBlanco, columnasEscritas=1;
		do {
			System.out.println("Cuantas filas quieres que tenga la figura");
			filas=Consola.leeInt();
		} while (filas<=0);
		
		for(int i=1; i<=filas; i++) {
			columnasBlanco=filas-i;
			for(int j=1; j<=columnasBlanco; j++) {
				System.out.print(" \t");
				
			}
			for(int j=1; j<=columnasEscritas; j++) {
				if(i%2==0)
					System.out.print("Y\t");
				else
					System.out.print("X\t");
			}
			columnasEscritas+=2;
			System.out.print("\n");
		}

	}

}
