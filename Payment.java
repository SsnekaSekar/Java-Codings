public interface Payment {
    public void makePayment(double amount); 
} 

class CreditCardPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid "+ amount +" using Credit Card");
    }
    
}

class UPIPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid "+ amount +" using UPI");
    }
    
}