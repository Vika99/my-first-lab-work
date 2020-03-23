package lab4строки;

public class lab4number6 {
    //Дано слово. Заменить в слове все маленькие латинские буквы от ‘a’ до ‘y’
    // на следующие по алфавиту (для слова “abc2=zx0” получаем “bcd2=zy0”).
    public static void main(String[] args) {
        String text = "abcdEzB12";
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'y') {
                int symbol = ch[i] + 1;
                ch[i] = (char) symbol;
            }
            String result = new String(ch);
            System.out.println(result);
        }
    }
}