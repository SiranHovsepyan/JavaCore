package classwork.chapter5;

public class IfElseIf {
    public static void main(String[] args) {
        int month = 9;
        String seasons;
        if (month == 12 || month == 1 || month == 2) {
            seasons = "witnter";
        } else if (month == 3 || month == 4 || month == 5) {
            seasons = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            seasons = "Summer - One love";
        } else if (month == 9 || month == 10 || month == 11) {
            seasons = "Autumn- my birthday";
        } else {
            seasons = "nothing";
        }
        System.out.println("In  " + seasons);
    }
}
