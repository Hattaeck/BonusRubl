public class Main {
    public static void main(String[] args) {
        int initialBill = 100;
        int paymentBill = 1000;
        int bonusRubl;
        if (paymentBill >= 1000) {
            bonusRubl = paymentBill / 100;
        } else {
            bonusRubl = 0;
        }
        int finalBill = initialBill + paymentBill + bonusRubl;
        System.out.println(finalBill);


    }
}