package analisis.ej1;

public abstract class Vehiculo {

	enum Estado {
		ENCENDIDO, APAGADO
	}

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private Estado estadoVehiculo;
	private int marchaActual;
	private int velocidadActual;

	public Vehiculo(String marca, String modelo, String color, String matricula, String estadoVehiculo,
			int marchaActual, int velocidadActual) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		compEstado(estadoVehiculo);
		this.marchaActual = marchaActual;
		this.velocidadActual = velocidadActual;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public Estado getEstadoVehiculo() {
		return estadoVehiculo;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public void compEstado(String estado) {
		switch (estado) {
		case "ENCENDIDO", "APAGADO" -> {
			this.estadoVehiculo = Estado.valueOf(estado);
		}
		}

	}
	
	public boolean apagar() {
		boolean apagado = false;
		if (this.velocidadActual == 0 && this.estadoVehiculo == Estado.ENCENDIDO){
			this.estadoVehiculo = Estado.APAGADO;
			apagado = true;
		}		
		return apagado;
	}
	
	public boolean arrancar() {
		boolean encendido = false;
		if (this.velocidadActual == 0 && this.estadoVehiculo == Estado.APAGADO){
			this.estadoVehiculo = Estado.ENCENDIDO;
			encendido = true;
		}		
		return encendido;
	}
	
	public boolean subeMarcha() {
		boolean subida = false;
		
		if (this.marchaActual < 6) {
			this.marchaActual++;
			subida = true;
		}
		
		return subida;
	}
	
	public boolean bajaMarcha() {
		boolean bajada = false;
		
		if (this.marchaActual > 0) {
			this.marchaActual--;
			bajada = true;
		}
		
		return bajada;
	}

}
