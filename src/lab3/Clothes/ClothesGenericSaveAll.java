package lab3.Clothes;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ClothesGenericSaveAll <T extends ClothesGenericContainer> {
    public static void main(String[] args) throws IOException {
      FileWriter myFile = null;   // ЭТО СОХРАНЕНИЕ МАССИВА В ФАЙЛ
        BufferedWriter buff = null;
        Clothes[] clothesnew = new Clothes[3];
        clothesnew [0] = new Jeans(30, 34,"abcd","black",80);
        clothesnew [1] = new Jeans(20,34,"defg","pink",80);
        clothesnew [2] = new Jeans(40,34,"tyui","green",80);

        try {
            myFile = new FileWriter("C:\\Users\\laptop\\IdeaProjects\\my-first-lab-works\\src\\lab3\\Clothes\\ClothesGenericSave");
            buff = new BufferedWriter(myFile);
            for (int i=0; i < clothesnew.length; i++) {
                buff.write(clothesnew[i].toString());
                System.out.println("Записывается " + clothesnew[i]);
            }
            System.out.println("Запись файла завершена");

        } finally {
            try {
                buff.flush();
                buff.close();
                myFile.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        // ЗАГРУЗКА ИЗ ФАЙЛА ДАННЫХ
        /*FileReader myFile = null;
        BufferedReader buff = null;
        try {
            myFile = new FileReader("C:\\Users\\laptop\\IdeaProjects\\my-first-lab-works\\src\\lab3\\Clothes\\ClothesGenericSave");
            buff = new BufferedReader(myFile);
            while (true) {
                String line = buff.readLine();
                if (line == null) break;// проверяем достижения конца файла
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
                myFile.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }*/
    }
}