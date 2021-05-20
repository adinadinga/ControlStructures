public class SwitchStatement {

    public static void main(String[] args) {

        int dayOfWeek = 7;
        /*
        0 - Luni
        1 - Marti
        2 - Miercuri
        3 - Joi
        4 - Vineri
        5 - Sambata
        6 - Duminica
         */
        switch(dayOfWeek) {
            case 0:
                System.out.println("Luni");
                System.out.println("Inceput de saptamana!");
                break;
            case 1:
                System.out.println("Marti");
                break;
            case 2:
                System.out.println("Miercuri");
                break;
            case 3:
                System.out.println("Joi");
                break;
            case 4:
                System.out.println("Vineri");
                break;
            case 5:
                System.out.println("Sambata");
                break;
            case 6:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Ce zi e asta?");
        }
    }
}
