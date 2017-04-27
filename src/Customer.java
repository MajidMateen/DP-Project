import java.io.Console;
import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		

		DealBuilder dealbuilder = new DealBuilder();
		  
		System.out.println("Press 4 for getting pizza prices");
		System.out.println(" Pizza's Deal");
		System.out.println("Press 1 for NonVegitable Pizza");
		System.out.println("Press 2 for Vegitable Pizza");
		System.out.println("Press 3 for Select differnt  Pizza Flavor");
		int input = scanner.nextInt();
		
		if(input ==3){
			
	         IPizza pizza=new BarBQ_Pizza(new FajitaPizza (new FajitaPizza(new PizzaBase())));
			System.out.println("total price:"+pizza.getPrize());
		}


		if (input == 1) {

			Deal nonVeg = dealbuilder.preapareNon_vegitable();
			System.out.println("Non Veg Pizza Deal");
			nonVeg.showItems();

			System.out.println("Total Cost:" + nonVeg.getPrice());

		} else if (input == 2) {

			

			Deal veg = dealbuilder.preapareVegitable();
			System.out.println("Vegitable Pizza Deal");
			veg.showItems();
			
			
			
			
			

		}
		
		else if(input==4)
		{
			Chain chainCallFajita=new FajitaPrice();
			Chain chainCallTikka=new ChickenTikka();
			Chain chainCallBeef=new BeefTikka();
			
			chainCallFajita.setNextChain(chainCallTikka);
			chainCallTikka.setNextChain(chainCallBeef);
			
			
			
			PizzaSelector ps=new PizzaSelector("SmallPizza","FajitaPizza");
		
			chainCallFajita.calculate(ps);
		}

	}

}
