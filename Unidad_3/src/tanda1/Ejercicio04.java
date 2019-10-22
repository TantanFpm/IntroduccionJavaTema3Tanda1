package tanda1;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Programa que haga un 20% de descuento a los clientes que que compren más de 100
		double totalCompra, precioFinal;
		final int DESCUENTO=20;
		
		System.out.println("Introduce el precio total de la compra");
		totalCompra=Consola.leeDouble();
		
		if(totalCompra>100)
			precioFinal= totalCompra-(totalCompra*DESCUENTO/100);
		else
			precioFinal=totalCompra;
		
		System.out.println("El precio final de la compra  es " + precioFinal+"€");

	}

}
