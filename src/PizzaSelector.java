
public class PizzaSelector {
	
	private String calculationMethod;
	
	String pizzatype;
	String flavor;
	
	public PizzaSelector(String pizzatype1,String flavor1)
	{
		this.pizzatype=pizzatype1;
		this.flavor=flavor1;
	}
	
	
	
	public String pizzatype()
	{
		return pizzatype;
	}
	public String flavor()
	{
		return flavor;
	}
	public String getCalcMethod()
	{
		return calculationMethod;
	}

}
