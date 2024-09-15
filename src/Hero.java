public class Hero {
    private int health;
    private double damage;
    private String power;

    public Hero(int health, double damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, double damage, String power) {
        this.health = health;

        this.power = power;
        this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public String getPower() {
        if (this.power == null){
            this.power = "no skill";
        }
        return power;
    }
}
