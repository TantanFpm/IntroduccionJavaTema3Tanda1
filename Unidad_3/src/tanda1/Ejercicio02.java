package tanda1;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Programa que calcule y visualice el area de un circulo (c) o rectángulo (r)
		char opcion;
		double radio, altura, base, areaRectangulo, areaCirculo;
		final double PI=3.1416;
		
		do {
			System.out.println("Introduce c, para calcular el area de un círculo o r, para la de un rectángulo");
			opcion=Consola.leeChar();
		}
		while (opcion!='c' && opcion!='C' && opcion!='r' && opcion!='R');
		switch (opcion) {
		case 'c':
		case 'C':
			
			System.out.println("Introduce el radio del circulo");
			radio=Consola.leeDouble();
			areaCirculo=PI*radio*radio;
			System.out.println("El area del circulo es: "+ areaCirculo);
			
			break;

		case 'r':
		case 'R':
			
			System.out.println("Introduce la base del rectángulo");
			base=Consola.leeDouble();
			System.out.println("Introduce la altura del rectángulo");
			altura=Consola.leeDouble();
			areaRectangulo=base*altura;
			System.out.println("El area del rectángulo es: "+ areaRectangulo);
			
			
			break;
		}	
		

	}

}
