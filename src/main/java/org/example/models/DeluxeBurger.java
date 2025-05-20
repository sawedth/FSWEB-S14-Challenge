package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips = "CURVY";
    private String drink = "COKE";

    public DeluxeBurger(String meat, String name, double price, String breadRollType) {
        super(meat, name, price, breadRollType);
    }

    public DeluxeBurger(){
        super.setMeat("Double");
        super.setName("Deluxe Burger");
        super.setBreadRollType("Double Sandwich");
        super.setPrice(19.1);
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
