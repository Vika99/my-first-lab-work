package lab4строки;

public class lab4number1 {
    //Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
    // Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
    public static void main(String[] args) {
        String s1 = "   Жизнь  полна красоты!   ";
        System.out.println(s1.trim());
        char[] str1Array = s1.toCharArray();
        for(int i = 1; i < str1Array.length; i++) {
         //   if
        }
    }
}

// КАК УДАЛИТЬ ПРОБЕЛЫ МЕЖДУ СЛОВАМИ?