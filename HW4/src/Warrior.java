public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воїн " + this.getName() + " атакував ворога");
        enemy.takeDamage(30);
    }
}