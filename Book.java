import java.sql.SQLOutput;

public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this("Unknown","Unknown",1.0 );
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
        System.out.println("---------------------------------------------------------------------------------------------");

    }
    public void updatePrice(double newPrice) {
        if(newPrice<0){
            System.out.println("---------------------------------------impossible---------------------------------------");
            this.price = 1.0;
        }
        else{
            this.price = newPrice;
        }

    }
    public void applyDiscount(double Discount){
        if(Discount>=0.00 && Discount<=100.00){
            double discountAmount = this.price*(Discount/100);
            double newPrice = this.price - discountAmount;
            this.price = newPrice;
            System.out.println("Discount applied: " + Discount + "%");
            System.out.println("New price: " + this.price);

        }
        else {
            System.out.println("---------------------------------------Error discount---------------------------------------");
        }

    }
}
