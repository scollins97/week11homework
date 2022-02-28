package application;

import java.util.NoSuchElementException;
import java.util.Optional;
import entities.Cheese;

public class OptionalCheese {
	public static void main(String[] args) {
		new OptionalCheese().run();
	}
	private void run() {
		Cheese cheese = cheesyMethod(Optional.of(new Cheese("Goat")));
		System.out.println(cheese);//prints out optional (to show that it's not empty)
		
		try {
			cheesyMethod(Optional.empty());//throwing in an empty optional to test method
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	private Cheese cheesyMethod(Optional<Cheese> optionalCheese) {
		return optionalCheese.orElseThrow(() -> new NoSuchElementException("No Cheese, Gromit"));
	}
}
