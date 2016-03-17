package logica;

import java.util.ArrayList;

/**
* Nombre: Daniel m Alvarez                                                                       
* Fecha :  08/03/2016       
* Descripción: este programa genera una tabla de tamaños relativos para una lsiat de valores pregarcados       
*/


/**
 * Clase que genera los calculos para estimar el tamaño de una lista de valores
 * @author Daniel m Alvarez 
 *
 */



public class Calcular {
	
	/**
	 * Metodo Sumatoria
	 * @param recive un arraylist doble 
	 * @return retorna valor de la sumatoria
	 */
	public double Sumatoria( ArrayList<Double> lista){
		double resultado = 0;
		for( double x: lista)
			resultado += x;
		return resultado;
	}
	/**
	 * Metodo X este arraylist contiene el tamño total de la lista de datos 
	 * @param recive dos arraylist double 
	 * @return retorna arraylist con la division entre la lista uno y la lista dos es el valor X
	 */
	public ArrayList<Double> X( ArrayList<Double> lista1, ArrayList<Double> lista2) {
		// TODO Auto-generated constructor stub
		ArrayList<Double> resultado = new ArrayList<Double>(); 
		for( int x = 0; x < lista1.size(); x++)
			resultado.add( lista1.get(x) / lista2.get(x));
		return resultado;
	}
	
	/**
	 * Metodo LN saca el logaritmo natural
	 * @param recive dos arraylist double 
	 * @return retorna arraylist   con el logaritimo natural de X
	 */
	public ArrayList<Double> LN( ArrayList<Double> lista1, ArrayList<Double> lista2){
		ArrayList<Double> resultado = new ArrayList<Double>();
		ArrayList<Double> X = X( lista1, lista2);
		for( double x: X)
			resultado.add( Math.log(x));
		return resultado;
	}
	/**
	 * Metodo SumatoriaLN suma de los LN de X
	 * @param recive dos arraylist double 
	 * @return retorna Double con la sumatoria logaritmo natural de X
	 */
	
	public double SumatoriaLN( ArrayList<Double> lista1, ArrayList<Double> lista2){
		ArrayList<Double> ln = LN( lista1, lista2);
		return Sumatoria( ln);
	}
	/**
	 * Metodo PromedioLN promedio de los LN de X
	 * @param recive dos arraylist double 
	 * @return retorna Double con la promedio logaritmo natural de X
	 */
	public double PromedioLN( ArrayList<Double> lista1, ArrayList<Double> lista2){
		double sumatoriaLn = SumatoriaLN( lista1, lista2);
		return sumatoriaLn / lista1.size();
	}
	/**
	 * Metodo LNAvg2 lista ( (ln-avg)^2)
	 * @param recive dos arraylist double 
	 * @return retorna un arrgeglo con ( (ln-avg)^2)
	 */
	public ArrayList<Double> LnAvg2( ArrayList<Double> lista1, ArrayList<Double> lista2){
		ArrayList<Double> resultado = new ArrayList<Double>();
		ArrayList<Double> ln = LN( lista1, lista2);
		double promedioLN = PromedioLN( lista1, lista2);
		for( double x: ln)
			resultado.add( ( x - promedioLN) * ( x - promedioLN));
		return resultado;
	}
	/**
	 * Metodo Sumatoria LNAvg2 sumatoria( (ln-avg)^2)
	 * @param recive dos arraylist double 
	 * @return retorna Double sumatoria( (ln-avg)^2)
	 */
	public double SumatoriaLnAvg2( ArrayList<Double> lista1, ArrayList<Double> lista2){
		double resultado = 0;
		for( double x: LnAvg2( lista1, lista2))
			resultado += x;
		return resultado;
	}
	
	/**
	 * Metodo varianzaLnX retorna la varianza LnX
	 * @param recive dos arraylist double 
	 * @return retorna Double varianza
	 */
	public double varianzaLnX( ArrayList<Double> lista1, ArrayList<Double> lista2){
		return SumatoriaLnAvg2( lista1, lista2) / ( lista1.size() - 1);
	}
	/**
	 * Metodo Omega retorna omega( (ln-avg)^2)
	 * @param recive dos arraylist double 
	 * @return retorna Double omega
	 */
	public double Omega( ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.sqrt( varianzaLnX( lista1, lista2));
	}
	/**
	 * Metodo VS retorna VS de los datos iniciales
	 * @param recive dos arraylist double 
	 * @return retorna Double VS
	 */
	public double VS(ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.exp(PromedioLN( lista1, lista2) - 2 * Omega( lista1, lista2));
	}
	/**
	 * Metodo S retorna VS de los datos iniciales
	 * @param recive dos arraylist double 
	 * @return retorna Double S
	 */
	public double S(ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.exp(PromedioLN( lista1, lista2) - Omega( lista1, lista2));
	}
	/**
	 * Metodo M retorna M de los datos iniciales
	 * @param recive dos arraylist double 
	 * @return retorna Double M
	 */
	public double M(ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.exp( PromedioLN( lista1, lista2));
	}
	/**
	 * Metodo L retorna L de los datos iniciales
	 * @param recive dos arraylist double 
	 * @return retorna Double L
	 */
	public double L(ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.exp( PromedioLN( lista1, lista2) + Omega( lista1, lista2));
	}
	/**
	 * Metodo VL retorna VL de los datos iniciales
	 * @param recive dos arraylist double 
	 * @return retorna Double VL
	 */
	public double VL(ArrayList<Double> lista1, ArrayList<Double> lista2){
		return Math.exp( PromedioLN( lista1, lista2) + 2 *  Omega( lista1, lista2));
	}
}
