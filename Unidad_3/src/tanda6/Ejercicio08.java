package tanda6;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Serie visualizar grupos
		int numGrupos;
		String valor="-";
		final char VALOR_INICIAL='#';
		
		do {
			System.out.println("Introduce el n�mero de grupos que quieres proyectar");
			numGrupos=Consola.leeInt();
		} while (numGrupos<=0);
	
		for (int i =1; i<=numGrupos; i++) {
			System.out.print(VALOR_INICIAL+valor);
			valor+="-";
			
		}

	}

}
