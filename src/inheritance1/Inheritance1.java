
package inheritance1;

public class Inheritance1 {

    
    public static void main(String[] args) {
        Candle candle = new Candle("Red", 5.0);

        System.out.println("Candle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());
        System.out.println();

        ScentedCandle scentedCandle = new ScentedCandle("Blue", 4.0, "Vanilla");

        System.out.println("Scented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
    }
    
}
