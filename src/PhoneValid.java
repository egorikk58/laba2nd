public class PhoneValid {
    private static final String _regex = "^(?:\\+7\\d{10}|\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}|8\\d{10}|8\\(\\d{3}\\)\\d{7}|\\d{6}|\\d{2}-\\d{2}-\\d{2})$";
    private boolean _valid = false;
    private String _input;
    public PhoneValid(){
        _input = "";
    }

    public PhoneValid(String input){
        _input = input;
        _valid = input.matches(_regex);
    }

    public boolean GetValid(){
        return _valid;
    }

    public String GetInput(){
        return _input;
    }
}
