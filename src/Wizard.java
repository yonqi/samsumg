public class Wizard extends Unit{
    protected int mana =100;

    public Wizard(String name) {
        super(name);
        power = 25;
        helth = 80;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", helth=" + helth +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    @Override
    public void attack(Unit unit) {
        if (mana >= 0){
            super.attack(unit);
            mana -=10;
        }

    }

    public void print(){
        System.out.println(this);
    }
    public void print (String str){
        System.out.println(str + " " + this);
    }
}
