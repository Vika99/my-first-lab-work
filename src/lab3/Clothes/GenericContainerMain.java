package lab3.Clothes;
import java.io.*;
import java.util.Arrays;

public class GenericContainerMain {
    public static void main(String[] args) {
        ClothesGenericContainer<String> strs = new ClothesGenericContainer<>();
        strs.add("red");
        String[] array = strs.getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            strs.averagePrice();
        }
    }
}