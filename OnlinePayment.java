public interface OnlinePayment {
    void pay(double amount);

    void refund(double amount);
}

class PaypalPayment implements OnlinePayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" via PayPal");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs."+amount+" to PayPal account");
    }

}

class GooglePayPayment implements OnlinePayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" via Google Pay");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs."+amount+" to Google Pay account");
    }

}