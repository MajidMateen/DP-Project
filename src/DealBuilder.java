
public class DealBuilder {
	
	public Deal preapareNon_vegitable()
	{
		Deal deal=new Deal();
		deal.addItem(new ChickenSupreme());
		return deal;
	}
	
	public Deal preapareVegitable(){
		Deal deal=new Deal();
		deal.addItem(new CheeseMashroom());
		return deal;
		
		
	}

}
