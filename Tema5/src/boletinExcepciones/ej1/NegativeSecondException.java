package boletinExcepciones.ej1;

public class NegativeSecondException extends Exception {
	@Override
	public String toString() {
		return "Los segundos no pueden ser Negativos";
	}
	
	@Override
	public String getMessage() {
		return "Los segundos no pueden ser Negativos";
	}
	
}
