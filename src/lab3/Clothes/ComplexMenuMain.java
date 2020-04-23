package lab3.Clothes;

public class ComplexMenuMain {
    public static void main(String[] args) {
        ClothesContainer container = new ClothesContainer();
        ClothesFactory factory = new ClothesFactory();

        IMenuItem[] innerMenu = {
                new PrintAllMenuItem(container),
                new PrintAllMenuItem(container)
        };

        IMenuItem[] array = {
                new AddMenuItem(container,factory),
                new DeleteMenuItem(container),
                new PrintAllMenuItem(container),
                new TopLevelMenu(innerMenu, "inner menu", 5)
        };

        new TopLevelMenu(array, "top menu", 0).run();
    }
}

