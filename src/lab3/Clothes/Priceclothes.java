package lab3.Clothes;

public class Priceclothes implements Price {

    int a[] = new int[50];
    int price = 0;

    @Override
    public int Get(int i) {
        return a[i];
    }
    @Override
    public boolean Add(int val) {
        if (price != a.length){
            a[price]=val;
            price++;
            return true;
        }else
        return false;
    }

}
