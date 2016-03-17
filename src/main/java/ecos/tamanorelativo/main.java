package ecos.tamanorelativo;

 /**
* Nombre: Daniel m Alvarez                                                                       
* Fecha :  08/03/2016       
* Descripción: este programa genera una tabla de tamaños relativos para una lsiat de valores pregarcados       
*/

 
import java.util.ArrayList;

import logica.Calcular;
import logica.Datos;

/**
 * Descripción: este programa genera una tabla de tamaños relativos para una lista de valores pregarcados
 * @author Daniel m Alvarez
 * 
 */
public class main {
	// ----------------------------------------------------------
	// Métodos
	// ----------------------------------------------------------

	public static void main(String[] args) {

		String[][] datosTabla1 = {
			{"Class Name", "each_char", "string_read", "single_character", "each_line", "single_char", "string_builder", "string_manager", "list_clump", "list_clip", "string_decrementer", "Char", "Character", "Converter"},
			{"Class LOC", "18", "18", "25", "31", "37", "82", "82", "87", "89", "230", "85", "87", "558"},
			{"Number of Methods", "3", "3", "3", "3", "3", "5", "4", "4", "4", "10", "3", "3", "10"}
		};
		
		Datos datos = new Datos();
		ArrayList<ArrayList<Double>> tabla1 = datos.LeerDatos(datosTabla1);
		
		String[][] datosTabla2 = {
			{ "Chapter", "Preface", "Chapter 1", "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6", "Chapter 7", "Chapter 8", "Chapter 9", "Appendix A", "Appendix B", "Appendix C", "Appendix D", "Appendix E", "Appendix F"},
			{ "Pages", "7", "12", "10", "12", "10", "12", "12", "12", "12", "8", "8", "8", "20", "14", "18", "12"},
			{ "Pages", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}
		};
		ArrayList<ArrayList<Double>> tabla2 = datos.LeerDatos(datosTabla2);
		
		Calcular cal = new Calcular();

		System.out.println( "VS: " + cal.VS( tabla1.get(0), tabla1.get(1)));
		System.out.println( "S : " + cal.S( tabla1.get(0), tabla1.get(1)));
		System.out.println( "M : " + cal.M( tabla1.get(0), tabla1.get(1)));
		System.out.println( "L : " + cal.L( tabla1.get(0), tabla1.get(1)));
		System.out.println( "VL: " + cal.VL( tabla1.get(0), tabla1.get(1)));
		
		System.out.println( "VS: " + cal.VS( tabla2.get(0), tabla2.get(1)));
		System.out.println( "S : " + cal.S( tabla2.get(0), tabla2.get(1)));
		System.out.println( "M : " + cal.M( tabla2.get(0), tabla2.get(1)));
		System.out.println( "L : " + cal.L( tabla2.get(0), tabla2.get(1)));
		System.out.println( "VL: " + cal.VL( tabla2.get(0), tabla2.get(1)));
		
	} 

}
