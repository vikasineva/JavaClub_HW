public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + this.getName() + " атакував ворога");
        enemy.takeDamage(25);
    }
}