

public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String quotetoinsert = "always takes longer than ";

        StringBuilder stringBuilder = new StringBuilder(quote);

        int index = quote.indexOf("you");

        stringBuilder.insert(index, quotetoinsert);

        quote = stringBuilder.toString();

        System.out.println(quote);








        System.out.println(index);







        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
    }
}

