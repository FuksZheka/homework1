package animals.herbivore;

import animals.Herbivore;
import animals.intetface.Fly;
import animals.intetface.Run;
import animals.intetface.Swim;
import animals.intetface.Voice;


public class Cow extends Herbivore implements Run, Voice {
    String voice = "";

    public Cow(String name, int prettiness, int weight, String voice) {
        super("Cow "+name, prettiness, weight);
        this.voice = voice;
    }

    @Override
    public String voice() {
        return this.voice;
        // System.out.println("Let me show my voice" + voice);
    }

    @Override
    public void run() {
        System.out.println(" HE CAN RUUUUUUUUUUUUUUUUUN, running in the 90's.mp3 ");
    }
}
