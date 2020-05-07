package lab3.Clothes;

import java.util.HashMap;
import java.util.Objects;

public class Tshirt extends  Clothes {
    private int chest;

    public Tshirt() {
    } // конструктор по умолчанию


    public Tshirt (int price, int size, String article, String color) {

        super(price, size, article, color);
    }

    public Tshirt (int price, int size, String article, String color,  int chest) {
        super(price, size, article, color);
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
        return "Tshirt{" +
                "Chest=" + getChest() + ", " +
                super.toString() +
                "} ";
    }

    public String toProtocolString(){
        return "t|"+chest +"|"+ super.toProtocolString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tshirt)) return false;
        if (!super.equals(o)) return false;
        Tshirt tshirt = (Tshirt) o;
        return getChest() == tshirt.getChest();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getChest());
    }
}