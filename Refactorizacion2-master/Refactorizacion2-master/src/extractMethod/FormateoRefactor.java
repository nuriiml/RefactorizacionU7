package extractMethod;

/*
 * -> Refactor / Extract Method
 * Crea tres métodos con buenos nombres para los tres pasos
 * que se dan a la hora de formatear el texto
 
public class FormateoRefactor {

	public String calculaTexto(String texto) {
		String res = "";

		// Primero se eliminan todos los espacios y se ponen en mayúsculas
		String txt1 = "";
		txt1 = texto.replace(" ", "");
		res = txt1.toUpperCase();

		// Después se eliminan las vocales
		String txt2 = "";
		for (int i = 0; i < res.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(res.charAt(i)))) {
				txt2 += res.charAt(i);
			}
		}
		res = txt2;

		// Finalmente se eliminan todos los caracteres no alfabéticos
		String txt3 = "";
		for (int i = 0; i < res.length(); i++) {
			if (Character.isAlphabetic(res.charAt(i))) {
				txt3 += res.charAt(i);
			}
		}
		res = txt3;

		return res;
	}
	*/
public class FormateoRefactor {
	public String calculaTexto(String texto) {
		String res = eliminarEspaciosMayusculas(texto);
		res = eliminarVocales(res);
		res = eliminarCaracteresNoAlfabeticos(res);
		return res;
	}

	private String eliminarEspaciosMayusculas(String texto) {
		return texto.replace(" ", "").toUpperCase();
	}

	private String eliminarVocales(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(texto.charAt(i)))) {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}

	private String eliminarCaracteresNoAlfabeticos(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isAlphabetic(texto.charAt(i))) {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}
	/*
	 * se crea tres métodos privados: eliminarEspaciosMayusculas, eliminarVocales y
	 * eliminarCaracteresNoAlfabeticos. Cada método realiza uno de los pasos de
	 * formateo del texto. El método calculaTexto llama a estos tres métodos en el
	 * orden adecuado para obtener el resultado final.
	 */

}