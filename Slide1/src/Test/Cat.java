package Test;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void bark() {
		System.out.println(name + " meow, meow");
	}

}
