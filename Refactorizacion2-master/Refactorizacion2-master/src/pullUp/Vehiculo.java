package pullUp;

public class Vehiculo {
	protected String modelo;
	protected String matricula;

	public String arrancar() {
		return "Brummm, brummm";
	}
}
//Ahora ambas subclases, "Coche" y "Moto", heredan estos atributos y método de la clase base "Vehiculo".