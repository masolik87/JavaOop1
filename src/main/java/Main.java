import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Sniper man = new Sniper("Иван");
        XBowMan man1 = new XBowMan(1.0f, 1, 2, 3, 5, 5, 5,5, "");

        System.out.println(man.getInfo());
        System.out.println(man1.getInfo());

    }

    private static String getName(){
        String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

}
