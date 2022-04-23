import animals.Animal;
import animals.carnivorous.Catfish;
import animals.carnivorous.Tiger;
import animals.herbivore.Beaver;
import animals.herbivore.Cow;
import animals.herbivore.Duck;
import animals.intetface.Swim;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Swim [] pool = {new Duck("Chik", 8, 50, "CRYA"), new Catfish("Chik-Chirik", 8, 50), new Beaver("Chik-chririk", 8, 50, "CRYA")};

        Worker Vasya = new Worker("Vasya");
        Tiger Sherhan = new Tiger("Sherhan", 10, 150, "Meow");
        Beaver Bibor = new Beaver("Viktor", 100, 10, "KUSAAAAAAAAAAAAAAT'");
        Cow Nastya = new Cow("Nastya", 0, 500, "MOOOOOOOOOOOOU");
        Grass Conola = new Grass(5, 6);


        Vasya.getVoice(Sherhan);
        Vasya.getVoice(Nastya);
        Vasya.feed(Nastya, Conola);


        for (int i=0; i <3; i++){
            pool[i].swim();
        }


    }
}
