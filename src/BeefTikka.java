import java.util.Objects;

public class BeefTikka implements Chain {

	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}

	public void calculate(PizzaSelector request) {
		
		if (Objects.equals(request.getCalcMethod(), "beeftikka")) {
			System.out.println("beef tikka pizza Price:600.00");

		} 
		else
		  System.out.println("request cannot be handled");

	}

}
