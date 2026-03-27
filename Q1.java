class discountCalculator{
    public double calculatePrice(double price){
        return price;
    }
    //discPercent will contain percentage off to be given on the price for eg. 5% off
    public double calculatePrice(double price,double discpercent){
        return price-(price*(discpercent/100));
    }
    //couponPrice will contain the price to be deducted for eg. pkr100 off
    public double calculatePrice(double price,double discpercent,Integer couponPrice){
        return price-(price*(discpercent/100))-couponPrice;
    }
}
public class Q1 {
    public static void main(String[] args) {
        //Object Creation
        discountCalculator Calculator1 = new discountCalculator();
        //case1: Only price 
        double discountedPrice = Calculator1.calculatePrice(1536.5);
        System.out.println(discountedPrice);
        //case2: Price and percentage
        discountedPrice = Calculator1.calculatePrice(1536.5, 2);
        System.out.println(discountedPrice);
        //Case3: Price, Percentage and Coupon code 
        discountedPrice = Calculator1.calculatePrice(1536.5, 2, 150);
        System.out.println(discountedPrice);
    }
}
