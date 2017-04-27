
public class BeefTikka implements Chain {
	
	private Chain nextInChain;
	public void setNextChain(Chain nextChain)
	{
		nextInChain = nextChain;
	}
	
	public void calculate(PizzaSelector request)
	{
		if(request.getCalcMethod
				()=="beef tikka pizza")
		{
			System.out.println("beef tikka pizza Price:600.00");
			
		}
		else 
			nextInChain.calculate(request);
		
	}

}
