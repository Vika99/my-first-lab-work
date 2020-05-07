package lab3.Clothes;
import java.util.ArrayList;
import java.util.List;
public class Clothesgeneric {
    public static void main(String[] args) {
        List<Clothes> listOfClothes = new ArrayList<>();
        listOfClothes.add(new Clothes());
        listOfClothes.add(new Clothes());
        listOfClothes.add(new Clothes());
        listOfClothes.add(new Clothes());

        List<Jeans> listOfJeans = new ArrayList<>();
        listOfJeans.add(new Jeans());
        listOfJeans.add(new Jeans());//
        List<Tshirt> listOfTshirt = new ArrayList<>();
        listOfTshirt.add(new Tshirt());

        test(listOfClothes);
       test(listOfJeans);
       test(listOfTshirt);

    }
    private static void test (List<? extends Clothes> list){
        for (Clothes clothes: list){
            System.out.println(clothes);
        }
    }
}