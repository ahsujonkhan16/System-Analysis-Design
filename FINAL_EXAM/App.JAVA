

package realization;


public class App {
  
    public static void main(String[] args) {
      
        
        Ipayment payment = new CashPayment();
        payment.dopayment(40);
        
        Ipayment payment1 = new CreditCardPayment();
        payment1.dopayment(100);
        
    }
    
}