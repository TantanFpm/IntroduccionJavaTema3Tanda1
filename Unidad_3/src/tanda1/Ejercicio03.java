package tanda1;



public class Ejercicio03 {

	public static void main(String[] args) {
		// Programa que pida tres números distintos y visualice el intermedio.

		int num1, num2, num3, intermedio;

		do {
			System.out.println("Introduzca tres números distintos, numero uno:");
			num1 = Consola.leeInt();
			System.out.println("número dos");
			num2 = Consola.leeInt();
			System.out.println("número tres");
			num3 = Consola.leeInt();

		} while (num1 == num2 || num2 == num3 || num1 == num3);

		/*if ((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2)) {
			intermedio = num1;
		} else if ((num2 < num1 && num2 > num3) || (num2 < num3 && num2 > num1)) {
			intermedio = num2;
		}else {
			intermedio=num3;
		}
		
		System.out.println("El numero intermedio es: " + intermedio);*/
		if(num1>num2) {
			if(num2>num3) {
				intermedio=num2;
			}else {
				if(num3>num1)
					intermedio=num1;
				else
					intermedio=num3;
			}
		}else{
			if(num1>num3) 
				intermedio=num1;
			else if(num2>num3)
				intermedio=num3;
				else
					intermedio=num2;
			}
		System.out.println("El numero intermedio es " + intermedio);
			
		}

}
