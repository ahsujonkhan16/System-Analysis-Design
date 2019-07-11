package online_sopping;


public class Online_Sopping {

  
    public static void main(String[] args) {
        
        
        Admin admin = new Admin();
        
        admin.name = "ABU_HASAM_SUJON";
        
        System.out.println(admin);

        
        Address address = new Address("Demra","Dhaka","Staff_Quarter","Demra");
        
        Customer customer = new Customer("ABU_HASAM_SUJON",address);
        
        System.out.println(customer);
        
        
    }
    
}