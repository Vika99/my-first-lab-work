package lab3.Clothes.NotSimpleMenu;

import lab3.Clothes.ClothesContainer;

public class PrintAllMenuItem implements IMenuItem {

    private ClothesContainer container;

    public PrintAllMenuItem(ClothesContainer container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 4;
    }

    @Override
    public String getTitle() {
        return "Print all";
    }

    @Override
    public void execute() {

    }
}
