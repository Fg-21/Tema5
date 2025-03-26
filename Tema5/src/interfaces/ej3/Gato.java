package interfaces.ej3;

import java.util.Random;

public class Gato extends AnimalDoméstico implements Animal {

	public void toserBolaPelo() {
		System.out.println("¡¡BUUUUAAAAJ!!");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		boolean obediente = false;

		int numeroAleatorio = rand.nextInt(0, 101);

		if (numeroAleatorio >= 95) {
			obediente = true;
		}

		return obediente;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Meow, meow");
	}

}
