package tanda6;

public class Ejercicio13 {

	public static void main(String[] args) {
		int num, numBlancos, numEscritos;
		do {
			System.out.println("Introduce un numero");
			num=Consola.leeInt();
		} while (num<=0);
		numBlancos=num-1;
		numEscritos=1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= numBlancos; j++) {
				System.out.print("    ");
			}
			
			for (int j = 1; j <= numEscritos; j++) {
				if(i%2!=0)
					System.out.print("# # ");
				else
					System.out.print("X X ");
			}
			System.out.println();
			numBlancos-=1;
			numEscritos+=1;
			
		}

	}

}
