import java.util.ArrayList;

public class Deal {
	
	public ArrayList<I_Items> items =new ArrayList<I_Items>();
	
	public void addItem(I_Items item)
	{
		items.add(item);
	}
	
	public float getPrice()
	{
		float cost=0.0f;
		for (I_Items item:items){
			cost +=item.price();
	}
		return cost;
	}
	
	public void showItems()
	{
		for(I_Items item:items){
			System.out.println("Item:"+item.name());
			System.out.println("Price:"+item.price());
		}
	}

}
