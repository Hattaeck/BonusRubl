public class Main {
    public static void main(String[] args) {
        int initialBill = 200;
        int paymentBill = 500;
        int bonusRubl;
        if (paymentBill >= 500) {
            bonusRubl = paymentBill / 200;
        } else {
            bonusRubl =0;
        }
        int finalBill = initialBill + paymentBill + bonusRubl;
        System.out.println(finalBill);


        }
    }