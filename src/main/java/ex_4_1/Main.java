package ex_4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		Object[][] pares = new String[][] { { "clear", "hot", "Candy", "High" }, { "Dark", "cold", "Salty", "Low" } };

		
		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);

		
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
