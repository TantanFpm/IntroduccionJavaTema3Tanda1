package tanda3;


public class Ejercicio04 {

	public static void main(String[] args) {
		/**
		 * Menu con tres opciones, la opcion tres para salir. Opcion 1 calcular el
		 * modulo de un vector (raiz(x2+y2+z2)) opcion 2 calcular el producto escalar de
		 * dos vectores (x1*x2+y1*y2+z1*z2)
		 */
		int opcion;
		double moduloVector, x1, x2, y1, y2, z1, z2, productoDosVectores;
		do {
			System.out.println(
					"Introduce una opcion: \n1: Calcular el modulo de un vector \n2: Calcular el producto de dos vectores \n3: Salir");
			opcion = Consola.leeInt();
			switch (opcion) {
			case 1:

				System.out.println("Introduce la magnitud x del vector");
				x2=Consola.leeDouble();
				System.out.println("Introduce la magnitud y del vector");
				y2=Consola.leeDouble();
				System.out.println("Introduce la magnitud z del vector");
				z2=Consola.leeDouble();
				moduloVector=Math.sqrt((x2*x2+y2*y2+z2*z2));
				System.out.println("El modulo del vecor (" + x2+ ", " + y2 + ", " + z2 + ") es: " + moduloVector);
				
				break;
			case 2:
				System.out.println("Introduce la magnitud x del  primer vector");
				x1=Consola.leeDouble();
				System.out.println("Introduce la magnitud y del primer vector");
				y1=Consola.leeDouble();
				System.out.println("Introduce la magnitud z del primer vector");
				z1=Consola.leeDouble();
				System.out.println("Introduce la magnitud x del segundo vector");
				x2=Consola.leeDouble();
				System.out.println("Introduce la magnitud y del segundo vector");
				y2=Consola.leeDouble();
				System.out.println("Introduce la magnitud z del segundo vector");
				z2=Consola.leeDouble();
				productoDosVectores=(x1*x2+y1*y2+z1*z2);
				System.out.println("El producto de los vectores (" + x1 + ", " + y1 + ", " + z1 + ") y (" + x2 + ", " + y2 + ", " + z2 + ") es: "  + productoDosVectores);
				break;

			default:
				break;
			}
		} while (opcion != 3);
	}

}
