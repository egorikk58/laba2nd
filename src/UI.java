import java.util.Scanner;
import java.util.ArrayList;
public class UI {
    private static final Scanner _in = new Scanner(System.in);

    private String _PhoneNumbersLine;

    private ArrayList<PhoneValid> _stringlist = new ArrayList<>();

    public UI(){}

    public void takeNumbers(){
        System.out.println("Введите строку");
        _PhoneNumbersLine = _in.nextLine();
        for(String i: _PhoneNumbersLine.split(",")){
            _stringlist.add(new PhoneValid(i));
        }
    }

    public void printValid(){
        System.out.println("Корректные номера");
        for(PhoneValid i:_stringlist){
            if(i.GetValid()){
                System.out.println(i.GetInput());
            }
        }
    }

    public void run(){
        takeNumbers();
        printValid();
    }
}
