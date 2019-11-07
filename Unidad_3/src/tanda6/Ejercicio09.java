package tanda6;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Tablas de multiplicar entre los números dados
		int multiplicando, multiplicador, producto, num1, num2;
		System.out.println("Introduce un numero para delimitar las tablas que quieres visualizar");
		num1=Consola.leeInt();
		do {
			System.out.println("Introduce otro numero, recuerda que ha de ser mayor que el anterior");
			num2=Consola.leeInt();
		} while (num2<=num1);
		
		for(int i=num1; i<=num2; i++) {
			multiplicando=i;
			multiplicador=1;
			System.out.println("Tabla del " + multiplicando);
			while(multiplicador<=10) {
				producto= multiplicando * multiplicador;
				System.out.println(multiplicando + "x" + multiplicador + "= "+  producto);
				multiplicador+=1;
			}
			System.out.println("---***---");
			
		}
	}

}
