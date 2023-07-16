abstract class Animal   
{
        private String name;
        private int age;
        private String size;

        public Animal(String name, int age, String size) {
            this.name = name;
            this.age = age;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSize() {
            return size;
        }

        public abstract void eat(String food);

        public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + ".");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + ".");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + ".");
    }

    @Override
    public void makeSound() {
        System.out.println("Pew!");
    }
}
class Fish extends Animal {
    public Fish(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + ".");
    }

    @Override
    public void makeSound() {
        System.out.println("!");
    }
}
public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Buddy", 3, "Medium");
        animals[1] = new Cat("Whiskers", 4, "Small");
        animals[2] = new Bird("Tweetie", 2, "Tiny");
        animals[3] = new Fish("Nemo", 1, "Small");

        String food = "some food";

        for (Animal animal : animals) {
            animal.eat(food);
            animal.makeSound();
        }
    }
}