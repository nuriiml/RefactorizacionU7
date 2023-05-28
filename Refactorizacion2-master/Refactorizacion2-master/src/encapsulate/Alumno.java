package encapsulate;

public class Alumno {
	private String nombre;
	private int nota;

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	private boolean mayorIgual5() {
		return nota >= 5;
	}
}
