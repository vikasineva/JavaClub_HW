public abstract class Hero {
    private final String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);
}