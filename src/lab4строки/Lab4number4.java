package lab4строки;

public class Lab4number4 {
    //Вводится строка. Удалить из нее все пробелы. После этого определить,
    // является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.
    public static void main(String[] args) {
        String pol = "  дед построил шалаш ";
        String s4b = pol.replaceAll(" ", "");
        System.out.println(s4b);

        StringBuilder S4 = new StringBuilder(pol);
        S4.reverse();
        String pol2= S4.toString();
        if (pol.equals(pol2)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");

        }



    }
}
// В чем ошибка? работает если только одно слово дед или шалаш, иначе пишет не полиндром...