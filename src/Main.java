public class Main {
    public static void main(String[] args) {
        double account = 100.00;
        double refill = 5000.00;
        int divider = 100;
        int bonus;
        if (refill > 1000) {
            bonus = (int) refill / divider;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + (account + refill + bonus));
        System.out.println("Итоговый бонус: " + bonus);

    }
}