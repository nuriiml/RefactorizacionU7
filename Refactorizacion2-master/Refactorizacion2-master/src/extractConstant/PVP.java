package extractConstant;

public class PVP {
	/*
	 * public double calculaPVP(double precio) { double impuestos = (precio * 21) /
	 * 100; return precio + impuestos; }
	 */

	public double calculaPVP(double precio) {
		double impuestos = (precio * Constantes.IVA) / 100;
		return precio + impuestos;
	}
}
