package boletinComparable.ej4;

public class Ficha implements Comparable<Ficha> {
	private int id;

	private String titulo;

	public Ficha(int id, String titulo) {

		if (id > 0) {
			this.id = id;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {

		return "ID: " + id + ", Titulo: " + titulo;

	}
	
	@Override
	public int compareTo(Ficha o) {
		return this.id-o.id;
	}
}

