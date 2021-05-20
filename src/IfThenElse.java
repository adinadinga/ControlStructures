public class IfThenElse {

    public static void main(String[] args) {
        int a = 25;

        if(a == 50) {
            System.out.println("a chiar este 50! -> statement executat in if");
            System.out.println("expresia este adevarata! -> statement executat in if");
        }

        if(a != 50) {
            System.out.println("a este diferit de 50! - linia 12");
        } else {
            System.out.println("a este 50 - ramura else");
        }

        if(a >= 50) {
            System.out.println("a este diferit de 50 - linia 18");
        } else if(a < 25) {
            System.out.println("a este mai mic decat 25 - linia 20");
        } else if(a > 100) {
            System.out.println("a este mai mare decat 100 - linia 22");
        } else {
            System.out.println("Inputul este diferit si neacoperit de conditiile testate in blocurile if-then-else!");
        }

        // operatorul ternar ?:

        System.out.println((a==25) ? "a este 25" : "a nu este 25");

    }
}
