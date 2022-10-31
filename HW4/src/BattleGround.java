import java.util.Scanner;

public class BattleGround {
    private static Warrior warrior;
    private static Archer archer;
    private static Mage mage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я персонажу: ");
        String name = scanner.next();
        Enemy enemy = new Enemy(80);
        int choose, hero = 0;
        System.out.print("Доступні класи:\n1 - Воїн\n2 - Лучник\n3 - Маг\nОберіть клас для вашого персонажу: ");
        do {
            choose = scanner.nextInt();
            switch (choose) {
                case (1):
                    warrior = new Warrior(name);
                    hero = 1;
                    break;
                case (2):
                    archer = new Archer(name);
                    hero = 2;
                    break;
                case (3):
                    mage = new Mage(name);
                    hero = 3;
                    break;
                default:
                    System.out.print("Помилка! Такого класу нема. Спробуйте ще раз: ");
                    break;
            }
        } while (!(choose == 1) && !(choose == 2) && !(choose == 3));

        System.out.print("Доступні дії:\n1 - Атакувати ворога\n2 - Інфо про ворога\n3 - Завершити гру\nОберіть дію: ");
        do {
            choose = scanner.nextInt();
            switch (choose) {
                case (1):
                    switch (hero) {
                        case (1):
                            warrior.attackEnemy(enemy);
                            break;
                        case (2):
                            archer.attackEnemy(enemy);
                            break;
                        case (3):
                            mage.attackEnemy(enemy);
                            break;
                        default:
                            break;
                    }
                    System.out.print("Оберіть дію: ");
                    break;
                case (2):
                    System.out.println("ХП ворога = " + enemy.getHealth());
                    System.out.print("Оберіть дію: ");
                    break;
                case (3):
                    break;
                default:
                    System.out.print("Помилка! Такої дії нема. Спробуйте ще раз: ");
                    break;
            }
        } while (!(choose == 3));
    }
}