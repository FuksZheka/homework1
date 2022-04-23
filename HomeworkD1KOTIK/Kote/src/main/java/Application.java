import module.Kotik;

public class Application {
    public static void main(String[] args){

        Kotik Kirya = new Kotik(15,"Kirya",5000,"\"Queen - Bohemian Rhapsody.mp3, MEEEEEOW");
        Kotik Vasya = new Kotik();
        Vasya.setKotik(20,"VASYAN",300,"Уйди, в моём сердце свечи гаснут\n" +
                "Становлюсь холодным");
        System.out.println(Kirya.getKotikName());
        System.out.println(Kirya.getKitweight());
        Kirya.live_another_day();
        if (Kirya.getMeow()==Vasya.getMeow()){
            System.out.println("I need a hero I'm holding out for a hero for differentiate they");
        }
        else {
            System.out.println("ONI NE ODINAKOVY!" );
        }
        System.out.println(Kirya.getCounterOfCats());
    }
}

