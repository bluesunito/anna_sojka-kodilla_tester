package Module23;

public class Notebook {
    int weight;
    int price;
    int productionYear;

    public Notebook(int weight, int price, int productionYear){
        this.weight = weight;
        this.price = price;
        this.productionYear = productionYear;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1001) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is rather light.");
        } else if (this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is rather heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkValue() {
        if (this.price < 600) {
            if (this.productionYear > 2020) {
                System.out.println("This is a really good price for such a laptop.");
            } else if (this.productionYear <2020 && this.productionYear > 2015){
                System.out.println("This laptop is rather old but the price makes up for that.");
            } else {
            System.out.println("The price is okay but such an old laptop may no longer be up to par with modern technology.");
        }
        } else if (this.price > 600 && this.price < 1500) {
            if (this.productionYear > 2020) {
                System.out.println("This is a good price for such a laptop.");
            } else if (this.productionYear <2020 && this.productionYear > 2015){
                System.out.println("The price for this laptop is okay but you can probably find something cheaper.");
            } else {
                System.out.println("The price is too high for such an old laptop.");
            }

        } else {
            if (this.productionYear > 2020) {
                System.out.println("It's rather standard price for newer laptops.");
            } else if (this.productionYear <2020 && this.productionYear > 2015){
                System.out.println("That's rather expensive for such an old laptop.");
            } else {
                System.out.println("Someone is trying to rob you. Do not buy it.");
            }
        }
    }
}
