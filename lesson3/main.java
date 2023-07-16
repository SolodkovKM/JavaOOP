package lesson3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Container implements Comparable<Container>, Iterable<Box> {
    private List<Box> boxes;

    public Container() {
        this.boxes = new ArrayList<>();
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Box box : boxes) {
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    public List<Box> getBoxes()  {
        return boxes;
    }

    @Override
    public int compareTo(Container other) {
        return Integer.compare(getWeight(), other.getWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}

class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container c1, Container c2) {
        return Integer.compare(c1.getBoxes().size(), c2.getBoxes().size());
    }
}

class Box {
    private int weight;

    public Box(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

public class main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addBox(new Box(10000));
        container.addBox(new Box(100));
        container.addBox(new Box(1000));
        System.out.println(container.getWeight());
    }
}