package boletin1.ej4;

public class Television extends Electrodomestico {

	/**
	 * Atributo de resolucion para la television
	 */
	private int resolucion = 20;

	/**
	 * Atributo que dice si tiene un TDT para sintonizar o no
	 */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor de television para el precio base y el peso de la tele
	 * 
	 * @param precioBase Precio base de la tele
	 * @param peso       Peso de la tele
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor de Television con todos sus atributos mas los heredados de
	 * Electrodoméstico
	 * 
	 * @param color      Color de la tele
	 * @param letra      Consumo energetico de la tela
	 * @param precioBase Precio base de la tele
	 * @param peso       Peso de la tele
	 * @param resolucion Resolucion de la tele
	 * @param tdt        Modo1 de sintonizacion de la tele
	 */
	public Television(String color, String letra, double precioBase, double peso, int resolucion, boolean tdt) {
		super(color, letra, precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = tdt;
	}

	/**
	 * Precio final de la tele que aparte de hacer las comprobaciones del padre
	 * controla el precio final a partir de la resolucion y el modo de sintonizacion
	 */
	public void precioFinal() {
		super.precioFinal();
		if (this.resolucion > 40) {
			this.precioBase += this.precioBase * 0.3;
		}

		if (this.sintonizadorTDT) {
			this.precioBase += 50;
		}
	}

}
