package extractLocalVariable;

/*
 * -> Refactor/Extract Local Variable
 * Crea una variable local "doble" con el valor de 2
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 
public class DobleRefactor {
	public int calculaDoble(int valor) {
		return 2 * valor;
	}
	*/
//se crea una variable local llamada "doble" con el valor de 2. 
//Luego se utiliza esa variable en el cálculo del doble del valor proporcionado.

public class DobleRefactor {
	public int calculaDoble(int valor) {
		int doble = 2;
		return doble * valor;
	}
}
