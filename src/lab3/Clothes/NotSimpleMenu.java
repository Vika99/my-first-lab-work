package lab3.Clothes;

import java.util.Scanner;

public class NotSimpleMenu {
    private Scanner sc = new Scanner(System.in);
    private ClothesFactory factory = new ClothesFactory();
    private ClothesContainer container = new ClothesContainer();

    public void run() {

        while (true) {
            printHelp();
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addElement(); break;
                case 2: update(); break;
                case 3: delete(); break;
                case 4: printAll(); break;
                case 0: return;
            }
        }
    }

    private void addElement() {
        container.add(factory.create());
    }

    private void update() {
        System.out.println("Input index");
        int choice = sc.nextInt();
        container.update(choice, factory.create());
    }

    private void printAll() {
        Clothes[] array = container.getArray();
        for (int i = 0; i < container.size(); i++) {
            System.out.println(array[i]);
        }
    }

    private void delete() {
        System.out.println("Input index");
        int choice = sc.nextInt();

        container.delete(choice);
    }

    //CRUD - create, read, upd, del
    private void printHelp() {
        System.out.println("1 - add element");
        System.out.println("2 - update element");
        System.out.println("3 - delete element");
        System.out.println("4 - print all");

        System.out.println("0 - exit");
    }
}
