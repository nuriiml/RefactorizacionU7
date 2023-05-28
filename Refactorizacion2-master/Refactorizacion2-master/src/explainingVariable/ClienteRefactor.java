package explainingVariable;

class ClienteRefactor {
	private int edad;
	private float salario;

	public ClienteRefactor(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}

	/*
	 * public float calculaDescuento(float cantidadTotal) { if ((edad >= 18 && edad
	 * <= 65) && (salario - (salario * 0.5f)) < 1200f && cantidadTotal * 0.5 < 500)
	 * { return cantidadTotal * 0.9f; } else { return cantidadTotal; } }
	 */
//Para mejorar el código y hacerlo más simple y sencillo en el método calculaDescuento:
	public float calculaDescuento(float cantidadTotal) {
		boolean esAdulto = (edad >= 18 && edad <= 65);
		boolean salarioBajo = (salario - (salario * 0.5f)) < 1200f;
		boolean descuentoMaximo = cantidadTotal * 0.5 < 500;

		if (esAdulto && salarioBajo && descuentoMaximo) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}
	// Se crea una variable explicativa y se elimina una expresión compleja

}
