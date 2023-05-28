package extractClass;

public class ClienteRefactor {
	private String nombre;
	private String dni;
	private TarjetaCredito tarjetaCredito;

	public ClienteRefactor(String nombre, String dni) {
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