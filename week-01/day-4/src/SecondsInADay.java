public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int sumseconds = ((currentHours * 60) + currentMinutes) * 60 + currentSeconds;
        int alldayseconds = (24*60*60);
        System.out.println(alldayseconds-sumseconds);


    }
}