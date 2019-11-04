package tanda3;

public class Ejercicio08 {

	public static void main(String[] args) {
		int filas, columnasEscritas=3, columnasBlanco=0, valor=1, inicioFila=1;
		do {
			System.out.println("Introduce numero de filas");
			filas=Consola.leeInt();
		} while (filas<=0);
		for(int i=1; i<=filas; i++) {
			valor=inicioFila;
			for(int j=1; j<=columnasBlanco && i>=2; j++) {
				System.out.print(" \t");
			}
			for(int j=1; j<=columnasEscritas; j++) {
				System.out.print(valor + "\t");
				valor+=i;
			}
			System.out.println();
			columnasBlanco+=1;
			columnasEscritas+=1;
			inicioFila*=2;
		}

	}

}
