package Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] agrs) {
		ArrayList<Animal> dspet = new ArrayList<Animal>();
		dspet.add(new Cat("Mèo Na", 2));
		dspet.add(new Dog("Chó Lu", 3));
		for (Animal pet : dspet) {
			pet.eat();
			 if (pet instanceof Cat) {
				 ((Cat) pet).bark();
			 } else if (pet instanceof Dog) {
				 ((Dog) pet).bark();
			 }
			 else {
				 System.out.println("Không xác định được loại thú cưng");
			 }
		}
	}
}
