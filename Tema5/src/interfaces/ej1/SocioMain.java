package interfaces.ej1;

import java.util.Arrays;

public class SocioMain {
public static void main(String[] args) {
	//Array de tipo socio
	Socio[] listaSocios = new Socio[4];
	
	//Socios
	Socio s1 = new Socio(54, "Angel", 18);
	Socio s2 = new Socio(95, "Diego", 18);
	Socio s3 = new Socio(52, "Fran", 20);
	Socio s4 = new Socio(95, "Pablo", 19);
	
	//Añadimos los socios a la lista
	listaSocios[0] = s1;
	listaSocios[1] = s2;
	listaSocios[2] = s3;
	listaSocios[3] = s4;
	
	//Ordenamos el array
	Arrays.sort(listaSocios);
	
	//Imprimimos todos los socios de la lista
	for (Socio socio : listaSocios) {
		System.out.println(socio);
	}
	
	
	
}
}
