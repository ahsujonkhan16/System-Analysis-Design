

package realization;


public class CreditCardPayment implements Ipayment {
    
    public void dopayment(double amount){
        System.out.println("Payment by Card"+amount);
    }
    
    
}
