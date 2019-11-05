package tanda4;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Marco
		int filas, columnas;
		do {
			System.out.println("Introduce el numero de filas");
			filas=Consola.leeInt();
		} while (filas<=0);
		columnas=filas;
		for(int i =1; i<=filas; i++) {
			for(int j =1; j<=columnas; j++) {
				if(i==1 || i==filas) {
					System.out.print("X\t");
				}else {
					if(j==1 || j==columnas)
						System.out.print("X\t");
					else
						System.out.print(" \t");
				}
			}
			System.out.print("\n");
		}

	}

}
