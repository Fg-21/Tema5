package boletin1.ej1;

public class Hora {
	private int hora = 0;
	private int minuto = 0;

	/**
	 * Constructor con todos los atributos de hora
	 * 
	 * @param hora   Hora del dia actual
	 * @param minuto Minuto de la hora actual
	 */
	public Hora(int hora, int minuto) {

		if (hora < 24 && hora >= 0) {
			this.hora = hora;
		}
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
		}
	}

	
	/**
	 * Getter de la hora
	 * @return Devuelve la hora del dia de la hora invocante
	 */
	public int getHora() {
		return hora;
	}


	/**
	 * Getter del minuto
	 * @return Devuelve el minuto de la hora invocante
	 */
	public int getMinuto() {
		return minuto;
	}



	/**
	 * Setter de la hora, no puede ser mas de 23 ni menos que 0
	 * 
	 * @param hora Hora del dia a la que cambiar
	 * @return Devuelve true si se ha modificado la hora correctamente y false en caso contrario
	 */
	public boolean setHora(int hora) {
		boolean modified = false;
		
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
			modified = true;
		}
		
		return modified;
	}

	/**
	 * Setter del minuto, no puede ser mayor que 60 ni menor que 0
	 * 
	 * @param minuto minuto del dia al que cambiar
	 * @return Devuelve true si se ha modificado la hora correctamente y false en caso contrario
	 */
	public boolean setMinuto(int minuto) {
		boolean modified = false;
		
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
			modified = true;
		}
		
		return modified;
	}
	
	
	/**
	 * Metodo que incrementa la hora en un minuto
	 */
	public void inc() {
		this.minuto++;
		
		if (this.minuto == 60) {
			this.minuto = 0;
			this.hora++;
		}
		
		if (this.hora == 24) {
			this.hora = 0;
		}
	}
	
	@Override
	public String toString() {
		String minutos = "" + this.minuto;
		if (this.minuto % 10 == 0) {
			minutos = "0" + this.minuto;
		}
		return this.hora + ":" + minutos;
	}

}
