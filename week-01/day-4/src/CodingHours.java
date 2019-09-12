public class CodingHours {
    public static void main(String[] args) {
        int avgCodingHours = 6;
        int semesterPeriodInWeeks = 17;
        int workingDays = 5;
        int weeklyWorkHours = 52;
        System.out.println(avgCodingHours * workingDays * semesterPeriodInWeeks );
        System.out.println(((((float)avgCodingHours * workingDays) / weeklyWorkHours ) * 100) + " %");
        //                      (6   *    5) / 52 = 0,57

    }
}
