package tanda3;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Dibujar una x de las dimensiones introducidas por teclado. Validar que la
		// dimension sea un entero par mayor igual que 6
		int filas, columnasBlancoBorde=0, columnasBlancoCentro;
		final int columnasX=2;
		do {
			System.out.println("Introduce el número de filas, ha de ser un numero par mayor o igual a 6");
			filas=Consola.leeInt();
		} while (filas%2!=0 || filas<6);
		columnasBlancoCentro=filas - columnasX*2;
		for(int i=1; i<=filas; i++) {
			
			if(i<filas/2) {
				for(int j=1; j<=columnasBlancoBorde; j++) {
					System.out.print("  \t");
				}
				for(int j=1; j<=columnasX; j++) {
					System.out.print("X \t");
				}
				for(int j=1; j<=columnasBlancoCentro; j++) {
					System.out.print(" \t");
				}
				for(int j=1; j<=columnasX; j++) {
					System.out.print("X \t");
				}
				System.out.println();
				columnasBlancoBorde+=1;
				columnasBlancoCentro-=2;				
				
			}else if(i<=(filas/2)+1) {
				for(int j=1; j<=columnasBlancoBorde; j++) {
					System.out.print(" \t");
				}
				for(int j=1; j<=columnasX; j++) {
					System.out.print("X \t");
				}
				System.out.println();
				
				
			}else {
				columnasBlancoBorde-=1;
				columnasBlancoCentro+=2;
				for(int j=1; j<=columnasBlancoBorde; j++) {
					System.out.print("  \t");
				}
				for(int j=1; j<=columnasX; j++) {
					System.out.print("X \t");
				}
				for(int j=1; j<=columnasBlancoCentro; j++) {
					System.out.print(" \t");
				}
				for(int j=1; j<=columnasX; j++) {
					System.out.print("X \t");
				}
				System.out.println();
				
				
			}
			
		}

	}

}
