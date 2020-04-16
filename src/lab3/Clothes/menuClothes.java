package lab3.Clothes;

import java.util.Arrays;
import java.util.Scanner;
public class menuClothes {
    private Scanner sc = new Scanner(System.in);
    private Clothes[]array = new Clothes[100];
    private int count = 0;
    private ClothesFactory factory = new ClothesFactory();
    private ClothesContainer container = new ClothesContainer();
    public void run(){
        printHelp();
        int choice = sc.nextInt();
        switch (choice){
            case 1: addelement();break;
            case 2: update();break;
            case 3: delete();break;
            case 4:printelements();break;
            case 0:return;
        }
    }

    private void addelement(){
        container.add(factory.create());
        //array[count++] =factory.create();
    }

    private void update(){
        System.out.println("Input index");
        int choice = sc.nextInt();
        container.update(choice,factory.create());
        //array[choice]=factory.create();//еще раз вызываем
    }

    private void delete (){
        System.out.println("Input index");
        int choice = sc.nextInt();
        //for(int i = choice; i<count-1;i++){// от элемента(choice)который человек выбирает и до предпоследнего элемента
        //    //и перемещаем элементы в массив, текущий элемент i принимает значение i+1:
        //    array [i]=array[i+1];

      //  }
      //  count--; // уменьшим количество элементов,так как наш размер массива изменился и об этом надо сказать
        container.delete(choice);
    }

    private void printelements(){
        //for (int i = 0;i<count;i++){// мы пишем count чтобы не перебирать весь массив!!!!!!
         //   System.out.println(array[i]);
        //}
      Clothes[]array = container.getArray();
        for (int i = 0; i < container.size(); i++) {
            System.out.println(array[i]);
        }
    }

    private void printHelp(){
        System.out.println("1- add element");
        System.out.println("2- update element");
        System.out.println("3- delete element");
        System.out.println("4- print all element");
        System.out.println("0- exist");
    }

}
