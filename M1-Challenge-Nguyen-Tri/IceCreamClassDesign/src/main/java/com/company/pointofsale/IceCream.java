package com.company.pointofsale;
public class IceCream {
    private String flavor;
    private double price;
    private int quantity;
    private double discount;

    private double productionCost;
    private double revenue;

    public IceCream(String flavor, double price, int quantity, double discount, double productionCost, double revenue) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.productionCost = productionCost;
        this.revenue = revenue;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    // current price = previous price - (previous price * discount%) = previous price * (1 - discount%);
     public double priceAfterDiscount() {
        double previousPrice = this.price;
        double currentPrice = previousPrice * (1 - (this.discount/ 100));
        return currentPrice;
    }

    // current revenue after discount = current price * quantity;
    public double revenueAfterDiscountOnly(){
        return this.priceAfterDiscount() * this.quantity;
    }

    // current production cost = previous production cost + change;
    public double changeInProductionCost(double change){
        double previousProductionCost = this.productionCost;
        double currentProductionCost = this.productionCost + change;
        return currentProductionCost;
    }

    // after discount and change in production cost, revenue = revenue after discount - new production cost
    public double revenueAfterDiscountAndChangeInProductionCost (double changeInProductionCost){
        double previousRevenue = this.revenueAfterDiscountOnly();
        double newProductionCost = this.productionCost + changeInProductionCost;
        double currentRevenue = previousRevenue - (newProductionCost *this.quantity);
        return currentRevenue;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", productionCost=" + productionCost +
                ", revenue=" + revenue +
                '}';
    }
}
