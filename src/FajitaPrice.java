import java.util.Objects;

public class FajitaPrice implements Chain {

	Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}

	public void calculate(PizzaSelector request)
	{
		if (Objects.equals(request.flavor(), "fajitapizza")) {
			System.out.println("fajita pizza Price:200.00");

		}
		else
			nextInChain.calculate(request);

	}

}
