# Animal inheritance java lecture 

## Overview

This project includes a simple Java program that demonstrates the use of interfaces and classes to represent different animals on a farm.

## Code Files

### Animal.java

```java
package animalv2;

public interface Animal {
    String whatDoesTheAnimalDo();
    String whatDoesTheAnimalSay();
    String whatDoesTheAnimalEat();
    void setName(String name);
    void setAge(int age);
}
```
### Cow.java

```java 
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
```
### Pig.java

```java 
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

```
### Sheep.java

```java 
package animalv2;

public class Sheep implements Animal {
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

```
### Farm.java

```java
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
```

# Understanding Inheritance in Java

Inheritance is a fundamental concept in object-oriented programming (OOP) and is widely used in Java. It allows one class to inherit the properties and behaviors of another class, fostering code reuse and creating a hierarchical relationship between classes.

## Need for Inheritance

1. **Code Reusability:**
   - Inheritance promotes reusability by allowing a class to use the properties and methods of an existing class. This reduces redundancy and makes the code more modular.

2. **Method Overriding:**
   - Subclasses can provide a specific implementation for a method that is already defined in their superclass. This is known as method overriding and allows for customization of behavior in derived classes.

3. **Polymorphism:**
   - Inheritance is a key factor in achieving polymorphism, where objects of different classes can be treated as objects of a common base class. This enables more generic and flexible coding.

4. **Logical Organization:**
   - Inheritance helps in organizing classes in a logical hierarchy. Common features can be placed in a base class, and specific features can be extended in subclasses, providing a clear and structured design.

## Use of Inheritance in Java

In Java, the `extends` keyword is used to implement inheritance. Let's consider a simple example with animals:

```java
// Base class (superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
```
### In this example:

`Dog` is a subclass of `Animal`.\
`Dog` inherits the `eat` and `sleep` methods from the `Animal` class.\
It also has its own method, `bark`. \
Now, you can create instances of `Dog` and access both the methods from `Animal` and the specific method from `Dog`:
```java 
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Animal
        myDog.bark();  // Specific to Dog
    }
}
```
### This results in the following output 
```java
Animal is eating
Animal is sleeping
Dog is barking

```
In summary, inheritance in Java provides a way to create a new class based on an existing class, facilitating code reuse, customization, and a more organized class hierarchy.
