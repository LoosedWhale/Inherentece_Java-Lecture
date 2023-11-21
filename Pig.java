package animalv2;

public class Pig implements Animal {
	String name;
	int age;
	
	Pig(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String whatDoesTheAnimalDo() {
		return "Rolls around in the mud";
	}

	@Override
	public String whatDoesTheAnimalSay() {
		return "Says: Oink Oink";
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
		return "Eats: The souls of bacon";
	}

}
