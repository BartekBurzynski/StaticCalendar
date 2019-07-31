public class CalandarConverter {

    final static int monday = 1;
    final static int tuesday = 2;
    final static int wendsday = 3;
    final static int thursday = 4;
    final static int friday = 5;
    final static int saturday = 6;
    final static int sunday = 7;


    static String convertDayToString(int dayNumber){
        switch (dayNumber) {
            case monday:
                return "Poniedziałek";

            case tuesday:
                return "Wtorek";

            case wendsday:
                return "Sroda";

            case thursday:
                return "Czwartek";

            case friday:
                return "Piatek";

            case saturday:
                return "Sobota";

            case sunday:
                return "Niedziela";
                default:
                    return "";
        }
    }
}
