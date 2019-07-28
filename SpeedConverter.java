public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(getDurationString(59,59));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid Input");
        } else {
            return zero((minutes) / 60) + " h "+
                    zero((minutes) % 60) + " m "+
                    zero(seconds) + " s ";
        }
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Input";
        } else {
            return getDurationString((seconds / 60),(seconds % 60));
        }
    }
    public static String zero(int contverter){
        if(contverter < 10) {
            return "0" + contverter;
        } else {
            return "" + contverter;
        }
    }
}