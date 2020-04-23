package lab3.Clothes;

import java.util.Scanner;

public class AddMenuItem implements IMenuItem {
    private Scanner sc = new Scanner(System.in);
    private ClothesContainer container;
    private ClothesFactory factory;
    public AddMenuItem(ClothesContainer container, ClothesFactory factory) {
        this.container = container;
        this.factory=factory;
    }


    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String getTitle() {
        return "Add all element";
    }

    @Override
    public void execute() {
        container.add(factory.create());

    }
}
