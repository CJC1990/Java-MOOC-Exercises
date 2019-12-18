
public class Main {

    public static void main(String[] args) {
        // write test code here
        String day = "aeu";
        //System.out.println(allVowels(day));
        String time = "24:5::59";

        System.out.println(clockTime(time));
    }

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("[aeiouäö]*");
    }

    public static boolean clockTime(String string) {
        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        
//      First Attempt        
//        if(!(string.length() < 8)){
//            int start = Integer.parseInt(string.substring(0, 2));
//        String last = string.substring(2);
//        return start < 24 && last.matches(":[0-5][0-9]:[0-5][0-9]");
//        }
//        return false;
    }
}
