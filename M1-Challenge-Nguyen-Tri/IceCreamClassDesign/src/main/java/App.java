import com.company.factory.IceCream;

public class App {
    public static void main(String[] args) {
        IceCream mangoIceCreamFactory = new IceCream("Pineapple", "pineapple, cream, sugar", "1 day", 0.99, 4.99);
        com.company.pointofsale.IceCream mangoIceCreamSale = new com.company.pointofsale.IceCream("Pineapple", 4.99, 1000, 10, 0.99, 4.99);

        //IceCream - Factory
        System.out.println("The current ice cream flavor in the factory is " + mangoIceCreamFactory.getFlavor());
        System.out.println(mangoIceCreamFactory.factoryIngredientsShortage("pineapple")); //Shortage of Pineapple ingredient
        System.out.println(mangoIceCreamFactory.productionTimeDelay(18));
        System.out.println("The production cost has changed from $" + mangoIceCreamFactory.getProductionCost() + " to $" + mangoIceCreamFactory.changeInProductionCost(0.11));
        System.out.println("After the change in the production cost, the revenue per unit has changed from $" + mangoIceCreamFactory.getSalePrice() + " to $" + mangoIceCreamFactory.revenuePerUnitAfterChangeInProductionCost(0.11));





        //IceCream - Point of Sale
        System.out.println("The current ice cream flavor for sale is " + mangoIceCreamSale.getFlavor());
        System.out.println("The current sale price is " + mangoIceCreamSale.getPrice());
        System.out.println("The current sale quantity is " + mangoIceCreamSale.getQuantity());
        System.out.println("After the discount of " + mangoIceCreamSale.getDiscount() + "%, the new price is $" + mangoIceCreamSale.priceAfterDiscount()); //Sale Discount
        System.out.println("The production cost has changed from $" + mangoIceCreamSale.getProductionCost() + " to $" + mangoIceCreamSale.changeInProductionCost(0.11));
        System.out.println("After the discount, the revenue is $" + mangoIceCreamSale.revenueAfterDiscountOnly());
        System.out.println("After the discount and change in the production cost, the revenue is $" + mangoIceCreamSale.revenueAfterDiscountAndChangeInProductionCost(0.11));



    }
}
