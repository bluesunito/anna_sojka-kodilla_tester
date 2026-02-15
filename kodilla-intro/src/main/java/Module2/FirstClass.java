package Module2;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2000);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.productionYear);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkValue();
        System.out.println("");

        Notebook heavyNotebook = new Notebook(2000, 1500, 2024);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.productionYear);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkValue();
        System.out.println("");

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.productionYear);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkValue();
        System.out.println("");

        Notebook newerNotebook = new Notebook(1200, 1300, 2016);
        System.out.println(newerNotebook.weight + " " + newerNotebook.price + " " + newerNotebook.productionYear);
        newerNotebook.checkPrice();
        newerNotebook.checkWeight();
        newerNotebook.checkValue();
        System.out.println("");

        Notebook overpricedNotebook = new Notebook (1000, 1500, 2014);
        System.out.println(overpricedNotebook.weight + " " + overpricedNotebook.price + " " + overpricedNotebook.productionYear);
        overpricedNotebook.checkPrice();
        overpricedNotebook.checkWeight();
        overpricedNotebook.checkValue();
        System.out.println("");
    }
}


