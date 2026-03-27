class foodApp{
    //Case1: Only price available
    public double finalPrice(double price){
        return price;
    }
    //Case2: Price and delivery distance in kilometer
    final double deliveryFee = 20.0;
    public double finalPrice(double price, int distance){
        return price+(distance*deliveryFee);
    }
    //Case3: Price delivery distance and coupon code 
    final String code = "SAVE10";
    public double finalPrice(double price, int distance, String Ccode){
        double total;
        total = price + (deliveryFee*distance);
        if (Ccode.equals(code)) {
            total -= (total*0.1);
            return total;
        }
        return total;
    }
}
public class Q2 {
    public static void main(String[] args) {
        // Object Creation
        foodApp FA = new foodApp();
        //Case1 with price only
        Double Fprice;
        Fprice = FA.finalPrice(1536.5);
        System.out.println(Fprice);
        //Case2 with price and Distance
        Fprice = FA.finalPrice(1536.5, 3);
        System.out.println(Fprice);
        //Case3 with price, Distance and wrong Coupon
        Fprice = FA.finalPrice(1536.5, 4,"Save10");
        System.out.println(Fprice);
        //Case3 with price, Distance and correct Coupon
        Fprice = FA.finalPrice(1536.5, 3,"SAVE10");
        System.out.println(Fprice);
    }
}
