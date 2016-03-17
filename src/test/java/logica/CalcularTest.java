package logica;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import logica.Calcular;

public class CalcularTest {


	Datos datos = new Datos();
	
	String[][] datosTabla2 = {
			{ "Chapter", "Preface", "Chapter 1", "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6", "Chapter 7", "Chapter 8", "Chapter 9", "Appendix A", "Appendix B", "Appendix C", "Appendix D", "Appendix E", "Appendix F"},
			{ "Pages", "7", "12", "10", "12", "10", "12", "12", "12", "12", "8", "8", "8", "20", "14", "18", "12"},
			{ "Pages", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}
		};
		ArrayList<ArrayList<Double>> tabla2 = datos.LeerDatos(datosTabla2);
		Calcular tr = new Calcular();
	
	@Test
	public void testSumatoria() {
		
//		fail("Not yet implemented");
	
			double resultadoEsperadoSumatoria = 187;
			double resultado = tr.Sumatoria( tabla2.get(0));
			assertEquals( resultadoEsperadoSumatoria, resultado, 0.0001);
	}

	@Test
	public void testX() {

		double[] columnaX ={ 7.0000, 12.0000, 10.0000, 12.0000, 10.0000, 12.0000, 12.0000, 12.0000, 12.0000, 8.0000, 8.0000, 8.0000, 20.0000, 14.0000, 18.0000, 12.0000};
		ArrayList<Double> resultadoEsperadoX = new ArrayList<Double>();
		for( double x: columnaX )
			resultadoEsperadoX.add( x );
		
		ArrayList<Double> resultado = tr.X( tabla2.get(0), tabla2.get(1));
		for( int x = 0; x < resultadoEsperadoX.size(); x++)
			assertEquals( resultadoEsperadoX.get(x), resultado.get(x), 0.0001);
				
	}

	@Test
	public void testLN() {
		
		double[] columnaLN = {1.9459, 2.4849, 2.3026, 2.4849, 2.3026, 2.4849, 2.4849, 2.4849, 2.4849, 2.0794, 2.0794, 2.0794, 2.9957, 2.6391, 2.8904, 2.4849 };
		ArrayList<Double> resultadoEsperadoLN = new ArrayList<Double>();
		for( double x: columnaLN)
			resultadoEsperadoLN.add( x);
		
		ArrayList<Double> resultado = tr.LN( tabla2.get(0), tabla2.get(1));
		
		for( int x = 0; x < resultadoEsperadoLN.size(); x++)
			assertEquals( resultadoEsperadoLN.get(x), resultado.get(x), 0.0001);
	}

	@Test
	public void testSumatoriaLN() {
		
		double resultadoEsperadoSumatoriaLN = 38.7089;
		double resultado = tr.SumatoriaLN( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoSumatoriaLN, resultado, 0.0001);
	}

	@Test
	public void testPromedioLN() {
		double resultadoEsperadoPromedioLN = 2.4193;
		double resultado = tr.PromedioLN( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoPromedioLN, resultado, 0.0001);
	}

		
	@Test
	public void testSumatoriaLnAvg2() {
		double resultadoEsperadoSumatoriaLnAvg2 = 1.2305;
		double resultado = tr.SumatoriaLnAvg2( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoSumatoriaLnAvg2, resultado, 0.0001);
		
	}
	
	
	@Test
	public void testVarianzaLnX() {
		double resultadoEsperadoVarianzaLnX = 0.0820;
		double resultado = tr.varianzaLnX( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoVarianzaLnX, resultado, 0.0001);
	}

	@Test
	public void testOmega() {
		double resultadoEsperadoOmega = 0.2864;
		double resultado = tr.Omega( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoOmega, resultado, 0.0001);
	}

	@Test
	public void testVS() {
		double resultadoEsperadoVS = 6.3375;
		double resultado = tr.VS( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoVS, resultado, 0.0001);
	}

	@Test
	public void testS() {
		double resultadoEsperadoS = 8.4393;
		double resultado = tr.S( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoS, resultado, 0.0001);
	}

	@Test
	public void testM() {
		double resultadoEsperadoM = 11.2381;
		double resultado = tr.M( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoM, resultado, 0.0001);
	}

	@Test
	public void testL() {
		double resultadoEsperadoL = 14.9650;
		double resultado = tr.L( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoL, resultado, 0.0001);
	}

	@Test
	public void testVL() {
		double resultadoEsperadoVL = 19.9280;
		double resultado = tr.VL( tabla2.get(0), tabla2.get(1));
		assertEquals( resultadoEsperadoVL, resultado, 0.0001);
	}

}
