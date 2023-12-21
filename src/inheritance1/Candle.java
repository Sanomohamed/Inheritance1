
package inheritance1;


public class Candle {
    String color;
    double height,price;

    public Candle(String color, double height) {
        this.color = color;
        this.height = height;
        this.price = 2*height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price=2*height;
    }

    public double getPrice() {
        return price;
    }

   
    
}
