package extractClass;

/*
 * creo una nueva clase llamada "TarjetaCredito" que contiene los métodos y atributos relacionados con las tarjetas de crédito. 
 * La clase Cliente y ClienteRefactor ahora tienen una instancia de "TarjetaCredito" como un atributo.

* Esto ayuda a separar las responsabilidades y mejora la organización del código. 
* Se modifican los métodos existentes para utilizar los métodos de la clase "TarjetaCredito" cuando sea necesario.
 */

public class Cliente {
	private String nombre;
	private String dni;
	private TarjetaCredito tarjetaCredito;

	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.tarjetaCredito = new TarjetaCredito();
	}

	public boolean estaCaducada() {
		return tarjetaCredito.estaCaducada();
	}

	public boolean esValidoDni() {
		boolean result = true;
		for (char c : dni.toCharArray()) {
			if (!Character.isDigit(c)) {
				result = false;
			}
		}
		return result;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

}