package pullUp;

/*
 * -> Refactor/Pull up
 * Sube al vehículo el atributo matrícula y el método arrancar
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 

public class Moto extends Vehiculo {
	private String matricula;
	private String casco;

	public String arrancar() {
		return "Brummm, brummm";
	}
	*/
public class Moto extends Vehiculo {
	private String casco;
}
