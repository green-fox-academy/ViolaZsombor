import java.util.ArrayList;
import java.util.Arrays;

public class Introduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        ArrayList<String> namelist = new ArrayList();
        //  Print out the number of elements in the list
        System.out.println(namelist.size());
        //Add William to the list
        namelist.add("William");
        /*     Print out whether the list is empty or not*/
        System.out.println("Is the list is empty now? " + namelist.isEmpty());
       /* Add John to the list
        Add Amanda to the list*/
        namelist.add("Amanda");
        namelist.add("John");
        /*      Print out the number of elements in the list*/
        System.out.println(namelist.size());
        /*   Print out the 3rd element*/
        System.out.println(namelist.get(2));
        /*Iterate through the list and print out each name*/
        System.out.println();
        int b = 1;
        for (String i : namelist.toArray(new String[0])) {
            System.out.println(b + ". " + i);
            b++;
            /*Remove the 2nd element*/
        }
        namelist.remove(1);




        String[] namesArray = namelist.toArray(new String[0]);
        for (int i = namelist.size() - 1; i >= 0; i--) {
            System.out.println(namesArray[i]);

            //Remove all elements

            namelist.clear();

        }
    }
}