package boletin1.ej1;

public class HoraExacta extends Hora {

	private int segundo = 0;
	
	
	/**
	 * Constructor de la hora exacta con todos sus atributos
	 * @param hora Hora del dia
	 * @param minuto Minuto de la hora
	 * @param segundo Segundo de la hora
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if (this.segundo < 60 && this.segundo >= 0) {
			this.segundo = segundo;	
		}
		
	}
	/**
	 * Getter de segundo
	 * @return Devuelve el segundo de la hora invocante
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Modifica el valor de segundo en la hora, no puede ser menos de 0 ni mas de 59
	 * @param segundo Segundo al que cambiar
	 * @return Devuelve true si se ha modificado y false en caso contrario
	 */
	public boolean setSegundo(int segundo) {
		boolean modified = false;
		
		if (segundo < 60 && segundo >= 0) {
			this.segundo = segundo;
			modified = true;
		}
		
		return modified;
	}
	
	/**
	 * Metodo que aumenta un segundo a la hora invocante
	 */
	public void inc() {
		int minutos = this.getMinuto();
		this.segundo++;
		if (this.segundo == 60) {
			this.segundo = 0;
			minutos++;
			
			if (this.setMinuto(minutos)) {
				this.setMinuto(minutos);
			} else {
				super.inc();
			}
		}
	}
	
	@Override
	public String toString() {
		String segs = "" + this.segundo;
		
		if (this.segundo % 10 == 0) {
			segs = "0" + this.segundo;
		}
		
		return super.toString() + ":" + segs;
	}
	
	
	

}
