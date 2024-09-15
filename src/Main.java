//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss evil = new Boss();
        evil.setDamage(234);
        evil.setHealth(100);
        evil.setDefenceType("Magic");


        System.out.println("Boss has a:"+evil.getHealth()+" HP");
        System.out.println("Boss hit with:"+evil.getDamage()+" attack");
        System.out.println("Boss has a defence for:"+evil.getDefenceType());

        Hero[] herofactory = createHeroes();
        for(Hero h : herofactory){
             System.out.println("Hero has: "+h.getHealth()+" and"+h.getPower()+" power and"+h.getDamage()+"damage hit");
        }

    }
    public static Hero[] createHeroes(){
        Hero[] heroes = new Hero[3];
        Hero aragorn = new Hero(70,122);
        Hero legolas = new Hero(50, 12.4,"Speed");
        Hero himli = new Hero(130, 150.4,"Berserk");
        heroes[0] = aragorn;
        heroes[1] = legolas;
        heroes[2] = himli;

        return heroes;


    }
}