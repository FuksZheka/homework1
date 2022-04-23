package animals;

import food.Food;

public class Animal {
    String name;
    int prettiness;
    int weight;
    int satiety;

    public String getName() {
        return this.name;
    }

    public void eat(Food food) {
        this.satiety += food.getSatiety();
    }

    Animal(String name, int prettiness, int weight) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.satiety = 15;
    }

}
