package logica;

import java.util.ArrayList;

/**
 * Descripción: genera el arreglo donde se van a guardar los datos  
 * @author daniel m alvarez
 *
 */
public class Datos {
	// ----------------------------------------------------------
	// Métodos
	// ----------------------------------------------------------

	public ArrayList<ArrayList<Double>> LeerDatos( String[][] datos) {
		// TODO Auto-generated constructor stub
		ArrayList<ArrayList<Double>> datosList = new ArrayList<ArrayList<Double>>();
		
		for( int x = 1; x < datos.length; x++ ){
			ArrayList<Double> celda = new ArrayList<Double>();
			for( int y = 1; y < datos[x].length; y++){
				celda.add( Double.parseDouble(datos[x][y]));
			}
			datosList.add(celda);
		}
		
		return datosList;
	}
}
