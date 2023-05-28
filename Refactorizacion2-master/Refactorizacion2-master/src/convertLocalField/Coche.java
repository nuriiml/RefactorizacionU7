package convertLocalField;

/*
 * -> Refactor / Convert Local Variable to Field...
 * Seleccionad la variable local kilometros y convertirla en Atributo
 * Elegid la opción de inicializarla en el constructor
 

public class Coche {

	public void conducir (int distancia) {
		int kilometros = 0;
		kilometros += distancia;
	}
	
}
*/

public class Coche {
	// la variable "kilometros" como un atributo de la clase "Coche" fuera de
	// cualquier método
	private int kilometros;

	public Coche() {
		kilometros = 0;
	}

	public void conducir(int distancia) {
		kilometros += distancia;
	}
}
//la variable "kilometros" la convierto en un atributo de la clase "Coche" 
//y se inicializa en 0 en el constructor. Ahora se puede utilizar este atributo en otros métodos de la clase según sea necesario