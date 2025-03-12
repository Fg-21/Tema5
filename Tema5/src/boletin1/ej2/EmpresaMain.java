package boletin1.ej2;

public class EmpresaMain {
public static void main(String[] args) {
	
	Empleado e1 = new Empleado("Fran");
	Operario e2 = new Operario("Juan");
	Directivo e3 = new Directivo("Benito");
	Tecnico e4 = new Tecnico("Benito");
	Oficial e5 = new Oficial("Benito");
	
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);
	System.out.println(e5);
}
}
