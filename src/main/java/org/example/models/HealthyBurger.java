package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtraName1 = "";
    private String healthyExtraName2 = "";
    private double healthyExtraPrice1;
    private double healthyExtraPrice2;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }

    public void addHealthyAddition1(String healthyExtraName1, double healthyExtraPrice1){
        this.healthyExtraName1 = healthyExtraName1;
        this.healthyExtraPrice1 = healthyExtraPrice1;
        super.setPrice(super.getPrice() + healthyExtraPrice1);
    }

    public void addHealthyAddition2(String healthyExtraName2, double healthyExtraPrice2){
        this.healthyExtraName2 = healthyExtraName2;
        this.healthyExtraPrice2 = healthyExtraPrice2;
        super.setPrice(super.getPrice() + healthyExtraPrice2);
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + super.getName());
        System.out.println("Meat: " + super.getMeat());
        System.out.println("BreadRollType: " + super.getBreadRollType());
        if(!super.getAddition1Name().isEmpty()) System.out.println("Addition1: " + super.getAddition1Name());
        if(!super.getAddition2Name().isEmpty()) System.out.println("Addition2: " + super.getAddition2Name());
        if(!super.getAddition3Name().isEmpty()) System.out.println("Addition3: " + super.getAddition3Name());
        if(!super.getAddition4Name().isEmpty()) System.out.println("Addition4: " + super.getAddition4Name());
        if(!healthyExtraName1.isEmpty()) System.out.println("HealtyAddition1: " + healthyExtraName1);
        if(!healthyExtraName2.isEmpty()) System.out.println("HealtyAddition2: " + healthyExtraName2);
        System.out.println("Price: " + (super.getPrice() + super.getAddition1price() + super.getAddition2price() + super.getAddition3price() + super.getAddition4price() + healthyExtraPrice1 + healthyExtraPrice2));

    }
}
