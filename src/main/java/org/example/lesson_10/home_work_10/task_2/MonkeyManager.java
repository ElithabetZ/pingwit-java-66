package org.example.lesson_10.home_work_10.task_2;

public class MonkeyManager {
    private Monkey monkey;
    private Tree tree;

    public MonkeyManager(Monkey monkey, Tree tree) {
        this.monkey = monkey;
        this.tree = tree;
    }

    public void getFruits() {
        if (monkey.getTypeOfMonkey() == Fruit.ALL) {
            System.out.println(tree.getFruits());
        } else {
            if (monkey.getTypeOfMonkey() == tree.getName()) {
                System.out.println(tree.getFruits());
            } else {
                System.out.println("Oppps... Wrong monkey");
            }
        }
    }
}
