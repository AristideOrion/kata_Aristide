package kata;

public class Fraction {
	
	
	Integer numerator;
	Integer denomitor;
	
	public Fraction(Integer numerator, Integer denominator)
	{
		this.denomitor=denominator;
		this.numerator=numerator;
	}
	
	
	
	public String returnFraction()
	{
		return this.numerator+"/"+this.denomitor;
		
	}
	

}
