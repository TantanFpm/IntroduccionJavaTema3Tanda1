package tanda6;

public class Ejercicio11 {

	public static void main(String[] args) {
		int  valor, numFilas, incremento;
		do {
			System.out.println("Introduce el numero de filas");
			numFilas=Consola.leeInt();
		} while (numFilas<=0);
		
		for (int i = 1; i <= numFilas; i++) {
			valor=i;
			incremento=i;
			for (int j = 1; j <=i; j++) {
				System.out.print(valor+"\t");
				valor+=incremento;
				incremento+=1;
			}
			System.out.println();
		}
	}

}
