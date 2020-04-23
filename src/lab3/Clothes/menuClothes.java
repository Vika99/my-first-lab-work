package lab3.Clothes;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class menuClothes {
    private Scanner sc = new Scanner(System.in);
    private Clothes[]array = new Clothes[100];
    private int count = 0;
    static String text = "";
    private ClothesFactory factory = new ClothesFactory();
    private ClothesContainer container = new ClothesContainer();
    public void run() throws Exception {
        printHelp();
        int choice = sc.nextInt();
        switch (choice){
            case 1: addelement();break;
            case 2: update();break;
            case 3: delete();break;
            case 4:printAll();break;
            case 5:save();break;
            case 6:load();break;
            case 0:return;
        }
    }

    private void addelement(){
        //container.add(factory.create());
        array[count++] =factory.create();
    }

    private void update(){
        System.out.println("Input index");
        int choice = sc.nextInt();
        //container.update(choice,factory.create());
        array[choice]=factory.create();//еще раз вызываем
    }

    private void printAll(){
        for (int i = 0;i<count;i++){// мы пишем count чтобы не перебирать весь массив!!!!!!
            System.out.println(array[i]);
        }
      /*Clothes[]array = container.getArray();
        for (int i = 0; i < container.size(); i++) {
            System.out.println(array[i]);*/
    }
    private void delete (){
        System.out.println("Input index");
        int choice = sc.nextInt();
        for(int i = choice; i<count-1;i++){// от элемента(choice)который человек выбирает и до предпоследнего элемента
           //и перемещаем элементы в массив, текущий элемент i принимает значение i+1:
            array [i]=array[i+1];

        }
       count--; // уменьшим количество элементов,так как наш размер массива изменился и об этом надо сказать
      //  container.delete(choice);
    }



    private void save () throws Exception{//записываем данные в файл
        if(!(new File("src/lab3/Clothes/ClothesGenericSave").exists())) {//если файла не существует создаём его
            File file = new File("src/lab3/Clothes/ClothesGenericSave");
            file.createNewFile();
            System.out.println("Новый файл создан: src/lab3/Clothes/ClothesGenericSave");
        }
        FileWriter clothesFile = new FileWriter("src/lab3/Clothes/ClothesGenericSave");//запись моих данных в файл
        clothesFile.write(text);
        clothesFile.close();
        System.out.println("Данные записаны: src/lab3/Clothes/ClothesGenericSave");
    }

   /*public void save (String filePath, String FileContent)
    {
        //Создание объекта файла.
        File saveclothes = new File("src/lab3/Clothes/ClothesGenericSave");
        try
        {
            //Если нет директорий в пути, то они будут созданы:
            if (!saveclothes.getParentFile().exists())
                saveclothes.getParentFile().mkdirs(); //mkdirs ----Создает директорию
            //Если файл существует, то он будет перезаписан:
            saveclothes.createNewFile();
            FileOutputStream saveclothes2 = new FileOutputStream(saveclothes);
            OutputStreamWriter myOutWriter = new OutputStreamWriter(saveclothes2);
            myOutWriter.write(FileContent);
            myOutWriter.close();
            saveclothes2.close();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
           -----.setText("Path " + filePath + ", " + e.toString());  //setText метод для записи текста в поле приложение
        }
    }
*/
   private void load   () throws Exception{
       if (new File("src/lab3/Clothes/ClothesGenericSave").exists()) {//если файл существует,то дальше читаем его:
           FileReader clothesFile = new FileReader("src/lab3/Clothes/ClothesGenericSave");
           Scanner scanner = new Scanner(clothesFile);
           int i = 1;
           while (scanner.hasNextLine()) {
               System.out.println(i + " : " + scanner.nextLine());
               i++; //hasNextLine() - метод, который возвращает boolean - true или false, показывая, есть ли следующая строка.
           }
           clothesFile.close();
           }
       }


    private void printHelp(){
        System.out.println("1- add element");
        System.out.println("2- update element");
        System.out.println("3- delete element");
        System.out.println("4- print all element");
        System.out.println("5- save to file");
        System.out.println("6- load from file");
        System.out.println("0- exist");
    }

}
