package lab3.Clothes.MenuWithGeneric;

import lab3.Clothes.Clothes;
import lab3.Clothes.ClothesFactory;

public class MainMenuGeneric {
    public static void main(String[] args) {
        Factory<Clothes> factory= new ClothesFactory();
        GenericContainer<Clothes> container = new GenericContainer<>();

        // Создаем верхнеуровн. меню!
        MenuItem<Clothes>[] items= new MenuItem[3];
        items[0]=new AddMenuItem<>(container, factory);
        items[1] = new Delete<>(container);
        items[2] = new PrintAll<>(container);
        TopLevelMenu<Clothes> clothesMenu = new TopLevelMenu<>(items, "clothes menu", 0);
        clothesMenu.execute();
    }
}
