package pullUp;

/*
 * -> Refactor/Pull up
 * Sube al vehículo el atributo matrícula y el método arrancar
 * Luego ejecuta el Test JUnit para comprobar que es correcto 


public class Coche extends Vehiculo {
	private String matricula;
	private String maletero;
	private boolean abiertoMaletero;

	public String arrancar() {
		return "Brummm, brummm";
	}

	public boolean isTrunkOpen() {
		return abiertoMaletero;
	}
	 */
public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;

	public boolean isTrunkOpen() {
		return abiertoMaletero;
	}
}
