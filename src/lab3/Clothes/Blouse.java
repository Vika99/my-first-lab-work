package lab3.Clothes;

import java.util.HashMap;
import java.util.Objects;

public class Blouse extends  Clothes {
    private int chest;

    public Blouse(String manufacture, int size, String article, String color) {
        super(manufacture, size, article, color);
    }

    public Blouse(String manufacture, int size, String article, String color,  int chest) {
        super(manufacture, size, article, color);
        this.chest = chest;

    }
    public int getChest() {
        return chest;
    }
    public void setChest(int chest) {

        this.chest = chest;
    }
    @Override
    public String toString() {
        return "Blouse{" +
                "Chest=" + getChest() + ", " +
                super.toString() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blouse)) return false;
        if (!super.equals(o)) return false;
        Blouse blouse = (Blouse) o;
        return getChest() == blouse.getChest();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getChest());
    }
}