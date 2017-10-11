
package billtesting;
import java.util.Scanner;

public class BillTesting {

  
    public static void main(String[] args) {
        
        double tuitionFee,txtbooks,coupon;                                      //variables used ro store input
        
        studentBilling calc = new studentBilling();                             //new student billingobject
        Scanner input = new Scanner(System.in);                                 //new scanner object
        
        System.out.println("Enter tuition Fee: ");
            tuitionFee = input.nextDouble();                                    //input tuition fee
            
        System.out.println("Enter textbook costs: ");
            txtbooks = input.nextDouble();                                      //input textbook costs
            
        System.out.println("Enter Coupon value: ");
            coupon = input.nextDouble();                                        //input coupon value
            
        System.out.println("Tuition fee + tax: " + calc.calculateBill(tuitionFee));
        System.out.println("(Tuition fee + textbook costs) + tax: " + calc.calculateBill(tuitionFee,txtbooks));
        System.out.println("Tuition fee + textbook costs + tax - coupon: " + calc.calculateBill(tuitionFee,txtbooks,coupon));
               
        
      
      
      
      
      
    }
    
}
