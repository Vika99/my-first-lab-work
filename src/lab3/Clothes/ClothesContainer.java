package lab3.Clothes;

public class ClothesContainer {
    private Clothes[] array = new Clothes[10];
    private int count = 0;

    public void add(Clothes element) {
        if (count == array.length) {
            Clothes[] newarray = new Clothes[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, newarray, 0, count);
            array = newarray;
        }
        array[count++] = element;

    }

    public void update(int index, Clothes element) {
        array[index] = element;
    }

    public void delete(int index) {
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public Clothes[] getArray() {
        return array;
    }

    public int size() {
        return count;
    }

  /*  public void averagePrice() {
        double average = 0;
        if (clothes[i].getPrice() > 0) {
            double sum = 0;
            for (int i = 0; i < clothes[i].getPrice.length; i++) {
                sum += clothes[i].getPrice.lenght;
            }
            average = sum / clothes[i].getPrice.length;
            System.out.println(average);
        }
    }*/
}