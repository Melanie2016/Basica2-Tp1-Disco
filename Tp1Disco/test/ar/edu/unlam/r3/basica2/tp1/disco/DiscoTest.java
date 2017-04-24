package ar.edu.unlam.r3.basica2.tp1.disco;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {

	@Test
	public void testQueSeCreeUnDiscoConUnDeterminadoRadioInteriorYExterior() {
		Disco miDisco = new Disco (2.0,4.0);
	    Assert.assertEquals(2.0,miDisco.getRadioInterior(),0.1);
	    
	    Assert.assertEquals(4.0,miDisco.getRadioExterior(),0.1);
	}
	
	@Test
	public void testQueVerifiqueElPerimetroInteriorDeUnDiscoConDeterminadoRadioInterior(){
		Disco miDisco = new Disco (2.0,4.0);
		Assert.assertEquals(12.566,miDisco.perimetroInterior(),0.1);
	}
	
	@Test
	public void testQueVerifiqueElPerimetroExteriorDeUnDiscoConDeterminadoRadioExterior(){
		Disco miDisco = new Disco (2.0,4.0);
		Assert.assertEquals(25.132,miDisco.perimetroExterior(),0.1);
	}
	
	@Test
	public void testQueVerifiqueLaSuperficieDeUnDiscoConDeterminadoRadio(){
		Disco miDisco = new Disco (2.0,4.0);
		Assert.assertEquals(50.265, miDisco.superficie(),0.1);
	}
	
	

}
