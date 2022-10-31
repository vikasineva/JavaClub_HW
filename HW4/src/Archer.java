public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + this.getName() + " атакував ворога");
        enemy.takeDamage(27);
    }
}