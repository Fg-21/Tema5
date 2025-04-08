package boletinExcepciones.ej1;

import java.util.Scanner;

public class HoraExceptionsMain {
	public static void main(String[] args) {
		int hora = 3;
		
		int minuto = -2;
		
		int segundo = 1;
		
		boolean horaWena = false;
		
		Hora h1 = null;
		
		Scanner rd = new Scanner(System.in);
		do
			try {
				h1 = new Hora(hora, minuto, segundo);
				horaWena = true;
			} catch (NegativeHourException e) {
				 do{
					System.out.println("Escribe la hora bien");
					hora = rd.nextInt();
					rd.nextLine();
				}while(hora < 0);
			} catch (NegativeMinutException e) {
				 do{
					System.out.println("Escribe el minuto bien");
					minuto = rd.nextInt();
					rd.nextLine();
				}while(minuto < 0);
			} catch (NegativeSecondException e) {
				 do{
					System.out.println("Escribe el segundo bien");
					segundo = rd.nextInt();
					rd.nextLine();
				}while(segundo < 0);
			}
		while (!horaWena);
		System.out.println("Sigue el programa");
		System.out.println(h1);
	}
}
