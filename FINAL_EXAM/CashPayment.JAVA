

package realization;


public class CashPayment implements Ipayment{
    
 
   
    public void dopayment(double amount){
        System.out.println("Payment by Cash"+amount);
    }
    
}