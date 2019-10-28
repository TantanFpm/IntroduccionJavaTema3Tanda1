package tanda2;

public class Ejercicio05 {
	/**
	 * Programa que pida el codigo, categoria y ventas para N productos y visualice
	 * el total ventas de productos de categoria B y el codigo y categoria de los
	 * productos más vendidos y menos vendidos.
	 * 
	 */
	public static void main(String[] args) {
		final int N=5;
		int codigo, totalVentas, totalVentasCategoriaB=0, codigoMasVendido=0, codigoMenosVendido=0, maxVentas=Integer.MIN_VALUE, minVentas=Integer.MAX_VALUE;
		char categoria, categoriaMasVendido=' ', categoriaMenosVendido=' ';
		
		for(int i=1; i<=N; i++) {
			do{
				System.out.println("Introduce el codigo de productos, el código debe ser mayor que cero");
				codigo=Consola.leeInt();
			}while(codigo<=0);
			
			
			do {
				System.out.println("Introduce a que categoria pertenece");
				categoria=Consola.leeChar();
			} while (categoria!='a' && categoria!='A' && categoria!='b' &&categoria!='B' && categoria!='c' && categoria!='C');
			do {
				System.out.println("Introduce el número de ventas del producto " + codigo);
				totalVentas=Consola.leeInt();
			} while (totalVentas<=0);
			if(categoria=='B'|| categoria=='b') {
				totalVentasCategoriaB+=totalVentas;
			}
			if (totalVentas<minVentas) {
				codigoMenosVendido=codigo;
				categoriaMenosVendido=categoria;
				minVentas=totalVentas;
			}
			if (totalVentas>maxVentas) {
				codigoMasVendido=codigo;
				categoriaMasVendido=categoria;
				maxVentas=totalVentas;
			}
			
		}
		System.out.println("El total de ventas de productos de categoria intermedia (b) es " + totalVentasCategoriaB);
		System.out.println("El producto más vendido es " + codigoMasVendido + ", de la categoria " + categoriaMasVendido + " con " + maxVentas + " productos vendidos");
		System.out.println("El producto menos vendido es " + codigoMenosVendido + ", de la categoria " + categoriaMenosVendido + " con " + minVentas + " productos vendidos");
	}

}
