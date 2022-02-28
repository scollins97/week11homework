package entities;

import java.util.ArrayList;
import java.util.List;

public class Cheese {
	private String name;
	
	public static List<Cheese> cheeses = List.of(
			new Cheese("Sharp Chedder"),
			new Cheese("Gouda"),
			new Cheese("Mozzarella"),
			new Cheese("Brie")
			);
	
	
	public Cheese(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " Cheese";
		
	}
	public static int compare(Cheese c1, Cheese c2) {
		return c1.name.compareTo(c2.name);
		//compares based on alphabetical order
	}
	public static List<Cheese> getCheeses(){
		return new ArrayList<>(cheeses);
		//because the list above is an unmodifiable list, 
		//this method will return a list that is modifiable
	}
}
