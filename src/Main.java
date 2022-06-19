public class Main {
    public static void main(String[] args) {

        int currentAccount = 100;
        int refill = 1111;
        int bonus = refill / 100;

        if (refill >= 1000) {
            System.out.println("Вам начислен бонус " + bonus + "руб. На вашем счете " + (currentAccount + refill + bonus) + " руб.");
        } else {
            System.out.println("Вам начислен бонус 0 руб." + "На вашем счете " + (currentAccount + refill) + " руб.");
        }
    }
}