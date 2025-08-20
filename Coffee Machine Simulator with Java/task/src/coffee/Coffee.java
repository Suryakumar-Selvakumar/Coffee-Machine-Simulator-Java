package coffee;

import machine.CoffeeMachine;

public class Coffee extends CoffeeMachine {
    private final int waterML;
    private final int milkML;
    private final int beansG;
    private final int price;

    public Coffee(int waterML, int milkML, int beansG, int price) {
        this.waterML = waterML;
        this.milkML = milkML;
        this.beansG = beansG;
        this.price = price;
    }


    public int getUpdatedWaterML() {
        return CoffeeMachine.waterML - waterML;
    }

    public int getUpdatedMilkML() {
        return CoffeeMachine.milkML - milkML;
    }

    public int getUpdatedBeansG() {
        return CoffeeMachine.beansG - beansG;
    }

    public int getUpdatedMoney() {
        return CoffeeMachine.money + price;
    }

    public String checkResourceAvailability() {
        if (CoffeeMachine.waterML < waterML) {
            return "water";
        } else if (CoffeeMachine.milkML < milkML) {
            return "milk";
        } else if (CoffeeMachine.beansG < beansG) {
            return "beans";
        } else if (CoffeeMachine.disposableCups == 0) {
            return "cups";
        } else {
            return "sufficient";
        }
    }
}
