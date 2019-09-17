public class ToDoPrint {
        public static void main(String... args){

            // Add "My todo:" to the beginning of the todoText
            // Add " - Download games" to the end of the todoText
            // Add " - Diablo" to the end of the todoText but with indention

            // Expected outpt:

            // My todo:
            //  - Buy milk
            //  - Download games
            //      - Diablo

            String todoText = " - Buy milk\n";

            String firstchange = "My todo:\n";
            String finalText = firstchange.concat(todoText).concat(" - Download games\n").concat("   - Diablo");


            System.out.println(finalText);
        }
    }

