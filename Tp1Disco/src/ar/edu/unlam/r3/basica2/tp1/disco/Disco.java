package ar.edu.unlam.r3.basica2.tp1.disco;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	
	public Disco( Double radioInterior, Double radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		
	}
	
	public Double perimetroInterior(){
		
		return 2 * Math.PI * this.radioInterior;
	}
	
	public Double perimetroExterior(){
		
		return 2 * Math.PI * this.radioExterior;
	}
	
	public Double superficie(){
		
		Double radioTotal = this.radioInterior + this.radioInterior;
		
		return Math.PI*(radioTotal*radioTotal);
	}
	
	
	
	
}
