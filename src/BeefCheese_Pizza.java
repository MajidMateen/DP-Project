
public class BeefCheese_Pizza extends PizzaToppings {
	
	public BeefCheese_Pizza(IPizza temp){
	
		super(temp);
		System.out.println("Adding Beef Cheese Topping");
	}
	
	@Override
	public void getDiscription(){
		System.out.println("");
	}
	
	@Override
	public int getPrize(){
		return super.temp.getPrize()+500;
	}

}
