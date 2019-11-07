package tanda6;

public class Ejercicio10 {

	public static void main(String[] args) {
		// serie en cuadrado
		int inicioFila, valor, numColumnas, numFilas, numero;
		do {
			System.out.println("Introduce un número");
			numero=Consola.leeInt();
		} while(numero<=0);
		
		inicioFila=numColumnas=numFilas=numero;
		for(int i=1; i<= numFilas; i++) {
			inicioFila*=i;
			valor=inicioFila;
			
			for (int j = 1; j <=numColumnas; j++) {
				System.out.print(valor+"\t");
				valor-=i;
			}
			System.out.print("\n");
		}
	}

}
