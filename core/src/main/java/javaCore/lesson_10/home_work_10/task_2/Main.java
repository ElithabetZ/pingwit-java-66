package javaCore.lesson_10.home_work_10.task_2;

public class Main {
    public static void main(String[] args) {
        Branch[] branchesBanana = {
                new Branch(Fruit.BANANA, 25),
                new Branch(Fruit.BANANA, 45),
                new Branch(Fruit.BANANA),
                new Branch(Fruit.BANANA, 25),
                new Branch(Fruit.BANANA, 10)
        };

        Branch[] branchesKokos = {
                new Branch(Fruit.KOKOS, 25),
                new Branch(Fruit.KOKOS, 45),
                new Branch(Fruit.KOKOS),
                new Branch(Fruit.KOKOS, 25),
                new Branch(Fruit.KOKOS, 10)
        };
        Tree treeBanana = new Tree(Fruit.BANANA, branchesBanana);
        Tree treeKokos = new Tree(Fruit.KOKOS, branchesKokos);
        MonkeyManager manager1 = new MonkeyManager(new Monkey(Fruit.BANANA),treeBanana);
        MonkeyManager manager2 = new MonkeyManager(new Monkey(Fruit.KOKOS),treeKokos);
        MonkeyManager manager3 = new MonkeyManager(new Monkey(Fruit.ALL),treeKokos);
        manager1.getFruits();
        manager2.getFruits();
        manager3.getFruits();
    }
}
