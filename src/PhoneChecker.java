import java.util.ArrayList;

/**
 * Класс для поиски в строке, введенной пользователем, корректных номеров.
 */
public class PhoneChecker {

    /**
     * Регулярное выражение для проверки на соответствие номеру телефона.
     */
    private static final String _regex = "^(\\+7\\d{10}|\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}|8\\d{10}|8\\(\\d{3}\\)\\d{7}|\\d{6}|\\d{2}-\\d{2}-\\d{2})$";

    /**
     * Строка, которую вводит пользователь.
     */
    private String _input;

    /**
     * Конструктор по умолчанию.
     * Задает полю {@link #_input} значение пустой строки.
     */
    public PhoneChecker(){
        _input = "";
    }

    /**
     * Конструктор с параметром.
     * Присваивает полю {@link #_input} строку, введенную пользователем.
     *
     * @param input - строка, введенная пользователем.
     */
    public PhoneChecker(String input){
        _input = input;
    }

    /**
     * Метод для разбиения строки по символу "," и дальнейшей проверки ее элементов на соответствие шаблону номера.
     *
     * @return {@code ArrayList<String>} - возвращает динамический массив корректных номеров.
     */
    public ArrayList<String> SeparateValid(){
        String[] parts = _input.split(",");
        ArrayList<String> valid = new ArrayList<String>();
        for(String i:parts){
            if(i.matches(_regex)){
                valid.add(i);
            }
        }
        return valid;
    }
}
