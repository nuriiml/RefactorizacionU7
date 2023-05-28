package pushDown;
public class Moto extends Vehiculo {
	private String tipo;
	//añado los atributos matrícula y seguro
		private String plate;
		private Seguro insurance;
		
		//añado el método arrancar
		public String arrancar() {
			return "Brummm, brummm";
		}
}
