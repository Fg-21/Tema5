package boletinExcepciones.ej1;

public class NegativeHourException extends Exception {
	@Override
	public String toString() {
		return "Las horas no pueden ser Negativos";
	}
	
	@Override
	public String getMessage() {
		return "Las horas no pueden ser Negativos";
	}
}
