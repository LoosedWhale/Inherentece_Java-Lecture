package animalv2;

public class Sheep implements Animal{
	String name;
	int age;
	
	Sheep(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String whatDoesTheAnimalDo() {
		return "Walks around looking all cute and that";
	}

	@Override
	public String whatDoesTheAnimalSay() {
		return "Says: BAAAAAA";
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
		return "Eats: Grass";
	}
}
