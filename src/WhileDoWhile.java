public class WhileDoWhile {

    public static void main(String[] args) {

        int counter = 0;

        /*
        while(expresia este adevarata / conditia de oprire) {
            // blocul de cod
        }
         */

        while(counter < 25) {
            System.out.println("WHILE - counter-ul are valoarea: " + counter);
            counter++;
        }

        System.out.println("--------------------------------");

        /*
        do {
        //blocul de cod
        } while(conditia/expresia este adevarata / conditita de oprire);
         */

        counter = 0;

        do {
            System.out.println("DOWHILE - counter-ul are valoarea: " + counter);
            counter++;
        } while(counter < 25);
    }
}
