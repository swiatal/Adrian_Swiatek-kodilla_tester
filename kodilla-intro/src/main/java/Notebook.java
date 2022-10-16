public class Notebook {
    static int weight;
    static int price;

    static int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (Notebook.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (Notebook.price > 1400) {
            System.out.println("This notebook is expensive.");
        } else if (Notebook.price >= 700 && Notebook.price <= 1300)
            System.out.println("The price is good.");
    }

    public void checkWeight() {
        if (Notebook.weight <= 600) {
            System.out.println("This notebook is too light.");
        } else if (Notebook.weight > 1800) {
            System.out.println("This notebook is too heavy.");
        } else if (Notebook.weight >= 700 && Notebook.weight <= 1700)
            System.out.println("The weight is good.");
    }

    public void checkYear() {
        int year;
        if (Notebook.year <= 2012) {
            System.out.println("This notebook is old.");
        } else if (Notebook.year >= 2020 && Notebook.year <= 2021) {
            System.out.println("This notebook is fairly recent.");
        } else if (Notebook.year >= 2022) {
            System.out.println("This notebook is new.");
        }
    }
}
