package animalv2;

public class Farm {
	public static void main(String[] args) {
	Cow cow = new Cow("Wueen", 9);
	Sheep sheep = new Sheep("Shaun", 2);
	Pig pig = new Pig("Gorge", 5);
	System.out.println(cow.name + "3 " + cow.whatDoesTheAnimalDo());
	System.out.println(sheep.name + " " + sheep.whatDoesTheAnimalSay());
	System.out.println(pig.name + " " + pig.whatDoesTheAnimalEat());
	}
}
