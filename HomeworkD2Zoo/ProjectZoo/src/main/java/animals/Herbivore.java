package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int prettiness, int weight) {
        super(name, prettiness, weight);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            super.eat(food);

        } else {
            System.out.println("I can't it. It's a murder");
        }


    }
}
