public class Unit {
    protected String name;
    public Unit(String name) {
        this.name=name;
        Game.countOfUnits++;
    }

    protected int helth = 100;
    protected int defence = 100;
    protected int power =10;

    protected float criticalChance =0.1f;
    protected float parryChance = 0.1f;
    public int getHelth(){//getter
        return helth;
    }
    public void setHelth(int helth){
        this.helth=helth;//this - работаем с обьектом
    }

    public int getDefence() {
        return defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void attack (Unit unit){
        unit.getDamage(power);
    }

    public void getDamage ( int damage){
        this.helth-=damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "helth=" + helth +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
