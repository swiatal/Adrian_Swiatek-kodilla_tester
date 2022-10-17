public class Notebook {
    int weight;
    int price;

    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1400) {
            System.out.println("This notebook is expensive.");
        } else if (this.price >= 700 && this.price <= 1300)
            System.out.println("The price is good.");
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is too light.");
        } else if (this.weight > 1800) {
            System.out.println("This notebook is too heavy.");
        } else if (this.weight >= 700 && this.weight <= 1700)
            System.out.println("The weight is good.");
    }

    public void checkYear() {
        int year;
        if (this.year <= 2012) {
            System.out.println("This notebook is old.");
        } else if (this.year >= 2020 && this.year <= 2021) {
            System.out.println("This notebook is fairly recent.");
        } else if (this.year >= 2022) {
            System.out.println("This notebook is new.");
        }
    }
}
