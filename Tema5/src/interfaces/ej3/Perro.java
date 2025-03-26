package interfaces.ej3;

import java.util.Random;

public class Perro extends AnimalDoméstico implements Animal {

	
	
	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		boolean obediente = false;
		int numeroAleatorio = rand.nextInt(0, 11);
		
		if (numeroAleatorio != 10) {
			obediente = true;
		}
				
		return obediente;
	}

	@Override
	public void hacerRuido() {
		System.out.println("¡Bark Bark!");
		
	}
	
	public void sacarPaseo() {
		System.out.println("¡El perro ha sido paseado!");
	}

}
