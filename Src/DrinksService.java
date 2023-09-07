public class DrinksService {
    private double totalSum;
    private int countDrinks;

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public int getCountDrinks() {
        return countDrinks;
    }

    public void setCountDrinks(int countDrinks) {
        this.countDrinks = countDrinks;
    }

    public void menu() {
        System.out.println("Drink Menu: ");
        DrinksMachine[] drinks = DrinksMachine.values();
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(i + 1 + ". " + drinks[i] + " price: " + drinks[i].getPrice() + " euro");
        }
        System.out.println("0. EXIT");
    }

    public void calculatePrice(String choice){
        switch (choice.toUpperCase()) {
            case "1":
            case "COFFEE":
                prepareDrink(DrinksMachine.COFFEE);
                totalSum += DrinksMachine.COFFEE.getPrice();
                countDrinks++;
                break;
            case "2":
            case "TEA":
                prepareDrink(DrinksMachine.TEA);
                totalSum += DrinksMachine.TEA.getPrice();
                countDrinks++;
                break;
            case "3":
            case "LEMONADE":
                prepareDrink(DrinksMachine.LEMONADE);
                totalSum += DrinksMachine.LEMONADE.getPrice();
                countDrinks++;
                break;
            case "4":
            case "MOJITO":
                prepareDrink(DrinksMachine.MOJITO);
                totalSum += DrinksMachine.MOJITO.getPrice();
                countDrinks++;
                break;
            case "5":
            case "MINERAL_WATER":
                prepareDrink(DrinksMachine.MINERAL_WATER);
                totalSum += DrinksMachine.MINERAL_WATER.getPrice();
                countDrinks++;
                break;
            case "6":
            case "COCA_COLA":
                prepareDrink(DrinksMachine.COCA_COLA);
                totalSum += DrinksMachine.COCA_COLA.getPrice();
                countDrinks++;
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }
    public void prepareDrink(DrinksMachine drink){
        System.out.println("preparing drink: " + drink);
    }
}
