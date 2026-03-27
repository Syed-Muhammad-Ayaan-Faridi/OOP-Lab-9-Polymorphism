class Bill{
    //Case1: Only Units provided 
    public double calculateBill(int units){
        return units*10;
    }
    //Case2: Units and Customer type provided 
    public double calculateBill(int units, String type){
        if (type.equalsIgnoreCase("domestic")) {
            return units*10;
        } else if (type.equalsIgnoreCase("comercial")) {
            return units*15;
        } else {
            System.out.println("Invalid Customer Type entered");
            return 0.0;
        }
    }
    //Case3 : Units and Customer Type and Loyalty Status
    public double calculateBill(int units, String type, String Status){
        double Bill;
        if (type.equalsIgnoreCase("domestic")) {
            Bill = units*10;
        } else if (type.equalsIgnoreCase("comercial")) {
            Bill =units*15;
        } else {
            System.out.println("Invalid Customer Type entered");
            Bill =  0.0;
        }
        if (Status.equalsIgnoreCase("loyal")) {
            Bill -= (Bill*0.05);
        }
        return Bill; 
    }
}
public class Q3 {
    public static void main(String[] args) {
        //Object Creation 
        Bill B1 = new Bill();
        //CASE1: Only Units provided
        System.out.println(B1.calculateBill(211));
        //Case2: Units and Customer type provided 
        System.out.println(B1.calculateBill(211, "DOMESTIC"));
        System.out.println(B1.calculateBill(211, "Comercial"));
        //Case3 : Units and Customer Type and Loyalty Status 
        System.out.println(B1.calculateBill(211, "domestic", "loyal"));
    }
}
