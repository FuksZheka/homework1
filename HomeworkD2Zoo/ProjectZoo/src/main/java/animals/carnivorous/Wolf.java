package animals.carnivorous;

import animals.Carnivorous;
import animals.intetface.Run;
import animals.intetface.Voice;


public class Wolf extends Carnivorous implements Run, Voice {
    String voice = "";

    public Wolf(String name, int prettiness, int weight, String voice) {
        super("Wolf"+name, prettiness, weight);
        this.voice = voice;
    }

    @Override
    public void run() {
        System.out.println(" HE CAN RUUUUUUUUUUUUUUUUUN, running in the 90's.mp3 ");
    }

    @Override
    public String voice() {
        return this.voice;
        // System.out.println("Let me show my voice" + voice);
    }
}
