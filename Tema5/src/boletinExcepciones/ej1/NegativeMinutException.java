package boletinExcepciones.ej1;

public class NegativeMinutException extends Exception {
	@Override
	public String toString() {
		return "Los minutos no pueden ser Negativos";
	}
	
	@Override
	public String getMessage() {
		return "Los minutos no pueden ser Negativos";
	}
}
