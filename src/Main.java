// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();

        Unit unit1= new Unit("sasha");
        Unit unit2 = new Unit("alex");
/*
        System.out.println(unit1);
        System.out.println(unit2);
        unit1.attack(unit2);
        System.out.println(unit1);
        System.out.println(unit2);
        unit2.attack(unit1);
        System.out.println(unit1);
        System.out.println(unit2);*/
        Game game2=new Game();
        Wizard wizard1 = new Wizard("dsfd");
        Wizard wizard2 = new Wizard("ed");
        wizard1.print();
        wizard2.print("sdfgs");
        /*
        System.out.println(wizard1);
        System.out.println(wizard2);
        wizard1.attack(wizard2);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);*/
    }
}