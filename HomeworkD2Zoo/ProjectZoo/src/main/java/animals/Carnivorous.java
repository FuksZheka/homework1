package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, int prettiness, int weight) {
        super(name, prettiness, weight);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
            System.out.println("Right food type");


        } else {
            System.out.println("It's a misery. Uncorrected food type, attention please");
        }
    }
}
