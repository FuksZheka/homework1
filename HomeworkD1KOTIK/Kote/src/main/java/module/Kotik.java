package module;

import java.util.Scanner;
import java.util.Set;

public class Kotik {
    public void setKotik
            (
                    int prettiness,
                    String name,
                    int weight,
                    String meow) {
        this.kotikName = name;
        this.kitweight = weight;
        this.prettiness = prettiness;
        this.meow = meow;
    }

    public int getCounterOfCats() {
        return counterOfCats;
    }

    public String getKotikName() {
        return kotikName;
    }

    public int getKitweight() {
        return kitweight;
    }

    public String getMeow() {
        return meow;
    }


    private String kotikName;
    private int kitweight;
    private int prettiness;
    private String meow;

    private String[] foodlist = new String[]{"pashtet", "sosiska", "Kotleta"};
    static int counterOfCats;

    public Kotik(
            int prettiness,
            String name,
            int weight,
            String meow) {
        this.kotikName = name;
        this.kitweight = weight;
        this.prettiness = prettiness;
        this.meow = meow;
        this.food = 15;
        counterOfCats++;

    }

    public Kotik() {
        food = 10;
        counterOfCats++;
    }

    public int food;

    public void sleep() {
        if (food <= 0)
            System.out.println("module.Kotik slishkom goloden - pokormite kotika");

        else {
            food = food - 2;
            System.out.println("module.Kotik spit, on ustal kotik myshek progonyal");

        }
    }

    public void play() {
        if (food <= 0)
            System.out.println("module.Kotik slishkom goloden - pokormite kotika");
        else {
            food = food - 2;
            System.out.println(" module.Kotik baluetsya s lentochkoj, poletela vaza - nichego strashnogo)");
        }
    }

    public void steel_sosiska() {
        if (food <= 0)
            System.out.println("module.Kotik slishkom goloden - pokormite kotika");
        else {
            food = food - 2;
            System.out.println("""
                    Plachet Kiska v koridore.
                    U nee
                    Bol'shoe gore:
                    Zlye lyudi
                    Bednoj Kiske
                    Ne dayut
                    Ukrast'
                    Sosiski!""");
        }
    }

    public void meow() {
        if (food <= 0)
            System.out.println("module.Kotik slishkom goloden - pokormite kotika");
        else {
            food = food - 2;
            System.out.println(meow);
        }
    }

    public void gav() {
        if (food <= 0)
            System.out.println("module.Kotik slishkom goloden - pokormite kotika");
        else {
            food = food - 2;
            System.out.println("Nu, drug moj, ubedilsya, chto vo dvore tebya zhdali odni nepriyatnosti");
        }
    }

    public boolean eat() {
        eat(foodlist[(int) (Math.random() * 2)], 5);
        return true;
    }

    public boolean eat(int sosiska) {
        food = food + sosiska;
        System.out.println("Kotya(ra) pozhral chto-to");
        return true;
    }

    public boolean eat(String foodName, int satturation) {
        food = food + satturation;
        System.out.println("module.Kotik sper i skushol" + foodName);
        return true;
    }

    public void live_another_day() {
        int commanda_kota = 0;
        int counter = 0;
        for (counter = 0; counter < 24; counter++) {
            commanda_kota = (int) (1 + Math.random() * 6);
            switch (commanda_kota) {
                case (1):
                    System.out.println(counter);
                    sleep();
                    break;
                case (2):
                    System.out.println(counter);
                    play();
                    break;
                case (3):
                    System.out.println(counter);
                    steel_sosiska();
                    break;
                case (4):
                    System.out.println(counter);
                    meow();
                    break;
                case (5):
                    System.out.println(counter);
                    gav();
                    break;
                case (6):
                    System.out.println(counter);
                    eat();
                    break;
            }
        }
    }
}

