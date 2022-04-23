package animals.carnivorous;

import animals.Carnivorous;
import animals.intetface.Swim;

public class Catfish extends Carnivorous implements Swim {

    public Catfish(String name, int prettiness, int weight) {
        super(name, prettiness, weight);

    }

    public void swim() {
        System.out.println("Ti menya ne dogonish, ya riba i can swim");
    }
}
