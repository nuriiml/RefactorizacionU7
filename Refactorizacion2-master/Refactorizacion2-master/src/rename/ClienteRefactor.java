package rename;

/*
 * -> Refactor/Rename
 * Cambia el nombre de las variables x, y, z para que indiquen
 * el area, la base y la altura del rectángulo
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 
public class ClienteRefactor {
	public double areaFinal(double x, double y) {
		double z = x * y;
		return z;
	}*/

public class ClienteRefactor {
	public double areaFinal(double base, double altura) {
		double area = base * altura;
		return area;
	}

//he cambiado el nombre de la variable "x" por "base", la variable "y" por "altura" y la variable "z" por "area". 

}