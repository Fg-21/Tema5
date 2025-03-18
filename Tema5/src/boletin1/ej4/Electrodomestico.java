package boletin1.ej4;

public class Electrodomestico {

	/**
	 * Definicion  del enumerado del consumo
	 */
	enum ConsumoEnergetico{
			A, B, C, D, E, F
	}
	
	/**
	 * Definicion del enumerado del color
	 */
	enum Color{
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	/**
	 * Atributo del color del electrodoméstico
	 */
	private Color color = Color.BLANCO;
	
	/**
	 * Atributo del consumo energetico
	 */
	private ConsumoEnergetico letra = ConsumoEnergetico.F;
	
	/**
	 * Atributo del precio base del electrodoméstico
	 */
	protected double precioBase = 100;
	
	/**
	 * Atributo del peso del electrodoméstico
	 */
	private double peso = 5;

	/**
	 * Constructor del Electrodomestico con el precio base y el peso
	 * @param precioBase Precio base del electrodoméstico
	 * @param peso Peso del electrodoméstico
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Constructor del Electrodoméstico con todos sus atributos
	 * @param color Color del electrodoméstico
	 * @param letra Letra del consumo energético del electrodoméstico
	 * @param precioBase Precio base del electrodoméstico
	 * @param peso Peso del electrodoméstico
	 */
	public Electrodomestico(String color, String letra, double precioBase, double peso) {
		compColor(color);
		compLetra(letra);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	


	/**
	 * Setter del precio base del electrodoméstico
	 * @param precioBase Nuevo precio base del electrodoméstico
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Metodo para hacer un "casteo" del enumerado a string
	 * @param color Color del Electrodoméstico
	 */
	private void compColor(String color) {
		switch (color) {
		case  "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"->{
			this.color = Color.valueOf(color);
		}
		default ->{
			this.color = Color.BLANCO;
		}
		}
	}
	
	/**
	 *  Metodo para hacer un "casteo" del enumerado a string
	 * @param letra Letra del consumo energético del electrodoméstico
	 */
	private void compLetra(String letra) {
		switch (letra){
		case "A", "B", "C", "D", "E", "F"->{
			this.letra = ConsumoEnergetico.valueOf(letra);
		}
		default ->{
			this.letra = ConsumoEnergetico.F;
		}
		}
	}
	
	
	
	
	/**
	 * Metodo para calcular el precio final del electrodoméstico invocante en base al peso y el consumo energético
	 */
	public void precioFinal() {
		switch (this.letra) {
		case F->{
			this.precioBase += 10;
		}
		case E ->{
			this.precioBase += 30;
		}
		case D ->{
			this.precioBase += 50;
		}
		case C ->{
			this.precioBase += 60;
		}
		case B ->{
			this.precioBase += 80;
		}
		case A ->{
			this.precioBase += 100;
		}
		}
		
		if (this.peso >= 0 && this.peso < 20) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso < 50) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso < 80) {
			this.precioBase += 80;
		}else if (this.peso >= 80) {
			this.precioBase += 100;
		}
	}
	
	
	
	
	
}
