class Dog {
    String name;
    int age;

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

public class Dogobject {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.age = 3;

        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's age: " + dog.age);

        dog.bark();
        dog.fetch();
    }
}
