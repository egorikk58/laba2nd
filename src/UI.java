import java.util.Scanner;

/**
 * Класс пользовательского интерфейса.
 */
public class UI {

    /**
     * Объект класса {@code Scanner}, с помощью которого реализован ввод строки пользователем.
     */
    private static final Scanner _in = new Scanner(System.in);

    /**
     * Конструктор по умолчанию.
     */
    public UI(){}

    /**
     * Метод, который выводит данные о лабораторной работе.
     */
    public void printInfo(){
        System.out.println("Лабораторная работа 2");
        System.out.println("Выполнили: Андреев, Костиневич. Группа: 23ВП2");
        System.out.println("Составить регулярное выражение для проверки поля «Телефон».");
        System.out.println("Допустим, будем считать верными следующие форматы номера телефона:");
        System.out.println("+7xxxxxxxxxx, +7(xxx)xxx-xx-xx, 8xxxxxxxxxx, 8(xxx)xxxxxxx, xxxxxx, xx-xx-xx");
    }

    /**
     * Запрашивает ввод строки у пользователя.
     * Сообщает пользователю, если он ввел пустую строку.
     * Вызывает метод, проверяющий на корректность ввода номеров телефона, если строка не пуста.
     */
    public void GetString(){
        System.out.println("Введите строки, проверяемые на соответствие номерам, через запятую");
        String inp = _in.nextLine();
        if(inp.isEmpty()){
            System.out.println("Строка не должна быть пустой.");
            return;
        }
        printValid(inp);
    }

    /**
     * Создает объект класса {@code PhoneChecker} для поиска корректных номеров в строке.
     * Выводит корректные номера
     *
     * @param inp - строка, введенная пользователем.
     */
    public void printValid(String inp){
        PhoneChecker numbers = new PhoneChecker(inp);
        if(numbers.SeparateValid().isEmpty()){
            System.out.println("Введенная строка не содержит корректных номеров");
            return;
        }
        System.out.println("Корректные номера");
        for(String i:numbers.SeparateValid()){
            System.out.println(i);
        }
    }

    /**
     * Запускает основной алгоритм работы программы.
     * Сначала выводится информация о лабораторной работе.
     * Затем осуществляется ввод строк и проверка их на соответствие формату телефонных номеров.
     * Ввод строк производится в бесконечном цикле, чтобы пользователь мог проверить столько строк, сколько ему нужно.
     */
    public void run(){
        printInfo();
        while (true){
            GetString();
        }
    }
}
