
package billtesting;
public class studentBilling {
    
    public double calculateBill(double tuitionFee){
        double tax = tuitionFee * 0.14;
        return tuitionFee + tax;
    }
    
    public double calculateBill(double tuitionFee , double txtbooks){
        double total = tuitionFee + txtbooks;
        double tax = total * 0.14;
        return total + tax;
    }
    
    public double calculateBill(double tuitionFee, double txtbooks, double coupon){
        double total = (tuitionFee + txtbooks)- coupon;
        double tax = total * 0.14;
        return total + tax;
    }
    
}
