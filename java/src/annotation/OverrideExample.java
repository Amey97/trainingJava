package annotation;

class Animal {

	void eatsomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	@Override
	void eatsomething() {
		System.out.println("eating foods");
	}
}

class OverrideExample {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatsomething();
	}
}
