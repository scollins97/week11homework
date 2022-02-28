package application;

import java.util.stream.Collectors;
import entities.Cheese;

public class StreamingCheese {

	public static void main(String[] args) {
		new StreamingCheese().run();
	}
	
	private void run() {
		String myCheese = Cheese.getCheeses().stream()
				.map(Cheese::toString)
				.sorted()
				.collect(Collectors.joining(", "));
		System.out.println(myCheese);				
	}
}
