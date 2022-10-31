public class TrainingGround {
    public static void main(String[] args) {
        //3
        Enemy enemy = new Enemy(100);

        //1
        /*Hero hero = new Hero("Аполон");
        hero.attackEnemy(enemy);*/

        //2
        Warrior warrior = new Warrior("Геракл");
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Корнеліус");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Анжей");
        archer.attackEnemy(enemy);

    }
}