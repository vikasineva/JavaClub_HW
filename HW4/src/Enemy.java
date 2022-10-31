public class Enemy implements Mortal {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy (int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        if (this.isAlive()) {
            if (damage < this.health) this.health -= damage;
            else {
                this.health = 0;
                System.out.println("Ворога вбито");
            }
        }
        else System.out.println("Ворог вже мертвий, урон не нанесено");
    }
}
