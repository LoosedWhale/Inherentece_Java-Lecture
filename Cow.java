package animalv2;

public class Cow implements Animal {
	String name;
	int age;
	
	Cow(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String whatDoesTheAnimalDo() {
		return "Dies for my sins";
	}

	@Override
	public String whatDoesTheAnimalSay() {
		return "Says: MOOOOOO";
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public String whatDoesTheAnimalEat() {
		return "Eats: Burgers";
	}
}
