
public class BarBQ_Pizza extends PizzaToppings{
	

	public BarBQ_Pizza(IPizza temp){
		super(temp);
		System.out.println("Adding Bar-BQ Topping");
	}
	
	@Override
	public void getDiscription(){
		System.out.println("");
	}
	
	@Override
	public int getPrize(){
		return super.temp.getPrize()+300;
	}
}
