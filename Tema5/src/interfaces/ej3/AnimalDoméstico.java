package interfaces.ej3;

public abstract class AnimalDoméstico implements Animal {
	private String nombre;
	private int peso;
	private String raza;
	private String color;
	
	public void vacunar() {
		System.out.println("Animal vacunado :)");
	}
	
	public abstract boolean hacerCaso();
	
	public abstract void hacerRuido();
	
	public void comer() {
		System.out.println("El animal ha comido");
	};
	public void dormir() {
		System.out.println("zzz...");
	};
}
