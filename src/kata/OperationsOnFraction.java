package kata;

public class OperationsOnFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Fraction addition(Fraction frac1, Fraction frac2)
	{
		 Fraction fracToReturn = null;
		if(frac1.denomitor==frac2.denomitor)
		{
			 fracToReturn=new Fraction(frac1.numerator+frac2.numerator, frac2.denomitor);
		}
		printResult(fracToReturn);
		return fracToReturn;
	}
	
	public void printResult(Fraction frac)
	{
		System.out.println(frac.returnFraction());
	}

}
