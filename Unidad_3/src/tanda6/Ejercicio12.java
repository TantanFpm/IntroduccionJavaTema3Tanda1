package tanda6;

public class Ejercicio12 {

	public static void main(String[] args) {
		final int NUM_FILAS=8, NUM_COLUMNAS=5;
		int incremento=1, valor, inicioFila=104, decrementoInicio=4;
		
		
		for (int i = 1; i <= NUM_FILAS; i++) {
			decrementoInicio=4*i;
			inicioFila-=decrementoInicio;
			valor=inicioFila;
			for (int j = 1; j <= NUM_COLUMNAS; j++) {
				System.out.print(valor + "\t");
				valor+=incremento;
				incremento+=1;
			}
			incremento-=1;
			System.out.println();
		}
		
	}

}
