package tanda1;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Programa que visualice una serie en forma de triangulo. El inicio de fila es el numero de fila y a cada columna se le resta el numero de fila - 1

		int fila, columna, numero=1, totalFila;
		
		do {
			System.out.println("Introduce la cantidad de filas que tiene que tener la serie");
			totalFila=Consola.leeInt();
		} while (totalFila<=0);
		
		for (fila=1; fila<=totalFila; fila++) {
			numero=fila;
			
			for(columna=1; columna<=fila; columna++) {
				System.out.print(numero + "\t");
				numero=numero- (fila-1);
			}
			System.out.println();
		}
	}

}
