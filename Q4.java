class Delivery{
    protected double deliveryFee = 100;
    public double calculateCost(double orderAmount){
        return deliveryFee;
    }
}
class StandardDelivery extends Delivery{
    @Override
    public double calculateCost(double orderAmount) {
        if (orderAmount > 2000) {
            deliveryFee = 0;
        }
        return super.calculateCost(orderAmount);
    }
}
class ExpressDelivery extends Delivery{
    @Override
    public double calculateCost(double orderAmount) {
        deliveryFee = 200;
        return super.calculateCost(orderAmount);
    }
}
class ScheduledDelivery extends Delivery{
    protected int days;
    ScheduledDelivery(){
        this.days = 1;
    }
    ScheduledDelivery(int Day){
        this.days = Day;
    }
    @Override
    public double calculateCost(double orderAmount) {
        if (this.days == 1) {
            deliveryFee = 150;
        }
        //Normal 100 will be returned as 100 is fixed and set as default so no need of further condition check
        return super.calculateCost(orderAmount);
    }
}
public class Q4 {
    public static void main(String[] args) {
        //Object Creations 
        StandardDelivery SD1 = new StandardDelivery();
        ExpressDelivery ED1 = new ExpressDelivery();
        ScheduledDelivery SchD1 = new ScheduledDelivery();
        ScheduledDelivery SchD2 = new ScheduledDelivery(3);
        //Printing Results 
        System.out.println("Standard Delivery with order below 2000: " + SD1.calculateCost(500));
        System.out.println("Standard Delivery with order above 2000: " + SD1.calculateCost(2500));
        System.out.println("Express Delivery: " + ED1.calculateCost(500));
        System.out.println("Scheduled Delivery with 1 day earlier: " + SchD1.calculateCost(500));
        System.out.println("Scheduled Delivery with more than 1 day earlier: " + SchD2.calculateCost(500));
    }
}
