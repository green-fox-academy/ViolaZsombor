public class CodingHoursgyak {
    public static void main(String[] args) {
        int avgweeklycodinghrs = 5 * 6;
        System.out.println("how many hours is spent with coding in a semester by an attendee? " + (avgweeklycodinghrs* 17) + " hours in total");
        System.out.println("Print the percentage of the coding hours in the semester! the answer is " +Math.round((avgweeklycodinghrs /52.) *100) + " %" );
    }
}
