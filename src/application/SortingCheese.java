package application;

import java.util.List;
import entities.Cheese;

public class SortingCheese {
	
	public static void main(String[] args) {
		new SortingCheese().run();
	}
	private void run() {
		List<Cheese> lambdaCheese = sortByLambda();
		System.out.println(lambdaCheese);
		List<Cheese> MRCheese = sortByMethodReference();
		System.out.println(MRCheese);
	}//prints each method of sorting out to the console
	
	private List<Cheese> sortByLambda(){
		List<Cheese> cheeses = Cheese.getCheeses();
		cheeses.sort((c1, c2) -> Cheese.compare(c1, c2));
		return cheeses;
	}
	private List<Cheese> sortByMethodReference(){
		List<Cheese> cheeses = Cheese.getCheeses();
		cheeses.sort(Cheese::compare);
		return cheeses;
	}
	
}
