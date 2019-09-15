public class SecondsInDaygyak {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalseconds= 24*60*60;
        System.out.println("Total secons ind a day: " + totalseconds );
        System.out.println("Remaining seconds from the day = "+ (totalseconds -((currentHours*60*60) +(currentMinutes*60) +(currentSeconds))));

    }
}
