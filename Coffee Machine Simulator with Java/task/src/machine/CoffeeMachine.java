package machine;

import coffee.Cappuccino;
import coffee.Coffee;
import coffee.Expresso;
import coffee.Latte;

import java.util.Scanner;

public class CoffeeMachine {
    protected static int waterML = 400;
    protected static int milkML = 540;
    protected static int beansG = 120;
    protected static int disposableCups = 9;
    protected static int money = 550;
    protected static int cupsMade = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMachineOn = true;
        while (isMachineOn) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = sc.next();

            if (!action.equals("clean") && cupsMade == 10) {
                System.out.println("I need cleaning!\n");
                continue;
            }

            label:
            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeOption = sc.next();

                    Coffee coffee = null;
                    switch (coffeeOption) {
                        case "1":
                            coffee = new Expresso();
                            break;
                        case "2":
                            coffee = new Latte();
                            break;
                        case "3":
                            coffee = new Cappuccino();
                            break;
                        case "back":
                            System.out.println();
                            break label;
                    }

                    assert coffee != null;
                    String resources = coffee.checkResourceAvailability();
                    if (resources.equals("sufficient")) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterML = coffee.getUpdatedWaterML();
                        milkML = coffee.getUpdatedMilkML();
                        beansG = coffee.getUpdatedBeansG();
                        money = coffee.getUpdatedMoney();
                        disposableCups--;
                        cupsMade++;
                    } else {
                        System.out.printf("Sorry, not enough %s!\n", resources);
                    }

                    System.out.println();
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int waterMLInput = sc.nextInt();

                    System.out.println("Write how many ml of milk you want to add:");
                    int milkMLInput = sc.nextInt();

                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beansGInput = sc.nextInt();

                    System.out.println("Write how many disposable cups you want to add:");
                    int disposableCupsInput = sc.nextInt();

                    System.out.println();
                    fillCoffeeMachine(waterMLInput, milkMLInput, beansGInput, disposableCupsInput);
                    break;

                case "take":
                    takeMoney();
                    break;

                case "clean":
                    cupsMade = 0;
                    System.out.println("I have been cleaned!\n");
                    break;

                case "remaining":
                    System.out.println();
                    printMachineState();
                    break;

                case "exit":
                    isMachineOn = false;
                    break;
            }
        }
    }

    static void printMachineState() {
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                
                """, waterML, milkML, beansG, disposableCups, money);
    }

    static void fillCoffeeMachine(int waterMLInput, int milkMLInput, int beansGInput, int disposableCupsInput) {
        waterML += waterMLInput;
        milkML += milkMLInput;
        beansG += beansGInput;
        disposableCups += disposableCupsInput;
    }

    static void takeMoney() {
        System.out.printf("I gave you $%d\n\n", money);
        money = 0;
    }
}