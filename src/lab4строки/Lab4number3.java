package lab4строки;
import java.util.*;// ЭТО ИСПОЛЬЗУЕМ ДЛЯ СОРТИРОВКИ ВЫЗОА ARRAYS
public class Lab4number3 {
    //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
    // если было введено "abc cde def", то должно быть выведено "abcdef"
    public static void main(String[] args) {
        String s3 = "abc cde def";
        StringBuilder sb = new StringBuilder();
        if (!s3.isEmpty()) {
            char[] chars = s3.toCharArray();
            Arrays.sort(chars);
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    System.out.println(sb.append(chars[i]));
                }
            }
        }
    }
}// Сортировка. На каждой итерации сравниваем каждый элемент массива с предыдущим элементом.