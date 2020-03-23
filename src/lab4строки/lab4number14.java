package lab4строки;
// №14!!!!!!Дан текст. Заменить все цифры соответствующими словами
public class lab4number14 {
    public static void main(String[] args) {
        StringBuilder s14 = new StringBuilder("Чтоб удавались все твои дела, а жизнь всегда искрилась позитивом, ты установку дай себе с утра: Я 1, 2 И 3!");
        s14.replace(98,99,"СЧАСТЛИВ");
        s14.replace(108,109,"УСПЕШЕН");
        s14.replace(118,119,"КРАСИВ");
        System.out.println(s14);

    }
}