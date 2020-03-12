package lab3.Clothes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClothes {
    public static void main(String[] args) {
        Price a = new Priceclothes();
        System.out.println (a.Add(32));
        System.out.println (a.Add(42));
        System.out.println (a.Add(34));
        System.out.println(a.Get(2));// это реализация интрефейса



        Clothes Blouse = new Blouse(" China", 34,  "S2354", "white", 80);
        Clothes Blouse2= new Blouse(" Russia", 34, "S2354", "white", 80);
        System.out.println(Blouse.equals(Blouse2));
        Clothes Jeans = new Jeans("China",  34, "S2356", "black", 60);
        Clothes Jeans2 = new Jeans("China",  34, "S2356", "black", 60);
        System.out.println(Jeans.equals(Jeans2));
        System.out.println("Blouse :" + "manufacture:" + Blouse.getManufacture() + "\t"  + "size:"+ Blouse.getSize()+ "\t"  +"article:"+ Blouse.getArticle()+ "\t" + "color:"+ Blouse.getColor()+ "\t" + "Chaist:"+((Blouse) Blouse).getChest());
        System.out.println("Jeans :" + "manufacture:" + Jeans.getManufacture() + "\t" +  "\t" + "size:"+ Jeans.getSize()+ "\t" +"article:"+ Jeans.getArticle()+ "\t" + "color:"+ Jeans.getColor()+ "\t" + "Waist:"+((Jeans) Jeans).getWaist());
        System.out.println(Blouse);
        System.out.println(Jeans);
        System.out.println(Blouse.hashCode());
        System.out.println(Blouse2.hashCode());
        System.out.println(Jeans.hashCode());
        System.out.println(Jeans2.hashCode());


        Material m1= Material.COTTON;// проверка enum
        Material m2 = Material.SILK;
        System.out.println(m1.ordinal());//--возвращает порядковый номер
        System.out.println(m1.getShmaterial());
        System.out.println(m2.compareTo(m1));
        System.out.println(m2.hashCode());
        System.out.println(m2.toString());
        Material [] materials = Material.values();
        System.out.println(Arrays.toString(materials));
        System.out.println(Material.valueOf("COTTON").ordinal());
    }

}
