package lab3.Clothes;

import java.util.Scanner;

public class AddMenuItem implements IMenuItem {
    private Scanner sc = new Scanner(System.in);
    private ClothesContainer container;

    public AddMenuItem(ClothesContainer container) {
        this.container = container;
    }
     private ClothesFactory factory;

    public AddMenuItem(ClothesFactory factory) {
        this.factory = factory;
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


    }
}
