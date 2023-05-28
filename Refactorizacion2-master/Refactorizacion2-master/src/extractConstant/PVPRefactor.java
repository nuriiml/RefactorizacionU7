package extractConstant;

/*
 * -> Refactor/Extract Constant
 * Crea un atributo privado y constante IVA para sustituir el valor 21
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 * 
 * public class PVPRefactor {
	public double calculaPVP(double precio) {
		double impuestos = (precio * 21) / 100;
		return precio + impuestos;
	}
 */

public class PVPRefactor {

	public double calculaPVP(double precio) {
		double impuestos = (precio * Constantes.IVA) / 100;
		return precio + impuestos;
	}
}
