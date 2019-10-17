package tanda1;

public class Ejercicio06 {
	

	public static void main(String[] args) {
		
	
		//Programa que lea la hora en  formato 24horas y la transforme a formato am/pm
		int hora, minuto, horaNueva;
		do {
			System.out.println("Introduce la hora (sólo la hora)");
			hora=Consola.leeInt();
			
		} while ( hora>23|| hora<0);//Pongo primero la de 23 porque creo qu es más probable ese error, para ganar eficiencia
		do {
			System.out.println("Introduce los minutos (sólo los minutos)");
			minuto=Consola.leeInt();
			
		} while ( minuto>59|| minuto<0);
		if (hora>12) {
			horaNueva=hora-12;
			if(minuto<10)
				System.out.println("Son las " + horaNueva + ":0"+ minuto + " PM");
			else
				System.out.println("Son las " + horaNueva + ":"+ minuto + " PM");
			
		}else if (hora==0) {
			horaNueva=12;
			if(minuto<10)
				System.out.println("Son las " + horaNueva + ":0"+ minuto + " AM");
			else
			System.out.println("Son las " + horaNueva + ":"+ minuto + " AM");
		}else if (hora==12) {
			horaNueva=hora;
			if(minuto<10)
				System.out.println("Son las " + horaNueva + ":0"+ minuto + " PM");
			else
			System.out.println("Son las " + horaNueva + ":"+ minuto + " PM");
		}else if (hora<12) {
			horaNueva=hora;
			if(minuto<10)
				System.out.println("Son las " + horaNueva + ":0"+ minuto + " AM");
			else
			System.out.println("Son las " + horaNueva + ":"+ minuto + " AM");
		}
	}
	
}