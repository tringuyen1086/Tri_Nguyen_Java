package com.company.factory;

public class IceCream {
    private String flavor;
    private String ingredients;
    private String productionTime;
    private double productionCost;
    private double salePrice;

    public IceCream(String flavor, String ingredients, String productionTime, double productionCost, double salePrice) {
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.productionTime = productionTime;
        this.productionCost = productionCost;
        this.salePrice = salePrice;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String factoryIngredientsShortage(String ingredients) {
        return "The factory is currently out of the " + ingredients;
    }

    public String productionTimeDelay(int hour) {
        return "The production completed time has been extended by " + hour + " hour(s).";
    }

    // current production cost = previous production cost + change
    public double changeInProductionCost (double change){
        double previousProductionCost = this.productionCost;
        double currentProductionCost = this.productionCost + change;
        return currentProductionCost;
//        return "The production cost has changed from $" + previousProductionCost + " to $" + currentProductionCost;
    }

    // revenue per unit = revenue
    public double revenuePerUnitAfterChangeInProductionCost(double changeInProductionCost){
        double currentRevenue = this.salePrice - this.productionCost - changeInProductionCost;
        return currentRevenue;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", productionTime='" + productionTime + '\'' +
                ", productionCost=" + productionCost +
                ", salePrice=" + salePrice +
                '}';
    }
}