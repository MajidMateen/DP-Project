
public class FajitaPizza extends PizzaToppings{
	
	public FajitaPizza(IPizza temp){
		super(temp);
		System.out.println("Adding Fajita topping");
		
	}
	@Override
	public void getDiscription(){
		System.out.println("This is Fajita");
	}
	@Override
	public int getPrize()
	{
		return super.temp.getPrize()+250;
	}

}
