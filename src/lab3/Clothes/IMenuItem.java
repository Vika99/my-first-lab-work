package lab3.Clothes;

public interface IMenuItem {
    int getOrder();// порядковый номер

    String getTitle(); //что будет конкретно элемент меню

    void execute();//какое действие мы будем выполнять
}

