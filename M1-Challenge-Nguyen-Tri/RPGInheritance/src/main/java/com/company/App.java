package com.company;

public class App {
    public static void main(String[] args) {

        //Farmer
        Farmer farmerFarm = new Farmer("Farm", 75, 100, 75, 10, 1, false, false, false, false);
        System.out.println(farmerFarm.greeting());
        System.out.println(farmerFarm.attacks("warrior Warr") + " for self-defense" + "!");
        System.out.println("========== ========== ========== ========== ========== ========== ==========");

        //Constable
        Constable constableConst = new Constable("Const", 60, 100, 60, 20, 5, false, false, "jurisdiction");
        System.out.println(constableConst.greeting());
        System.out.println("Because warrior Warr attacked farmer Farm, " + constableConst.arrest("warrior Warr") + "!");
        System.out.println(constableConst.jurisdiction("warrior Warr"));
        System.out.println("========== ========== ========== ========== ========== ========== ==========");


        //Warrior
        Warrior warriorWarr = new Warrior("Warr", 75, 100, 100, 50, 10, false, false, 100);
        System.out.println(warriorWarr.greeting());
        System.out.println(warriorWarr.attacks("farmer Farm") + "!");
        System.out.println("========== ========== ========== ========== ========== ========== ==========");
    }
}
