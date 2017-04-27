
public class ChickenTikka implements Chain{
	
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain)
	{
		nextInChain = nextChain;
	}
	
	public void calculate(PizzaSelector request)
	{
		if(request.getCalcMethod()=="chicken tikka")
		{
			System.out.println("chicken tikka pizza Price:400.00");
			
		}
		else 
			nextInChain.calculate(request);
		
	}

}
