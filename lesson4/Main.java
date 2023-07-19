package lesson4;

public class Main {
    
}

class Fruit {
    private double weight;
    
    public Fruit(double weight) {
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
}

class Orange extends Fruit {
    public Orange(double weight) {
        super(weight);
    }
}

class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }
}

class GoldenApple extends Fruit {
    public GoldenApple(double weight) {
        super(weight);
    }
}

class FruitBox {
    private double weight;
    
    public FruitBox() {
        weight = 0;
    }
    
    public void add(Fruit fruit) {
        weight += fruit.getWeight();
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void pourInto(FruitBox otherBox) {
        otherBox.weight += this.weight;
        this.weight = 0;
    }
}