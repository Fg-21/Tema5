package boletin1.ej4;

public class Lavadora extends Electrodomestico {

	/**
	 * Atributo de la carga maxima del tambor de la lavadora
	 */
	private int carga = 5;
	
	
	
	/**
	 * Constructor de la lavadora con los atributos heredados de precioBase y peso
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}



	/**
	 * Constructor de la clase Lavadora con los atributos heredados de Electrodomestico mas la carga
	 * @param precioBase Precio base de la lavadora
	 * @param peso Peso de la lavadora
	 * @param color Color de la lavadora
	 * @param letra Letra del consumo energético
	 * @param carga Carga del tambor de la lavadora
	 */
	public Lavadora(String color, String letra, double precioBase, double peso, int carga) {
		super(color, letra, precioBase, peso);
		this.carga = carga;
	}
	
	
	
	/**
	 * Metodo para calcular el precio final de la lavadora invovante, hereda de Electrodomestico
	 *@Override  
	 */
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 50) {
		}
	}

	
}
