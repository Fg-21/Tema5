package boletin1.ej1;

public class HorasMain {
	public static void main(String[] args) {
		HoraExacta h1 = new HoraExacta(20, 23, 15);
		
		h1.inc();
		
		System.out.println(h1);
	}
}
