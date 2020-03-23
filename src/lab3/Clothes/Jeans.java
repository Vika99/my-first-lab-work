package lab3.Clothes;

import java.util.Objects;

public class Jeans extends Clothes {
    private int waist;

    public Jeans(String manufacture, int size, String article, String color) {
        super(manufacture, size, article, color);
    }

    public Jeans(String manufacture, int size, String article, String color, int waist) {
        super(manufacture, size, article, color);
        this.waist = waist;

    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {

        this.waist = waist;
    }

    @Override
    public String toString() {
        return "Jeans{" +
                "Waist=" + getWaist() + ", " +
                super.toString() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jeans)) return false;
        if (!super.equals(o)) return false;
        Jeans jeans = (Jeans) o;
        return getWaist() == jeans.getWaist();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWaist());
    }
}
   /* public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass()!= o.getClass())
        {
            return false;
        }
        //Jeans jeans =(Jeans)o;
       // return(this.getWaist() == (jeans.getWaist()));
        //&& super.toString() == Jeans.super.toString());///);------как правильно сделать??
    }*/

