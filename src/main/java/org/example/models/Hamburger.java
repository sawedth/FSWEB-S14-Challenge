package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name = "";
    private String addition2Name = "";
    private String addition3Name = "";
    private String addition4Name = "";
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.meat = meat;
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(){

    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.price = this.price + addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2price;
        this.price = this.price + addition2price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3price;
        this.price = this.price + addition3price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4price;
        this.price = this.price + addition4price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4price() {
        return addition4Price;
    }

    public void itemizeHamburger(){
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);
        if(!addition1Name.isEmpty()) System.out.println("Addition1: " + addition1Name);
        if(!addition2Name.isEmpty()) System.out.println("Addition2: " + addition2Name);
        if(!addition3Name.isEmpty()) System.out.println("Addition3: " + addition3Name);
        if(!addition4Name.isEmpty()) System.out.println("Addition4: " + addition4Name);
        System.out.println("Price: " + (price + addition1Price + addition2Price + addition3Price + addition4Price));
    }
}

