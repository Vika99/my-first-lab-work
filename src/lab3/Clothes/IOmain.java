package lab3.Clothes;
import java.io.*;
import java.util.ArrayList;

    public class IOmain {
        public static void main(String[] args) throws IOException {
            FileWriter myFile = null;
            BufferedWriter buff = null;
            String[] clothes = new String[5];
            // добавим в список ряд элементов
            clothes[0] = "Blouse";
            clothes[1] = "Blouse1";
            clothes[2] = "Jeans";
            clothes[3] = "Jeans1";
            try {
                myFile = new FileWriter("C:\\Users\\laptop\\IdeaProjects\\my-first-lab-works\\src\\lab3\\Clothes\\Clothes");
                buff = new BufferedWriter(myFile);
                {
                    for (int i = 0; i < clothes.length; i++) {
                        // запись строк из массива в файл scores2.txt
                        buff.write(clothes[i]);
                        System.out.println("select element");
                        System.out.println(clothes[i]);
                    }
                    //...........................КАК ЭТО ВСЕ ЗАПИСАТЬ В ДОКУМЕНТ CLOTHES???
                    /* for (String Blouse : clothes) {
                       System.out.println(Blouse);
                    }
                     clothes.add(1, "Blouse"); // добавляем элемент по индексу 1
                     System.out.println(" update clothes:"+ clothes.get(1));// получаем 2-й объект
                       clothes.set(1, "Jeans"); // установка нового значения для 2-го объекта


                      for (String Blouse : clothes) {
                        System.out.println(Blouse);
                    }
                    // проверяем наличие элемента
                    if (clothes.contains("Blouse")) {

                        System.out.println("ArrayList contains Blouse");
                    } else System.out.println("there are no such clothes");

                    // удалим несколько объектов
                    // удаление конкретного элемента
                    System.out.println("Delete clothes:" + clothes.remove("Blouse1"));
                   //  удаление по индексу
                    System.out.println("Delete clothes:" + clothes.remove(0));

                    Object[] clothesArray = clothes.toArray();
                      for (Object Blouse : clothesArray) {

                      System.out.println(Blouse);
                }
                */
                }
                } finally{

                    try {
                        buff.flush();
                        buff.close();
                        myFile.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }









           /* System.out.println(System.in.getClass());

            FileWriter myFile = null;
            BufferedWriter buff = null;
            String[] clothes = new String[4];
            // заполнение массива результатами игры
            clothes [0] = "Blouse\n";
            clothes [1] = "Blouse2\n ";
            clothes [2] = "Jeans\n";
            clothes [3] = "Jeans2\n";

            try {
                myFile=new FileWriter("C:\\Users\\laptop\\IdeaProjects\\my-first-lab-works\\src\\lab3\\Clothes\\Clothes");
                buff = new BufferedWriter(myFile);
                for (int i=0; i < clothes.length; i++) {
                    // запись строк из массива в файл scores2.txt
                    buff.write(clothes[i]);
                    System.out.println("Записывается " + clothes[i] );
                }
                System.out.println("Запись файла завершена");
            } finally {
                try{
                    buff.flush();
                    buff.close();
                    myFile.close();
                }catch(IOException e1){
                    e1.printStackTrace();
                }
            }
        } // конец метода main
    */








































    //public static void main(String[] args) throws IOException {
      //  IOmain c = new IOmain();
      //  c.read();
       // String s;
       // StringBuilder sb = new StringBuilder();
        // InputStreamReader
          //  String path = "C:\\Users\\laptop\\IdeaProjects\\my-first-lab-works\\src\\lab3\\Clothes\\Clothes";
          ///  try (Writer writer = new OutputStreamWriter(new FileOutputStream(path), "UTF8")) {
           //     writer.write("i have little success!");
               // int data = reader.read();
               // while (data != -1) {
               //     sb.append((char) data);
               //     data = reader.read();
               // }
              //  System.out.println(sb);
           // }


        //}

           // IOmain c = new IOmain();
             //c.read();








