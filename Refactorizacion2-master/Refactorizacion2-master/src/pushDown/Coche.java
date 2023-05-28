package pushDown;

public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;

	// añado los atributos matrícula y seguro
	private String plate;
	private Seguro insurance;

	// añado el método arrancar
	public String arrancar() {
		return "Brummm, brummm";
	}

	public boolean estaAbiertoMaletero() {
		return abiertoMaletero;
	}
}