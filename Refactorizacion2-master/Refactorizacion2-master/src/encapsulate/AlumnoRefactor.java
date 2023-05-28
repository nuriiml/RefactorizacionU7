package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 

public class AlumnoRefactor {
	String nombre;
	int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	public boolean mayorIgual5() {
		return nota >= 5;
	}
	 */
public class AlumnoRefactor {
	// se hacen privados los atributos
	private String nombre;
	private int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	// se hace privado el método
	private boolean mayorIgual5() {
		return nota >= 5;
	}
	// el Test JUnit se ejecuta correctamente
}
