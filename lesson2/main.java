package lesson2;

interface HealthIndicator {
    int getCurrentHealth();
}

interface EnergyIndicator {
    int getCurrentEnergy();
}

interface NameOfIndicator {
    String getCurrentName();
}

class Building implements HealthIndicator {
    private int currentHealth;

    public Building(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }
}

class Hero implements HealthIndicator, EnergyIndicator  
{    
    private int currentHealth;
    private int currentEnergy;

    public Hero(int currentHealth, int currentEnergy) {
        this.currentHealth = currentHealth;
        this.currentEnergy = currentEnergy;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public int getCurrentEnergy() {
        return currentEnergy;
    }
}

class NeutralCharacter implements HealthIndicator {
    private int currentHealth;

    public NeutralCharacter(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }
}

class Render {
    public static void showIndicator(HealthIndicator object) {
        System.out.println("Indicator:");
        System.out.println("Health: " + object.getCurrentHealth());

        if (object instanceof EnergyIndicator) {
            EnergyIndicator energyObject = (EnergyIndicator) object;
            System.out.println("Energy: " + energyObject.getCurrentEnergy());
        }
    }
}

public class main {
    public static void main(String[] args) {
        Building building = new Building(100);
        Render.showIndicator(building);

        Hero hero = new Hero(90, 50);
        Render.showIndicator(hero);

        NeutralCharacter neutralCharacter = new NeutralCharacter(75);
        Render.showIndicator(neutralCharacter);
    }
}