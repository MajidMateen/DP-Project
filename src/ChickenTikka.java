import java.util.Objects;

public class ChickenTikka implements Chain{
	
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain)
	{
		nextInChain = nextChain;
	}
	
	public void calculate(PizzaSelector request)
	{
		if(Objects.equals(request.getCalcMethod(), "chickentikka"))
		{
			System.out.println("chicken tikka pizza Price:400.00");
			
		}
		else 
			nextInChain.calculate(request);
		
	}

}
