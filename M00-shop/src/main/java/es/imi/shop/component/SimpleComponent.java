package es.imi.shop.component;

import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {

	/**
	 * Devuelve la concatenación de los dos argumentos
	 * @param arg1 primer argumento. 
	 * @param arg2 segundo argumento.
	 * @return la concatenación
	 */
	public String join(String arg1, String arg2) {
		return arg1 + " - " + arg2;
	}
}
